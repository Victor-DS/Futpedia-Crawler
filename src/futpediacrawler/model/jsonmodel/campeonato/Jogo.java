package futpediacrawler.model.jsonmodel.campeonato;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Jogo implements Serializable
{

    @SerializedName("sede")
    @Expose
    private String sede;
    @SerializedName("dt")
    @Expose
    private String dt;
    @SerializedName("hr")
    @Expose
    private String hr;
    @SerializedName("mand")
    @Expose
    private long mand;
    @SerializedName("vis")
    @Expose
    private long vis;
    @SerializedName("golm")
    @Expose
    private long golm;
    @SerializedName("golv")
    @Expose
    private long golv;
    @SerializedName("penm")
    @Expose
    private Object penm;
    @SerializedName("penv")
    @Expose
    private Object penv;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("fs")
    @Expose
    private long fs;
    @SerializedName("rod")
    @Expose
    private long rod;
    @SerializedName("dec")
    @Expose
    private long dec;
    private final static long serialVersionUID = -7919791231248884830L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Jogo() {
    }

    /**
     * 
     * @param hr
     * @param dt
     * @param penm
     * @param rod
     * @param golm
     * @param dec
     * @param mand
     * @param sede
     * @param fs
     * @param penv
     * @param golv
     * @param url
     * @param vis
     */
    public Jogo(String sede, String dt, String hr, long mand, long vis, long golm, long golv, Object penm, Object penv, String url, long fs, long rod, long dec) {
        super();
        this.sede = sede;
        this.dt = dt;
        this.hr = hr;
        this.mand = mand;
        this.vis = vis;
        this.golm = golm;
        this.golv = golv;
        this.penm = penm;
        this.penv = penv;
        this.url = url;
        this.fs = fs;
        this.rod = rod;
        this.dec = dec;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public Jogo withSede(String sede) {
        this.sede = sede;
        return this;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public Jogo withDt(String dt) {
        this.dt = dt;
        return this;
    }

    public String getHr() {
        return hr;
    }

    public void setHr(String hr) {
        this.hr = hr;
    }

    public Jogo withHr(String hr) {
        this.hr = hr;
        return this;
    }

    public long getMand() {
        return mand;
    }

    public void setMand(long mand) {
        this.mand = mand;
    }

    public Jogo withMand(long mand) {
        this.mand = mand;
        return this;
    }

    public long getVis() {
        return vis;
    }

    public void setVis(long vis) {
        this.vis = vis;
    }

    public Jogo withVis(long vis) {
        this.vis = vis;
        return this;
    }

    public long getGolm() {
        return golm;
    }

    public void setGolm(long golm) {
        this.golm = golm;
    }

    public Jogo withGolm(long golm) {
        this.golm = golm;
        return this;
    }

    public long getGolv() {
        return golv;
    }

    public void setGolv(long golv) {
        this.golv = golv;
    }

    public Jogo withGolv(long golv) {
        this.golv = golv;
        return this;
    }

    public Object getPenm() {
        return penm;
    }

    public void setPenm(Object penm) {
        this.penm = penm;
    }

    public Jogo withPenm(Object penm) {
        this.penm = penm;
        return this;
    }

    public Object getPenv() {
        return penv;
    }

    public void setPenv(Object penv) {
        this.penv = penv;
    }

    public Jogo withPenv(Object penv) {
        this.penv = penv;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Jogo withUrl(String url) {
        this.url = url;
        return this;
    }

    public long getFs() {
        return fs;
    }

    public void setFs(long fs) {
        this.fs = fs;
    }

    public Jogo withFs(long fs) {
        this.fs = fs;
        return this;
    }

    public long getRod() {
        return rod;
    }

    public void setRod(long rod) {
        this.rod = rod;
    }

    public Jogo withRod(long rod) {
        this.rod = rod;
        return this;
    }

    public long getDec() {
        return dec;
    }

    public void setDec(long dec) {
        this.dec = dec;
    }

    public Jogo withDec(long dec) {
        this.dec = dec;
        return this;
    }

}
