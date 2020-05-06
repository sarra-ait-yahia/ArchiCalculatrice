package vue;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import modele.OperationModel;
import clientPackage.RequeteCalculatrice;
import configuration.ApplicationProperties;
import configuration.ExceptionEnum;

public class Calculatrice {
	private static Scanner sc = new Scanner(System.in);
	private static String reponse;

	public void lancerCalculatrice() throws ClassNotFoundException, IOException {
		do {
			try {
				double a, b;
				String ope;
				System.out.print(ApplicationProperties.readProperty("NUMBER_ONE","num 1 : "));
				a = sc.nextDouble();
				System.out.print(ApplicationProperties.readProperty("OPERATION","operation"));
				ope = sc.next();
				System.out.print(ApplicationProperties.readProperty("NUMBER_TWO","num 2 : "));
				b = sc.nextDouble();
				OperationModel operation = new OperationModel(a, b, ope);
				try {
					OperationModel resultat = RequeteCalculatrice
							.call(operation);
					if (resultat.getStatus() != null
							&& resultat.getStatus().equals("failed"))
						System.out.println(ApplicationProperties.readProperty(
								ExceptionEnum.getNameFromCode(resultat
										.getErrorCode()), ExceptionEnum.getDefaultMessageFromCode(resultat
												.getErrorCode())));
					else
						System.out.println(resultat.getResult());
				} catch (ClassNotFoundException | IOException e) {
					System.out.println(ApplicationProperties.readProperty(
							"SERVER_ERROR",
							ExceptionEnum.SERVER_ERROR.getDefaultMessage()));
				}
			} catch (InputMismatchException e) {
				System.out.println(ApplicationProperties.readProperty(
						"INPUT_MISMATCH",
						ExceptionEnum.INPUT_MISMATCH.getDefaultMessage()));
			} finally {
				System.out.println(ApplicationProperties.readProperty("ANSWER","continue? y/n "));
				while (true) {
					reponse = sc.next();
					if (!reponse.equals("y") && !reponse.equals("n")){
						System.out.println(ApplicationProperties.readProperty(
								"INPUT_MISMATCH_REPONSE",
								ExceptionEnum.INPUT_MISMATCH_REPONSE
										.getDefaultMessage()));
					}
					else 
						break;
				}
			}
		} while (!reponse.equals("n"));
	}

	public static String getReponse() {
		return reponse;
	}

}
