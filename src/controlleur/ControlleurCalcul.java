package controlleur;

import configuration.OperationFactory;
import main.CalculatriceException;
import modele.Addition;
import modele.Operation;
import modele.OperationModel;

public class ControlleurCalcul {
	private Operation modele;
	 
    public  OperationModel calculate(OperationModel operation){
		 try{modele = OperationFactory.initOperation(operation.getOperation());
	     operation.setResult(modele.calculer(operation.getFisrtOperand(),operation.getSecondOperand()));
		 }catch(CalculatriceException e){
			 operation.setStatus("failed");
			 operation.setErrorCode(e.getCode());
		 }
		 return operation;
	  }

	public Operation getModele() {
		return modele;
	}

	public void setModele(Operation modele) {
		this.modele = modele;
	}
 
}
