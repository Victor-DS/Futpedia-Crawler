
package futpediacrawler.model.jsonmodel;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Agregador implements Serializable
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
    private final static long serialVersionUID = -4643185626619480098L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Agregador() {
    }

    /**
     * 
     * @param id
     * @param nome
     * @param slug
     */
    public Agregador(String slug, long id, String nome) {
        super();
        this.slug = slug;
        this.id = id;
        this.nome = nome;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Agregador withSlug(String slug) {
        this.slug = slug;
        return this;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Agregador withId(long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Agregador withNome(String nome) {
        this.nome = nome;
        return this;
    }

}
