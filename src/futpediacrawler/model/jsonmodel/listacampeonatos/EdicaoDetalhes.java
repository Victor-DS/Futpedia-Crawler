
package futpediacrawler.model.jsonmodel.listacampeonatos;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EdicaoDetalhes implements Serializable
{

    @SerializedName("data_fim")
    @Expose
    private String dataFim;
    @SerializedName("nome")
    @Expose
    private String nome;
    @SerializedName("slug_editorial")
    @Expose
    private String slugEditorial;
    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("data_inicio")
    @Expose
    private String dataInicio;
    @SerializedName("campeonato_id")
    @Expose
    private long campeonatoId;
    @SerializedName("slug")
    @Expose
    private String slug;
    private final static long serialVersionUID = 5299137318927761464L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public EdicaoDetalhes() {
    }

    /**
     * 
     * @param id
     * @param dataFim
     * @param slugEditorial
     * @param dataInicio
     * @param slug
     * @param nome
     * @param campeonatoId
     */
    public EdicaoDetalhes(String dataFim, String nome, String slugEditorial, long id, String dataInicio, long campeonatoId, String slug) {
        super();
        this.dataFim = dataFim;
        this.nome = nome;
        this.slugEditorial = slugEditorial;
        this.id = id;
        this.dataInicio = dataInicio;
        this.campeonatoId = campeonatoId;
        this.slug = slug;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public EdicaoDetalhes withDataFim(String dataFim) {
        this.dataFim = dataFim;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public EdicaoDetalhes withNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getSlugEditorial() {
        return slugEditorial;
    }

    public void setSlugEditorial(String slugEditorial) {
        this.slugEditorial = slugEditorial;
    }

    public EdicaoDetalhes withSlugEditorial(String slugEditorial) {
        this.slugEditorial = slugEditorial;
        return this;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public EdicaoDetalhes withId(long id) {
        this.id = id;
        return this;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public EdicaoDetalhes withDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
        return this;
    }

    public long getCampeonatoId() {
        return campeonatoId;
    }

    public void setCampeonatoId(long campeonatoId) {
        this.campeonatoId = campeonatoId;
    }

    public EdicaoDetalhes withCampeonatoId(long campeonatoId) {
        this.campeonatoId = campeonatoId;
        return this;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public EdicaoDetalhes withSlug(String slug) {
        this.slug = slug;
        return this;
    }

}
