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

import futpediacrawler.model.jsonmodel.Resultado;

/**
 *
 * @author Victor Santiago
 */
public interface Crawler {
    
    public Resultado getBrasileiroUnificado() throws Exception;
    
    public Resultado getCampeonatoCarioca() throws Exception;
    
    public Resultado getCampeonatoPaulista() throws Exception;
    
    public Resultado getCopaAmerica() throws Exception;
    
    public Resultado getCopaDasConfederacoes() throws Exception;
    
    public Resultado getCopaDoBrasil() throws Exception;
    
    public Resultado getCopaDoMundo() throws Exception;
    
    public Resultado getMundialDeClubes() throws Exception;
    
    public Resultado getLibertadores() throws Exception;

    public Resultado getTorneioRioSaoPaulo() throws Exception;
    
}
