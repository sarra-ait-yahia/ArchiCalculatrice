package main;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import configuration.ApplicationProperties;
import serveurPackage.ServiceCalculatrice;
import vue.Calculatrice;

public class Main {
	
	@SuppressWarnings("deprecation")
	public static void main (String[]args) throws IOException, ClassNotFoundException, InterruptedException {
		String lang="EN";
        if( lang.equals("FR"))
        	ApplicationProperties.getInstance("src/clientPackage/messageFr");
        else 
        	ApplicationProperties.getInstance("src/clientPackage/messageEn");
        
		Thread service = new Thread(new Runnable() {
		    public void run(){
				try {
					ServiceCalculatrice.lunch();
				} catch (ClassNotFoundException | IOException e) {
					}
		    }
		});
		service.start();
		Calculatrice vue=new Calculatrice();
		vue.lancerCalculatrice();
		 
		if (Calculatrice.getReponse().equals("n")){
			service.stop();
		}
		
	}

}
