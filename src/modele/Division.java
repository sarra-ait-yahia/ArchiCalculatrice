package modele;

import configuration.ExceptionEnum;
import main.CalculatriceException;

public class Division extends Operation {


	@Override
	public double calculer(double x, double y) throws CalculatriceException {
		 if (y==0)
			 throw new CalculatriceException(ExceptionEnum.DIVISION_BY_ZERO.getCode(),
					 ExceptionEnum.DIVISION_BY_ZERO.getDefaultMessage()); 
		return x/y;
	}

}
