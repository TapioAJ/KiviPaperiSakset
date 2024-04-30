
package kivipaperisakset;

/**
 * @author Ira Dook
 * Pelaaja-luokka
 * Pelaaja-luokka sisältää pelaajan voittojen lukumäärän ja metodit voiton lisäämiseen ja satunnaisen valinnan tekemiseen
 */
public class Pelaaja {

    private int voitot = 0;

    /**
     * Valitsee satunnaisesti yhden annetuista vaihtohedoista
     * @param valinnat Valinta-olioita sisältävä taulukko
     *  @return Valinta-olio
     */
    public Valinta valitse(Valinta[] valinnat) {
        int random = (int) (Math.random() * valinnat.length);  // Random-luku väliltä 0-2 jonka perusteella valitaan kivi, paperi tai sakset
        return valinnat[random];
    }

    /**
     * Lisää voiton voittojen lukumäärään
     */
    public void voitti() {
        voitot++;
    }

    /**
     * Palauttaa voittojen lukumäärän
     * @return voitot
     */
    public int getVoitot() {
        return (voitot);
    }
}
