package tests;

import static org.junit.Assert.*;
import main.CalculatriceException;
import modele.Division;

import org.junit.Test;


public class DivisionTest {

	@Test
	public void divisionOk() throws CalculatriceException {
		Division div = new Division();
		Double resultat = div.calculer(Double.valueOf(8),Double.valueOf(8));
		assertEquals(resultat,Double.valueOf(1));
	}

	@Test (expected = CalculatriceException.class)
	public void divisionko() throws CalculatriceException {
		Division div = new Division();
		Double resultat = div.calculer(Double.valueOf(8),Double.valueOf(0));
	}
}
