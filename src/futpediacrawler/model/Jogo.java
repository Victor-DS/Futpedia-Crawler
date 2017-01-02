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
package futpediacrawler.model;

import java.util.Date;

/**
 *
 * @author Victor Santiago
 */
public class Jogo {
    
    private Time timeA, timeB;
    private String estadio, fase;
    private Date data;
    private int golsA, golsB;

    public Jogo(Time timeA, Time timeB, String estadio, String fase, Date data, int golsA, int golsB) {
        this.timeA = timeA;
        this.timeB = timeB;
        this.estadio = estadio;
        this.fase = fase;
        this.data = data;
        this.golsA = golsA;
        this.golsB = golsB;
    }

    public Jogo() {
    }

    public Time getTimeA() {
        return timeA;
    }

    public void setTimeA(Time timeA) {
        this.timeA = timeA;
    }

    public Time getTimeB() {
        return timeB;
    }

    public void setTimeB(Time timeB) {
        this.timeB = timeB;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getFase() {
        return fase;
    }

    public void setFase(String fase) {
        this.fase = fase;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getGolsA() {
        return golsA;
    }

    public void setGolsA(int golsA) {
        this.golsA = golsA;
    }

    public int getGolsB() {
        return golsB;
    }

    public void setGolsB(int golsB) {
        this.golsB = golsB;
    }
    
    public Time getVencedor() {
        if(golsA == golsB)
            return null;
        
        return golsA > golsB ? timeA : timeB;
    }
    
}
