package model;

import java.io.Serializable;

/**
 * Created by hasanburakkutbay on 18.05.2017.
 */
public class Doviz implements Serializable {

    private String dolarAlisFiyat;
    private String dolarSatisFiyat;
    private String guncellemeZamani;

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
}
