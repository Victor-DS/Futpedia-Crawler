package futpediacrawler.model.jsonmodel.campeonato;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Equipe implements Serializable
{

    @SerializedName("slug")
    @Expose
    private String slug;
    @SerializedName("nome_popular")
    @Expose
    private String nomePopular;
    @SerializedName("apelido")
    @Expose
    private String apelido;
    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("nome")
    @Expose
    private String nome;
    private final static long serialVersionUID = -5673226731157874233L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Equipe() {
    }

    /**
     * 
     * @param id
     * @param nomePopular
     * @param nome
     * @param slug
     * @param apelido
     */
    public Equipe(String slug, String nomePopular, String apelido, long id, String nome) {
        super();
        this.slug = slug;
        this.nomePopular = nomePopular;
        this.apelido = apelido;
        this.id = id;
        this.nome = nome;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Equipe withSlug(String slug) {
        this.slug = slug;
        return this;
    }

    public String getNomePopular() {
        return nomePopular;
    }

    public void setNomePopular(String nomePopular) {
        this.nomePopular = nomePopular;
    }

    public Equipe withNomePopular(String nomePopular) {
        this.nomePopular = nomePopular;
        return this;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public Equipe withApelido(String apelido) {
        this.apelido = apelido;
        return this;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Equipe withId(long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Equipe withNome(String nome) {
        this.nome = nome;
        return this;
    }

}
