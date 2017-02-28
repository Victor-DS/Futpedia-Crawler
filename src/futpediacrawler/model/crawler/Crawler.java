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

import futpediacrawler.model.wrappers.CampeonatoSimples;
import futpediacrawler.model.wrappers.ResultadoCampeonato;
import futpediacrawler.model.wrappers.ResultadoListaCampeonatos;

/**
 *
 * @author Victor Santiago
 */
public interface Crawler {
    
    public ResultadoListaCampeonatos getBrasileiroUnificado() throws Exception;
    
    public ResultadoListaCampeonatos getBrasileiroModerno() throws Exception;
    
    public ResultadoListaCampeonatos getTacaBrasil() throws Exception;
    
    public ResultadoListaCampeonatos getTorneioRobertoGomesPedrosa() throws Exception;
    
    public ResultadoListaCampeonatos getCampeonatoCarioca() throws Exception;
    
    public ResultadoListaCampeonatos getCampeonatoPaulista() throws Exception;
    
    public ResultadoListaCampeonatos getCopaAmerica() throws Exception;
    
    public ResultadoListaCampeonatos getCopaDasConfederacoes() throws Exception;
    
    public ResultadoListaCampeonatos getCopaDoBrasil() throws Exception;
    
    public ResultadoListaCampeonatos getCopaDoMundo() throws Exception;
    
    public ResultadoListaCampeonatos getMundialDeClubes() throws Exception;
    
    public ResultadoListaCampeonatos getLibertadores() throws Exception;

    public ResultadoListaCampeonatos getTorneioRioSaoPaulo() throws Exception;
    
    public CampeonatoSimples getDetalhesCampeonato(String url) throws Exception;
    
}
