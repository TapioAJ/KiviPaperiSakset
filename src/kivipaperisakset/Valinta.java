package kivipaperisakset;

/**
 * @author TapioJH
 * Valinta-luokka
 * Valinta-luokka sisältää valinnan nimen ja tiedon siitä, mitä valinta voittaa
 */
public class Valinta {
    private Valinta voittaa = null;
    private String nimi;

    /**
     * Valinta-luokan konstruktori
     * @param nimi Valinnan nimi
     */
    public Valinta(String nimi) {
        this.nimi = nimi;
    }

    /**
     * Palauttaa valinnan nimen
     * @return nimi
     */
    public String getNimi() {
        return nimi;
    }

    /**
     * Asettaa valinta-olion jonka valinta voittaa
     * @param voittaa Valinta-olio
     */
    public void setVoittaa(Valinta voittaa) {
        this.voittaa = voittaa;
    }

    /**
     * Palauttaa tiedon siitä, minkä valinnan valinta voittaa
     * @return voittaa
     */
    public Valinta getVoittaa() {
        return voittaa;
    }
}
