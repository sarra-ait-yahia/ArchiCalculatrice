package configuration;

import main.CalculatriceException;
import modele.Operation;
import configuration.ApplicationConfiguration;

public class OperationFactory {

	public static Operation initOperation(String ope) throws CalculatriceException {
		ApplicationConfiguration.configuration();
		if(!ApplicationConfiguration.operationByChar.containsKey(ope))
			throw new CalculatriceException(ExceptionEnum.UKNOWN_OPERATION.getCode(),
					 ExceptionEnum.UKNOWN_OPERATION.getDefaultMessage()); 
		return ApplicationConfiguration.operationByChar.get(ope);
	}
}
