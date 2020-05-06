package tests;

import static org.junit.Assert.*;
import main.CalculatriceException;
import modele.Multiplication;
import modele.OperationModel;

import org.junit.Test;

import controlleur.ControlleurCalcul;


public class ControlleurTest {

	@Test
	public void testCalculateOk() {
		ControlleurCalcul control = new ControlleurCalcul();
		OperationModel opModel = new OperationModel(Double.valueOf(4),Double.valueOf(5),"*");
		control.calculate(opModel);
		assertTrue(control.getModele().getClass().getCanonicalName().equals(Multiplication.class.getCanonicalName()));
		assertEquals(opModel.getResult(), Double.valueOf(20));
	}

	@Test 
	public void testCalculateKo() {
		ControlleurCalcul control = new ControlleurCalcul();
		OperationModel opModel = new OperationModel(Double.valueOf(4),Double.valueOf(5),"p");
		control.calculate(opModel);
		assertEquals(opModel.getStatus(),"failed");
		assertEquals(opModel.getErrorCode(),2);
	}
}
