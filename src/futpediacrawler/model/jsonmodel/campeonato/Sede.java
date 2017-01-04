package futpediacrawler.model.jsonmodel.campeonato;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sede implements Serializable
{

    @SerializedName("nome_popular")
    @Expose
    private String nomePopular;
    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("nome")
    @Expose
    private String nome;
    private final static long serialVersionUID = 4814080707333493292L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Sede() {
    }

    /**
     * 
     * @param id
     * @param nomePopular
     * @param nome
     */
    public Sede(String nomePopular, long id, String nome) {
        super();
        this.nomePopular = nomePopular;
        this.id = id;
        this.nome = nome;
    }

    public String getNomePopular() {
        return nomePopular;
    }

    public void setNomePopular(String nomePopular) {
        this.nomePopular = nomePopular;
    }

    public Sede withNomePopular(String nomePopular) {
        this.nomePopular = nomePopular;
        return this;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Sede withId(long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Sede withNome(String nome) {
        this.nome = nome;
        return this;
    }

}
