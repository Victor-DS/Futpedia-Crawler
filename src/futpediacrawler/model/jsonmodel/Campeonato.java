
package futpediacrawler.model.jsonmodel;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Campeonato implements Serializable
{

    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("nome")
    @Expose
    private String nome;
    @SerializedName("ano_inicio")
    @Expose
    private long anoInicio;
    @SerializedName("ano_fim")
    @Expose
    private long anoFim;
    private final static long serialVersionUID = 8714918642437484785L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Campeonato() {
    }

    /**
     * 
     * @param id
     * @param nome
     * @param slug
     * @param anoInicio
     * @param anoFim
     */
    public Campeonato(String slug, long id, String nome, long anoInicio, long anoFim) {
        super();
        this.slug = slug;
        this.id = id;
        this.nome = nome;
        this.anoInicio = anoInicio;
        this.anoFim = anoFim;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Campeonato withSlug(String slug) {
        this.slug = slug;
        return this;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Campeonato withId(long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Campeonato withNome(String nome) {
        this.nome = nome;
        return this;
    }

    public long getAnoInicio() {
        return anoInicio;
    }

    public void setAnoInicio(long anoInicio) {
        this.anoInicio = anoInicio;
    }

    public Campeonato withAnoInicio(long anoInicio) {
        this.anoInicio = anoInicio;
        return this;
    }

    public long getAnoFim() {
        return anoFim;
    }

    public void setAnoFim(long anoFim) {
        this.anoFim = anoFim;
    }

    public Campeonato withAnoFim(long anoFim) {
        this.anoFim = anoFim;
        return this;
    }

}
