package tests;

import static org.junit.Assert.*;
import main.CalculatriceException;
import modele.Addition;
import modele.Soustraction;

import org.junit.Test;

public class SoustractionTest {
	
	@Test
	public void SoustractionOk() throws CalculatriceException {
		Soustraction sous = new Soustraction();
		Double resultat = sous.calculer(Double.valueOf(8),Double.valueOf(4));
		assertEquals(resultat,Double.valueOf(4));
	}

}
