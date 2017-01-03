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
import futpediacrawler.model.jsonmodel.Resultado;
import futpediacrawler.model.util.Util;
import java.io.IOException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Victor Santiago
 */
public class Futpedia implements Crawler{
    
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
    public Resultado getBrasileiroUnificado() 
            throws IOException, PageNotFoundException, Exception {
        return getCampeonatoResultado(BRASILEIROS);
    }

    @Override
    public Resultado getCampeonatoCarioca() throws Exception {
        return getCampeonatoResultado(CARIOCA);
    }

    @Override
    public Resultado getCampeonatoPaulista() throws Exception {
        return getCampeonatoResultado(PAULISTA);
    }

    @Override
    public Resultado getCopaAmerica() throws Exception {
        return getCampeonatoResultado(COPA_AMERICA);
    }

    @Override
    public Resultado getCopaDasConfederacoes() throws Exception {
        return getCampeonatoResultado(CONFEDERACOES);
    }

    @Override
    public Resultado getCopaDoBrasil() throws Exception {
        return getCampeonatoResultado(COPA_BRASIL);
    }

    @Override
    public Resultado getCopaDoMundo() throws Exception {
        return getCampeonatoResultado(COPA_MUNDO);
    }

    @Override
    public Resultado getMundialDeClubes() throws Exception {
        return getCampeonatoResultado(MUNDIAL_CLUBES);
    }

    @Override
    public Resultado getLibertadores() throws Exception {
        return getCampeonatoResultado(LIBERTADORES);
    }

    @Override
    public Resultado getTorneioRioSaoPaulo() throws Exception {
        return getCampeonatoResultado(RIO_SAO_PAULO);
    }
        
    private Resultado getCampeonatoResultado(String link)
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
                
        return gson.fromJson(json.trim(), Resultado.class);
    }

}
