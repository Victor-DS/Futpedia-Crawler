package futpediacrawler.model.wrappers;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import futpediacrawler.model.jsonmodel.listacampeonatos.Agregador;
import futpediacrawler.model.jsonmodel.listacampeonatos.Campeao;
import futpediacrawler.model.jsonmodel.listacampeonatos.Campeonato;
import futpediacrawler.model.jsonmodel.listacampeonatos.Edicao;

public class ResultadoListaCampeonatos implements Serializable
{

    @SerializedName("edicoes")
    @Expose
    private List<Edicao> edicoes = null;
    @SerializedName("campeonatos")
    @Expose
    private List<Campeonato> campeonatos = null;
    @SerializedName("campeoes")
    @Expose
    private List<Campeao> campeoes = null;
    @SerializedName("agregador")
    @Expose
    private Agregador agregador;
    private final static long serialVersionUID = 5822321203748580940L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResultadoListaCampeonatos() {
    }

    /**
     * 
     * @param campeoes
     * @param campeonatos
     * @param agregador
     * @param edicoes
     */
    public ResultadoListaCampeonatos(List<Edicao> edicoes, List<Campeonato> campeonatos, List<Campeao> campeoes, Agregador agregador) {
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

    public ResultadoListaCampeonatos withEdicoes(List<Edicao> edicoes) {
        this.edicoes = edicoes;
        return this;
    }

    public List<Campeonato> getCampeonatos() {
        return campeonatos;
    }

    public void setCampeonatos(List<Campeonato> campeonatos) {
        this.campeonatos = campeonatos;
    }

    public ResultadoListaCampeonatos withCampeonatos(List<Campeonato> campeonatos) {
        this.campeonatos = campeonatos;
        return this;
    }

    public List<Campeao> getCampeoes() {
        return campeoes;
    }

    public void setCampeoes(List<Campeao> campeoes) {
        this.campeoes = campeoes;
    }

    public ResultadoListaCampeonatos withCampeoes(List<Campeao> campeoes) {
        this.campeoes = campeoes;
        return this;
    }

    public Agregador getAgregador() {
        return agregador;
    }

    public void setAgregador(Agregador agregador) {
        this.agregador = agregador;
    }

    public ResultadoListaCampeonatos withAgregador(Agregador agregador) {
        this.agregador = agregador;
        return this;
    }

}
