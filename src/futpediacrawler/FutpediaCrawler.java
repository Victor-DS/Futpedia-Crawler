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
package futpediacrawler;

import futpediacrawler.model.crawler.Futpedia;
import futpediacrawler.model.jsonmodel.listacampeonatos.Campeao;
import futpediacrawler.model.wrappers.ResultadoListaCampeonatos;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Victor Santiago
 */
public class FutpediaCrawler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Futpedia fp = new Futpedia();
        
        try {
            ResultadoListaCampeonatos rlc = fp.getBrasileiroModerno();
            
            //Imprimindo campeões...
            for(Campeao c : rlc.getCampeoes())
                System.out.println(c.getNome());
        } catch (Exception ex) {
            Logger.getLogger(FutpediaCrawler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }        
    
}
