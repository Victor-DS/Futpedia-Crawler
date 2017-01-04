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
package futpediacrawler.model.wrappers;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import futpediacrawler.model.jsonmodel.campeonato.Equipe;
import futpediacrawler.model.jsonmodel.campeonato.Sede;
import futpediacrawler.model.jsonmodel.campeonato.Fase;
import futpediacrawler.model.jsonmodel.campeonato.Jogo;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Victor Santiago
 */
public class ResultadoCampeonato implements Serializable {

    @SerializedName("jogos")
    @Expose
    private List<Jogo> jogos = null;
    
    @SerializedName("equipes")
    @Expose
    private Map<String, Equipe> equipes;
    
    @SerializedName("sedes")
    @Expose
    private Map<String, Sede> sedes;
    
    @SerializedName("fases")
    @Expose
    private List<Fase> fases = null;
    
    private final static long serialVersionUID = -7963408928048028859L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResultadoCampeonato() {
    }

    /**
     * 
     * @param fases
     * @param sedes
     * @param equipes
     * @param jogos
     */
    public ResultadoCampeonato(List<Jogo> jogos, Map<String, Equipe> equipes, 
            Map<String, Sede> sedes, List<Fase> fases) {
        super();
        this.jogos = jogos;
        this.equipes = equipes;
        this.sedes = sedes;
        this.fases = fases;
    }

    public List<Jogo> getJogos() {
        return jogos;
    }

    public void setJogos(List<Jogo> jogos) {
        this.jogos = jogos;
    }

    public ResultadoCampeonato withJogos(List<Jogo> jogos) {
        this.jogos = jogos;
        return this;
    }

    public Map<String, Equipe> getEquipes() {
        return equipes;
    }
    
    public Equipe getEquipe(String id) {
        return equipes.get(id);
    }

    public void setEquipes(Map<String, Equipe> equipes) {
        this.equipes = equipes;
    }
    
    public void addEquipe(String key, Equipe e) {
        equipes.put(key, e);
    }

    public ResultadoCampeonato withEquipes(Map<String, Equipe> equipes) {
        this.equipes = equipes;
        return this;
    }

    public Map<String, Sede> getSedes() {
        return sedes;
    }

    public void setSedes(Map<String, Sede> sedes) {
        this.sedes = sedes;
    }

    public ResultadoCampeonato withSedes(Map<String, Sede> sedes) {
        this.sedes = sedes;
        return this;
    }

    public List<Fase> getFases() {
        return fases;
    }

    public void setFases(List<Fase> fases) {
        this.fases = fases;
    }

    public ResultadoCampeonato withFases(List<Fase> fases) {
        this.fases = fases;
        return this;
    }
}
