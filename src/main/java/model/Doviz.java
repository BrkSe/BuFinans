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
    private String guncellemeZamani;
    private String mesaj;

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

    public String getGuncellemeZamani() {
        return guncellemeZamani;
    }

    public void setGuncellemeZamani(String guncellemeZamani) {
        this.guncellemeZamani = guncellemeZamani;
    }

    public String getMesaj() {
        return mesaj;
    }

    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
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
