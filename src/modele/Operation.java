package modele;

import main.CalculatriceException;

public abstract class Operation {
	public abstract double calculer(double x, double y) throws CalculatriceException;
}
