
package futpediacrawler.model.jsonmodel.listacampeonatos;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Edicao implements Serializable
{

    @SerializedName("edicao")
    @Expose
    private EdicaoDetalhes edicao;
    @SerializedName("campeoes")
    @Expose
    private List<Long> campeoes = null;
    @SerializedName("gols")
    @Expose
    private long gols;
    @SerializedName("jogos_realizados")
    @Expose
    private long jogosRealizados;
    @SerializedName("jogos")
    @Expose
    private long jogos;
    private final static long serialVersionUID = 8971425492236902697L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Edicao() {
    }

    /**
     * 
     * @param jogos
     * @param gols
     * @param edicao
     * @param campeoes
     * @param jogosRealizados
     */
    public Edicao(EdicaoDetalhes edicao, List<Long> campeoes, long gols, long jogosRealizados, long jogos) {
        super();
        this.edicao = edicao;
        this.campeoes = campeoes;
        this.gols = gols;
        this.jogosRealizados = jogosRealizados;
        this.jogos = jogos;
    }

    public EdicaoDetalhes getEdicao() {
        return edicao;
    }

    public void setEdicao(EdicaoDetalhes edicao) {
        this.edicao = edicao;
    }

    public Edicao withEdicao(EdicaoDetalhes edicao) {
        this.edicao = edicao;
        return this;
    }

    public List<Long> getCampeoes() {
        return campeoes;
    }

    public void setCampeoes(List<Long> campeoes) {
        this.campeoes = campeoes;
    }

    public Edicao withCampeoes(List<Long> campeoes) {
        this.campeoes = campeoes;
        return this;
    }

    public long getGols() {
        return gols;
    }

    public void setGols(long gols) {
        this.gols = gols;
    }

    public Edicao withGols(long gols) {
        this.gols = gols;
        return this;
    }

    public long getJogosRealizados() {
        return jogosRealizados;
    }

    public void setJogosRealizados(long jogosRealizados) {
        this.jogosRealizados = jogosRealizados;
    }

    public Edicao withJogosRealizados(long jogosRealizados) {
        this.jogosRealizados = jogosRealizados;
        return this;
    }

    public long getJogos() {
        return jogos;
    }

    public void setJogos(long jogos) {
        this.jogos = jogos;
    }

    public Edicao withJogos(long jogos) {
        this.jogos = jogos;
        return this;
    }

}
