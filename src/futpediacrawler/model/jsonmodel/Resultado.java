
package futpediacrawler.model.jsonmodel;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Resultado implements Serializable
{

    @SerializedName("edicoes")
    @Expose
    private List<Edicao> edicoes = null;
    @SerializedName("campeonatos")
    @Expose
    private List<Campeonato> campeonatos = null;
    @SerializedName("campeoes")
    @Expose
    private List<Campeo> campeoes = null;
    @SerializedName("agregador")
    @Expose
    private Agregador agregador;
    private final static long serialVersionUID = 5822321203748580940L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Resultado() {
    }

    /**
     * 
     * @param campeoes
     * @param campeonatos
     * @param agregador
     * @param edicoes
     */
    public Resultado(List<Edicao> edicoes, List<Campeonato> campeonatos, List<Campeo> campeoes, Agregador agregador) {
        super();
        this.edicoes = edicoes;
        this.campeonatos = campeonatos;
        this.campeoes = campeoes;
        this.agregador = agregador;
    }

    public List<Edicao> getEdicoes() {
        return edicoes;
    }

    public void setEdicoes(List<Edicao> edicoes) {
        this.edicoes = edicoes;
    }

    public Resultado withEdicoes(List<Edicao> edicoes) {
        this.edicoes = edicoes;
        return this;
    }

    public List<Campeonato> getCampeonatos() {
        return campeonatos;
    }

    public void setCampeonatos(List<Campeonato> campeonatos) {
        this.campeonatos = campeonatos;
    }

    public Resultado withCampeonatos(List<Campeonato> campeonatos) {
        this.campeonatos = campeonatos;
        return this;
    }

    public List<Campeo> getCampeoes() {
        return campeoes;
    }

    public void setCampeoes(List<Campeo> campeoes) {
        this.campeoes = campeoes;
    }

    public Resultado withCampeoes(List<Campeo> campeoes) {
        this.campeoes = campeoes;
        return this;
    }

    public Agregador getAgregador() {
        return agregador;
    }

    public void setAgregador(Agregador agregador) {
        this.agregador = agregador;
    }

    public Resultado withAgregador(Agregador agregador) {
        this.agregador = agregador;
        return this;
    }

}
