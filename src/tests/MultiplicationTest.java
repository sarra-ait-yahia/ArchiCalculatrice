package tests;

import static org.junit.Assert.*;
import main.CalculatriceException;
import modele.Multiplication;
import modele.Soustraction;

import org.junit.Test;

public class MultiplicationTest {

	@Test
	public void MultiplicationOk() throws CalculatriceException {
		Multiplication multi = new Multiplication();
		Double resultat = multi.calculer(Double.valueOf(8),Double.valueOf(4));
		assertEquals(resultat,Double.valueOf(32));
	}

}
