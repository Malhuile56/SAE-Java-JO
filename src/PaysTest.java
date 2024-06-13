package test;

import org.junit.Test;
import static org.junit.Assert.*;
import main.*;

public class PaysTest {

    @Test
    public void testPaysFactory() {
        Pays france = Pays.factory("France");
        assertNotNull(france);
        assertEquals("France", france.getNom());
    }

    @Test
    public void testMedals() {
        Pays france = Pays.factory("France");
        france.ajouterOr();
        france.ajouterArgent();
        france.ajouterBronze();

        assertEquals(1, france.getNbOr());
        assertEquals(1, france.getNbArgent());
        assertEquals(1, france.getNbBronze());
    }
}
