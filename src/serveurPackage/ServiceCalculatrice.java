package serveurPackage;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

import controlleur.Calculate;
import modele.OperationModel;

public class ServiceCalculatrice {
	private static final Logger LOGGER=Logger.getLogger(ServiceCalculatrice.class.getName());
	
	private static ServerSocket server;
	private static int PORT= 33001;
	
	public static void lunch() throws IOException, ClassNotFoundException{
		server= new ServerSocket(PORT);
		//LOGGER.log(Level.INFO, "Server running");
		
		while (true){
		Socket socket= server.accept();
		//LOGGER.log(Level.INFO,"Connexion established");
		
		
		ObjectInputStream ois=new ObjectInputStream(socket.getInputStream());
		ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
		
		OperationModel operation= (OperationModel) ois.readObject();
		//LOGGER.log(Level.INFO, "Message Received: "+ operation);
		
		OperationModel result = Calculate.calculate(operation);
		oos.writeObject(result);
		//LOGGER.log(Level.INFO, "Response set: "+result);
	}
	}

}
