package kivipaperisakset;

import org.junit.Test;

import static org.junit.Assert.*;

public class PelaajaTest {
    @Test
    public void testValitse() {
        Pelaaja pelaaja = new Pelaaja();
        Valinta[] valinnat = new Valinta[3];
        valinnat[0] = new Valinta("kivi");
        valinnat[1] = new Valinta("paperi");
        valinnat[2] = new Valinta("sakset");

        for (int i = 0; i < 1000; i++) {
            Valinta valinta = pelaaja.valitse(valinnat);
            assertTrue(valinta.equals(valinnat[0]) || valinta.equals(valinnat[1]) || valinta.equals(valinnat[2]));
        }
    }

    @Test
    public void testVoitti() {
        Pelaaja pelaaja = new Pelaaja();
        pelaaja.voitti();
        assertEquals(1, pelaaja.getVoitot());
    }

    @Test
    public void testGetVoitot() {
        Pelaaja pelaaja = new Pelaaja();
        assertEquals(0, pelaaja.getVoitot());
    }
}