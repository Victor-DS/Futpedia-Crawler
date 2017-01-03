
package futpediacrawler.model.jsonmodel;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Campeo implements Serializable
{

    @SerializedName("organizacao_id")
    @Expose
    private long organizacaoId;
    @SerializedName("escudo_medio")
    @Expose
    private String escudoMedio;
    @SerializedName("nome")
    @Expose
    private String nome;
    @SerializedName("escudo_grande")
    @Expose
    private String escudoGrande;
    @SerializedName("escudo_pequeno")
    @Expose
    private String escudoPequeno;
    @SerializedName("equipe_id")
    @Expose
    private long equipeId;
    @SerializedName("nome_popular")
    @Expose
    private String nomePopular;
    @SerializedName("slug")
    @Expose
    private String slug;
    private final static long serialVersionUID = -2538310008414115101L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Campeo() {
    }

    /**
     * 
     * @param nomePopular
     * @param escudoPequeno
     * @param organizacaoId
     * @param slug
     * @param nome
     * @param escudoMedio
     * @param equipeId
     * @param escudoGrande
     */
    public Campeo(long organizacaoId, String escudoMedio, String nome, String escudoGrande, String escudoPequeno, long equipeId, String nomePopular, String slug) {
        super();
        this.organizacaoId = organizacaoId;
        this.escudoMedio = escudoMedio;
        this.nome = nome;
        this.escudoGrande = escudoGrande;
        this.escudoPequeno = escudoPequeno;
        this.equipeId = equipeId;
        this.nomePopular = nomePopular;
        this.slug = slug;
    }

    public long getOrganizacaoId() {
        return organizacaoId;
    }

    public void setOrganizacaoId(long organizacaoId) {
        this.organizacaoId = organizacaoId;
    }

    public Campeo withOrganizacaoId(long organizacaoId) {
        this.organizacaoId = organizacaoId;
        return this;
    }

    public String getEscudoMedio() {
        return escudoMedio;
    }

    public void setEscudoMedio(String escudoMedio) {
        this.escudoMedio = escudoMedio;
    }

    public Campeo withEscudoMedio(String escudoMedio) {
        this.escudoMedio = escudoMedio;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Campeo withNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getEscudoGrande() {
        return escudoGrande;
    }

    public void setEscudoGrande(String escudoGrande) {
        this.escudoGrande = escudoGrande;
    }

    public Campeo withEscudoGrande(String escudoGrande) {
        this.escudoGrande = escudoGrande;
        return this;
    }

    public String getEscudoPequeno() {
        return escudoPequeno;
    }

    public void setEscudoPequeno(String escudoPequeno) {
        this.escudoPequeno = escudoPequeno;
    }

    public Campeo withEscudoPequeno(String escudoPequeno) {
        this.escudoPequeno = escudoPequeno;
        return this;
    }

    public long getEquipeId() {
        return equipeId;
    }

    public void setEquipeId(long equipeId) {
        this.equipeId = equipeId;
    }

    public Campeo withEquipeId(long equipeId) {
        this.equipeId = equipeId;
        return this;
    }

    public String getNomePopular() {
        return nomePopular;
    }

    public void setNomePopular(String nomePopular) {
        this.nomePopular = nomePopular;
    }

    public Campeo withNomePopular(String nomePopular) {
        this.nomePopular = nomePopular;
        return this;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Campeo withSlug(String slug) {
        this.slug = slug;
        return this;
    }

}
