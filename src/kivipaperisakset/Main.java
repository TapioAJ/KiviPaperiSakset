package kivipaperisakset;

/**
 *
 * @author Ira Dook
 * Main-luokka
 */
public class Main {

    /**
     * Pääohjelma
     */
    public static void main(String args[]) {
        Peli peli = new Peli();
        do {
            peli.pelaaKierros();
        } while (peli.getPelaaja1().getVoitot() < 3 && peli.getPelaaja2().getVoitot() < 3);

        System.out.println("Peli päättyi!");

        if (peli.getPelaaja1().getVoitot() == 3) {
            System.out.println("Pelaaja 1 voitti pelin!");
        } else {
            System.out.println("Pelaaja 2 voitti pelin!");
        }
    }
}
