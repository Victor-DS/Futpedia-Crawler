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

import futpediacrawler.model.exceptions.PageNotFoundException;
import futpediacrawler.model.util.Parser;
import futpediacrawler.model.wrappers.CampeonatoSimples;
import futpediacrawler.model.wrappers.ResultadoListaCampeonatos;
import java.io.IOException;

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
    
    private final String BRASILEIRO_MODERNO = BASE_CAMPEONATO + "campeonato-brasileiro";
    
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
        return Parser.getListaDeCampeonatosResultado(BRASILEIROS);
    }
    
    @Override
    public ResultadoListaCampeonatos getBrasileiroModerno() 
            throws Exception {
        return Parser.getListaDeCampeonatosResultado(BRASILEIRO_MODERNO);
    }

    @Override
    public ResultadoListaCampeonatos getCampeonatoCarioca() throws Exception {
        return Parser.getListaDeCampeonatosResultado(CARIOCA);
    }

    @Override
    public ResultadoListaCampeonatos getCampeonatoPaulista() throws Exception {
        return Parser.getListaDeCampeonatosResultado(PAULISTA);
    }

    @Override
    public ResultadoListaCampeonatos getCopaAmerica() throws Exception {
        return Parser.getListaDeCampeonatosResultado(COPA_AMERICA);
    }

    @Override
    public ResultadoListaCampeonatos getCopaDasConfederacoes() throws Exception {
        return Parser.getListaDeCampeonatosResultado(CONFEDERACOES);
    }

    @Override
    public ResultadoListaCampeonatos getCopaDoBrasil() throws Exception {
        return Parser.getListaDeCampeonatosResultado(COPA_BRASIL);
    }

    @Override
    public ResultadoListaCampeonatos getCopaDoMundo() throws Exception {
        return Parser.getListaDeCampeonatosResultado(COPA_MUNDO);
    }

    @Override
    public ResultadoListaCampeonatos getMundialDeClubes() throws Exception {
        return Parser.getListaDeCampeonatosResultado(MUNDIAL_CLUBES);
    }

    @Override
    public ResultadoListaCampeonatos getLibertadores() throws Exception {
        return Parser.getListaDeCampeonatosResultado(LIBERTADORES);
    }

    @Override
    public ResultadoListaCampeonatos getTorneioRioSaoPaulo() throws Exception {
        return Parser.getListaDeCampeonatosResultado(RIO_SAO_PAULO);
    }
    
    @Override
    public CampeonatoSimples getDetalhesCampeonato(String url) throws Exception {
        return Parser.getCampeonatoSimplificado(url);
    }    
}
