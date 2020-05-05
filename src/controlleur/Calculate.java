package controlleur;

import configuration.ApplicationConfiguration;
import main.CalculatriceException;
import modele.OperationModel;

public class Calculate {
	 public static OperationModel calculate(OperationModel operation){
		 try{ 
		 ControlleurCalcul control= new ControlleurCalcul(operation.getFisrtOperand(), operation.getOperation(),operation.getSecondOperand());
		 operation.setResult(control.retourneResultat());
		 }catch(CalculatriceException e){
			 operation.setStatus("failed");
			 operation.setErrorCode(e.getCode());
		 }
		 return operation;
	  }
}
