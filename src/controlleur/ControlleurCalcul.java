package controlleur;

import configuration.OperationFactory;
import main.CalculatriceException;
import modele.Addition;
import modele.Operation;

public class ControlleurCalcul {
	private Operation modele;
	private double num1;
	private String operateur;
	private double num2;
	
    public ControlleurCalcul(double a, String op, double b) {
    	this.num1=a;
    	this.operateur=op;
    	this.num2=b;
    }
    
    public double retourneResultat() throws CalculatriceException {
    	modele = OperationFactory.initOperation(operateur);
    	return modele.calculer(num1,num2);
    	
    }

	public Operation getModele() {
		return modele;
	}

	public void setModele(Operation modele) {
		this.modele = modele;
	}

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public String getOperateur() {
		return operateur;
	}

	public void setOperateur(String operateur) {
		this.operateur = operateur;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}
    
    
}
