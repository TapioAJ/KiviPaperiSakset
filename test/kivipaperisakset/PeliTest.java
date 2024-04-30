package kivipaperisakset;


import org.junit.Test;

import static org.junit.Assert.*;

public class PeliTest {
    @Test
    public void testGetPelaaja1() {
        Peli peli = new Peli();
        assertNotNull(peli.getPelaaja1());
    }

    @Test
    public void testGetPelaaja2() {
        Peli peli = new Peli();
        assertNotNull(peli.getPelaaja2());
    }


    @Test
    public void testPelaaKierros() {
        Peli peli = new Peli();

        for (int i = 0; i < 1000; i++){
            peli.pelaaKierros();
        }
        assertTrue( peli.getPelaaja1().getVoitot() > 0 && peli.getPelaaja2().getVoitot() > 0);
    }
}