package configuration;

import java.util.HashMap;
import java.util.Map;
import modele.Addition;
import modele.Division;
import modele.Multiplication;
import modele.Operation;
import modele.Soustraction;

public class ApplicationConfiguration {
	public static Map<String, Operation> operationByChar = new HashMap<String, Operation>();
	
	public static void configuration() {
		operationByChar.put("+", new Addition());
		operationByChar.put("-", new Soustraction());
		operationByChar.put("*", new Multiplication());
		operationByChar.put("/", new Division());
		
	}
}
