package modele;

import modele.Operation;

public class Addition extends Operation {


	@Override
	public double calculer(double x, double y) {
		return x+y;
	}

}