package futpediacrawler.model.jsonmodel.campeonato;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Fase implements Serializable
{

    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("tipo")
    @Expose
    private String tipo;
    @SerializedName("nome")
    @Expose
    private String nome;
    private final static long serialVersionUID = -2568917933363329673L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Fase() {
    }

    /**
     * 
     * @param id
     * @param tipo
     * @param nome
     */
    public Fase(long id, String tipo, String nome) {
        super();
        this.id = id;
        this.tipo = tipo;
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Fase withId(long id) {
        this.id = id;
        return this;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Fase withTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Fase withNome(String nome) {
        this.nome = nome;
        return this;
    }

}
