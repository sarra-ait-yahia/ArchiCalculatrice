package tests;

import static org.junit.Assert.*;
import main.CalculatriceException;
import modele.Addition;

import org.junit.Test;

public class AdditionTest {

	@Test
	public void AdditionOk() throws CalculatriceException {
		Addition add = new Addition();
		Double resultat = add.calculer(Double.valueOf(8),Double.valueOf(8));
		assertEquals(resultat,Double.valueOf(16));
	}
}
