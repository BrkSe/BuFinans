package model;

import java.io.Serializable;

/**
 * Created by hasanburakkutbay on 18.05.2017.
 */
public class Doviz implements Serializable {

    private String dolarAlisFiyat;
    private String dolarSatisFiyat;
    private String euroAlisFiyat;
    private String euroSatisFiyat;

    public String getDolarAlisFiyat() {
        return dolarAlisFiyat;
    }

    public void setDolarAlisFiyat(String dolarAlisFiyat) {
        this.dolarAlisFiyat = dolarAlisFiyat;
    }

    public String getDolarSatisFiyat() {
        return dolarSatisFiyat;
    }

    public void setDolarSatisFiyat(String dolarSatisFiyat) {
        this.dolarSatisFiyat = dolarSatisFiyat;
    }

    public String getEuroAlisFiyat() {
        return euroAlisFiyat;
    }

    public void setEuroAlisFiyat(String euroAlisFiyat) {
        this.euroAlisFiyat = euroAlisFiyat;
    }

    public String getEuroSatisFiyat() {
        return euroSatisFiyat;
    }

    public void setEuroSatisFiyat(String euroSatisFiyat) {
        this.euroSatisFiyat = euroSatisFiyat;
    }
}
