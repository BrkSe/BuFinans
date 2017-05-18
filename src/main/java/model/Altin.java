package model;

import java.io.Serializable;

/**
 * Created by hasanburakkutbay on 19.05.2017.
 */
public class Altin implements Serializable {
    private String ceyrekAlis;
    private String ceyrekSatis;
    private String yarimAlis;
    private String yarimSatis;
    private String tamAlis;
    private String tamSatis;
    private String cumhuriyetAltiniAlis;
    private String cumhuriyetAltiniSatis;
    private String guncellemeZamani;

    public String getCeyrekAlis() {
        return ceyrekAlis;
    }

    public void setCeyrekAlis(String ceyrekAlis) {
        this.ceyrekAlis = ceyrekAlis;
    }

    public String getCeyrekSatis() {
        return ceyrekSatis;
    }

    public void setCeyrekSatis(String ceyrekSatis) {
        this.ceyrekSatis = ceyrekSatis;
    }

    public String getYarimAlis() {
        return yarimAlis;
    }

    public void setYarimAlis(String yarimAlis) {
        this.yarimAlis = yarimAlis;
    }

    public String getYarimSatis() {
        return yarimSatis;
    }

    public void setYarimSatis(String yarimSatis) {
        this.yarimSatis = yarimSatis;
    }

    public String getTamAlis() {
        return tamAlis;
    }

    public void setTamAlis(String tamAlis) {
        this.tamAlis = tamAlis;
    }

    public String getTamSatis() {
        return tamSatis;
    }

    public void setTamSatis(String tamSatis) {
        this.tamSatis = tamSatis;
    }

    public String getCumhuriyetAltiniAlis() {
        return cumhuriyetAltiniAlis;
    }

    public void setCumhuriyetAltiniAlis(String cumhuriyetAltiniAlis) {
        this.cumhuriyetAltiniAlis = cumhuriyetAltiniAlis;
    }

    public String getCumhuriyetAltiniSatis() {
        return cumhuriyetAltiniSatis;
    }

    public void setCumhuriyetAltiniSatis(String cumhuriyetAltiniSatis) {
        this.cumhuriyetAltiniSatis = cumhuriyetAltiniSatis;
    }

    public String getGuncellemeZamani() {
        return guncellemeZamani;
    }

    public void setGuncellemeZamani(String guncellemeZamani) {
        this.guncellemeZamani = guncellemeZamani;
    }
}
