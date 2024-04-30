package kivipaperisakset;

/**
 * @author TapioJH
 * Peli-luokka
 * Peli-luokka sisältää pelaajat, valinnat ja pelin kulun hallinnan
 */
public class Peli {
    private Pelaaja pelaaja1;
    private Pelaaja pelaaja2;
    private Valinta[] valinnat;
    private int pelatutPelit;
    private int tasapelit;
    private Valinta pelaaja1Valinta;
    private Valinta pelaaja2Valinta;

    /**
     * Palauttaa pelaajan 1
     * @return pelaaja1
     */
    public Pelaaja getPelaaja2() {
        return pelaaja2;
    }

    /**
     * Palauttaa pelaajan 2
     * @return pelaaja2
     */
    public Pelaaja getPelaaja1() {
        return pelaaja1;
    }

    /**
     * Peli-luokan konstruktori
     */
    public Peli() {
        this.pelaaja1 = new Pelaaja();
        this.pelaaja2 = new Pelaaja();
        this.valinnat = new Valinta[3];
        this.valinnat[0] = new Valinta("kivi");
        this.valinnat[1] = new Valinta("paperi");
        this.valinnat[2] = new Valinta("sakset");
        this.valinnat[0].setVoittaa(this.valinnat[2]);
        this.valinnat[1].setVoittaa(this.valinnat[0]);
        this.valinnat[2].setVoittaa(this.valinnat[1]);
        this.pelatutPelit = 0;
        this.tasapelit = 0;
    }

    /**
     * Pelaa yhden kierroksen
     * Pelaajat valitsevat kumpikin satunnaisesti yhden valinnan ja tulostaa kierroksen tuloksen
     */
    public void pelaaKierros() {
        this.pelatutPelit++;
        this.pelaaja1Valinta = this.pelaaja1.valitse(this.valinnat);
        this.pelaaja2Valinta = this.pelaaja2.valitse(this.valinnat);
        System.out.println("Erä: " + this.pelatutPelit + " =====================");
        System.out.println("Tasapelien lukumäärä: " + this.tasapelit);
        System.out.println("Pelaaja 1: " + this.pelaaja1Valinta.getNimi() + "\n Pelaaja 1:llä koossa " + this.pelaaja1.getVoitot() + " voittoa.");
        System.out.println("Pelaaja 2: " + this.pelaaja2Valinta.getNimi() + "\n Pelaaja 2:lla koossa " + this.pelaaja2.getVoitot() + " voittoa.");
        if (this.pelaaja1Valinta == this.pelaaja2Valinta) {
            System.out.println("Tasapeli! \n \n");
            this.tasapelit++;
        } else if (this.pelaaja1Valinta.getVoittaa() == this.pelaaja2Valinta) {
            System.out.println("Pelaaja 1 voitti kierroksen!\n \n");
            this.pelaaja1.voitti();
        } else {
            System.out.println("Pelaaja 2 voitti kierroksen!\n \n");
            this.pelaaja2.voitti();
        }
    }
}
