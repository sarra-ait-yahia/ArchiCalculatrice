package tests;

import static org.junit.Assert.*;
import main.CalculatriceException;

import org.junit.Test;

import configuration.ApplicationProperties;

public class ApplicationPropertiesTest {

	@Test 
	   public void readPropertyAndGetInstanceKO() throws CalculatriceException {
		String lienFaux = "src/clientPackage/messageFrr";
		try{
			ApplicationProperties appPro = ApplicationProperties.getInstance(lienFaux);
		}catch(CalculatriceException e){
		  assertEquals(e.getDefaultMessage(),"Problem with opening or loading the translation file - No translation");
		  String message = ApplicationProperties.readProperty("DIVISION_BY_ZERO", "test message division");
		  assertEquals(message,"test message division");
		}
	   }
	
		@Test
		public void readPropertyAndGetInstanceOK() throws CalculatriceException {
		 String lienFr = "src/clientPackage/messageFr";
		 ApplicationProperties appProp = ApplicationProperties.getInstance(lienFr);
		 assertTrue(appProp!=null);
		 
		 String lienEn = "src/clientPackage/messageEn";
		 ApplicationProperties.getInstance(lienEn);
		 String message = ApplicationProperties.readProperty("DIVISION_BY_ZERO", "test message division");
		 assertEquals(message,"Division par zéro non autorisée");
		}
	
   

}
