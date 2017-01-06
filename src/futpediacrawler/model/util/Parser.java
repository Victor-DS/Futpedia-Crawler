/*
 * The MIT License
 *
 * Copyright 2017 Victor Santiago.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package futpediacrawler.model.util;

import com.google.gson.Gson;
import futpediacrawler.model.crawler.Futpedia;
import futpediacrawler.model.exceptions.PageNotFoundException;
import futpediacrawler.model.simplificado.Partida;
import futpediacrawler.model.wrappers.CampeonatoSimples;
import futpediacrawler.model.wrappers.ResultadoCampeonato;
import futpediacrawler.model.wrappers.ResultadoListaCampeonatos;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Toda a lógica para extrair os dados do HTML do Futpedia está aqui.
 * 
 * @author Victor Santiago
 */
public class Parser {
    
    public static ResultadoListaCampeonatos getListaDeCampeonatosResultado(String link)
        throws IOException, PageNotFoundException, Exception {
        String html = Util.getHTML(new URL(link));
        
        if(html.contains("Globo.com - Desculpe-nos, página não encontrada"))
            throw new PageNotFoundException("Página não encontrada: " 
                    + link);        
        
        Pattern p = Pattern.compile("dados = (.*?);");
        Matcher m = p.matcher(html);
        
        String json = null;
        if(m.find())
            json = m.group(1);
        
        if(json == null)
            throw new Exception("Dados não encontrados, HTML: " + html);
                
        Gson gson = new Gson();
                
        return gson.fromJson(json.trim(), ResultadoListaCampeonatos.class);
    }
        
    public static String fixCampeonatoString(String s) {
        return s.replace("JOGOS:", "\"jogos\":")
                .replace("EQUIPES:", "\"equipes\":")
                .replace("SEDES:", "\"sedes\":")
                .replace("FASES:", "\"fases\":");
    }
    
    public static CampeonatoSimples getCampeonatoSimplificado(String link) 
            throws MalformedURLException, IOException, PageNotFoundException {
        String html = Util.getHTML(new URL(link));
        
        if(html.contains("Globo.com - Desculpe-nos, página não encontrada"))
            throw new PageNotFoundException("Página não encontrada: " 
                    + link);

        try {
            ResultadoCampeonato rc = getRawCampeonato(html);
            return Conversor.toCampeonatoSimples(rc, 
                    getCampeonatoSimplesSemPartidas(html));
        } catch(IllegalArgumentException e) {
            System.out.println("Não encontrou Javascript... Puxando do HTML...");
        }
        
        return manualHTMLParser(html);
    }
    
    public static ResultadoCampeonato getRawCampeonato(String html) 
            throws IllegalArgumentException {
        Pattern p = Pattern.compile("RESUMO_EDICAO = (.*?);");
        Matcher m = p.matcher(html);
        
        String json = null;
        if(m.find())
            json = m.group(1);
        
        if(json == null)
            throw new IllegalArgumentException("Dados não encontrados, HTML: " + html);
        
        json = fixCampeonatoString(json);
                        
        Gson gson = new Gson();
        return gson.fromJson(json.trim(), ResultadoCampeonato.class);
    }
    
    public static CampeonatoSimples manualHTMLParser(String HTML) 
            throws PageNotFoundException {
        CampeonatoSimples cs = getCampeonatoSimplesSemPartidas(HTML);
        cs.setPartidas(getPartidas(HTML));
        return cs;
    }
    
    private static CampeonatoSimples getCampeonatoSimplesSemPartidas(String HTML) 
            throws PageNotFoundException {
        if(HTML.contains("Globo.com - Desculpe-nos, página não encontrada"))
            throw new PageNotFoundException("Página não encontrada");
        
        CampeonatoSimples cs = new CampeonatoSimples();
        Document doc = Jsoup.parse(HTML);
        
        String title = doc.head().getElementsByTag("title").text();
        cs.setNome(title.replace(" | futpedia.globo.com", ""));
        
        String description = doc.select("meta[property=og:description]").attr("content");
        cs.setDescricao(description);
        
        String campeao = doc.select("div.nome-campeao.top7 > a").first().text();
        cs.setCampeao(campeao);
        
        Pattern p = Pattern.compile("[0-9][0-9][0-9][0-9]");
        Matcher m = p.matcher(title);
                
        if(m.find())
            cs.setAno(Integer.parseInt(m.group(0)));
        else
            System.out.println("Não achou o ano! String: " + title);
        
        return cs;
    }
    
    public static List<Partida> getPartidas(String HTML) {
        List<Partida> partidas = new ArrayList<>();
        
        Document doc = Jsoup.parse(HTML);
        Elements jogos = doc.select("li.lista-classificacao-jogo");
        
        Partida currentJogo;
        Element timePlacar;
        for(Element jogo : jogos) {
            currentJogo = new Partida();
            
            timePlacar = jogo.select("div.info-jogo").first();

            String mandante = timePlacar.select("div.time.mandante").first()
                    .select("meta").first().attr("content");
            currentJogo.setCasa(mandante);
            
            String visitante = timePlacar.select("div.time.visitante").first()
                    .select("meta").first().attr("content");
            currentJogo.setVisitante(visitante);
            
            String placarCasa = timePlacar.select("div.placar").first()
                    .select("span.mandante.font-face").first().text();
            currentJogo.setGolsCasa(Integer.parseInt(placarCasa));
            
            String placarVisitante = timePlacar.select("div.placar").first()
                    .select("span.visitante.font-face").first().text();
            currentJogo.setGolsVisitante(Integer.parseInt(placarVisitante));
                        
            String dia = jogo.getElementsByTag("time").first().attr("datetime");
            
            try {
                currentJogo.setData(dia);
            } catch (ParseException ex) {
                Logger.getLogger(Futpedia.class.getName())
                        .log(Level.SEVERE, null, ex);
            }
            
            partidas.add(currentJogo);
        }
        
        return partidas;
    }
    
}
