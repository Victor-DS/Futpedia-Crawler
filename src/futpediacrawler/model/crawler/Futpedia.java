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
package futpediacrawler.model.crawler;

import com.google.gson.Gson;
import futpediacrawler.model.exceptions.PageNotFoundException;
import futpediacrawler.model.wrappers.ResultadoListaCampeonatos;
import futpediacrawler.model.util.Util;
import futpediacrawler.model.wrappers.ResultadoCampeonato;
import java.io.IOException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Victor Santiago
 */
public class Futpedia implements Crawler{
    
    private final int LISTA_CAMPEONATOS = 0;
    private final int CAMPEONATO = 1;
    private final int TIME = 2;
    
    private final String BASE_CAMPEONATO = "http://futpedia.globo.com/campeonato/";
    
    private final String BRASILEIROS = BASE_CAMPEONATO + "brasileiro";
    
    private final String CARIOCA = BASE_CAMPEONATO + "campeonato-carioca";
    
    private final String PAULISTA = BASE_CAMPEONATO + "campeonato-paulista";

    private final String COPA_AMERICA = BASE_CAMPEONATO + "copaamerica";

    private final String CONFEDERACOES = BASE_CAMPEONATO + "copa-confederacoes";

    private final String COPA_BRASIL = BASE_CAMPEONATO + "copa-do-brasil";

    private final String COPA_MUNDO = BASE_CAMPEONATO + "copa-do-mundo";

    private final String MUNDIAL_CLUBES = BASE_CAMPEONATO + "mundial-de-clubes";

    private final String LIBERTADORES = BASE_CAMPEONATO + "taca-libertadores";

    private final String RIO_SAO_PAULO = BASE_CAMPEONATO + "torneio-rio-sao-paulo";

    public Futpedia() {}

    @Override
    public ResultadoListaCampeonatos getBrasileiroUnificado() 
            throws IOException, PageNotFoundException, Exception {
        return getListaDeCampeonatosResultado(BRASILEIROS);
    }

    @Override
    public ResultadoListaCampeonatos getCampeonatoCarioca() throws Exception {
        return getListaDeCampeonatosResultado(CARIOCA);
    }

    @Override
    public ResultadoListaCampeonatos getCampeonatoPaulista() throws Exception {
        return getListaDeCampeonatosResultado(PAULISTA);
    }

    @Override
    public ResultadoListaCampeonatos getCopaAmerica() throws Exception {
        return getListaDeCampeonatosResultado(COPA_AMERICA);
    }

    @Override
    public ResultadoListaCampeonatos getCopaDasConfederacoes() throws Exception {
        return getListaDeCampeonatosResultado(CONFEDERACOES);
    }

    @Override
    public ResultadoListaCampeonatos getCopaDoBrasil() throws Exception {
        return getListaDeCampeonatosResultado(COPA_BRASIL);
    }

    @Override
    public ResultadoListaCampeonatos getCopaDoMundo() throws Exception {
        return getListaDeCampeonatosResultado(COPA_MUNDO);
    }

    @Override
    public ResultadoListaCampeonatos getMundialDeClubes() throws Exception {
        return getListaDeCampeonatosResultado(MUNDIAL_CLUBES);
    }

    @Override
    public ResultadoListaCampeonatos getLibertadores() throws Exception {
        return getListaDeCampeonatosResultado(LIBERTADORES);
    }

    @Override
    public ResultadoListaCampeonatos getTorneioRioSaoPaulo() throws Exception {
        return getListaDeCampeonatosResultado(RIO_SAO_PAULO);
    }
    
    @Override
    public ResultadoCampeonato getDetalhesCampeonato(String url) throws Exception {
        return getCampeonatoResultado(url);
    }
        
    private ResultadoListaCampeonatos getListaDeCampeonatosResultado(String link)
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
    
    private ResultadoCampeonato getCampeonatoResultado(String link) 
            throws IOException, PageNotFoundException, Exception {
        String html = Util.getHTML(new URL(link));
        
        if(html.contains("Globo.com - Desculpe-nos, página não encontrada"))
            throw new PageNotFoundException("Página não encontrada: " 
                    + link);
        
        Pattern p = Pattern.compile("RESUMO_EDICAO = (.*?);");
        Matcher m = p.matcher(html);
        
        String json = null;
        if(m.find())
            json = m.group(1);
        
        if(json == null)
            throw new Exception("Dados não encontrados, HTML: " + html);
        
        json = fixCampeonatoString(json);
                        
        Gson gson = new Gson();
        return gson.fromJson(json.trim(), ResultadoCampeonato.class);
    }
    
    private String fixCampeonatoString(String s) {
        return s.replace("JOGOS:", "\"jogos\":")
                .replace("EQUIPES:", "\"equipes\":")
                .replace("SEDES:", "\"sedes\":")
                .replace("FASES:", "\"fases\":");
    }
}
