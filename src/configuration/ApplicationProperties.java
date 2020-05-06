package configuration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import main.CalculatriceException;

public class ApplicationProperties {
        
    private static Properties prop;
    private static ApplicationProperties applicationProperties = null; 

        
    public static ApplicationProperties getInstance(String fileName) throws CalculatriceException 
    { 
        if (applicationProperties == null) 
                applicationProperties = new ApplicationProperties(fileName); 
        
        return applicationProperties; 
    } 

        
        private ApplicationProperties (String fileName) throws CalculatriceException {
                prop = new Properties();
                InputStream input = null;

                try {
                        input = new FileInputStream(fileName);
                        prop.load(input);
                } catch (FileNotFoundException e) {
                	applicationProperties = null;
                    throw new CalculatriceException (ExceptionEnum.FILE_ERROR.getCode(),
               					 ExceptionEnum.FILE_ERROR.getDefaultMessage());
              
                } catch (IOException e) {
                	applicationProperties = null;
                	throw new CalculatriceException (ExceptionEnum.FILE_ERROR.getCode(),
          					 ExceptionEnum.FILE_ERROR.getDefaultMessage());
                }
        }
        
        public static String readProperty(String property, String defaultMessage) {
                //TODO: When property doesnt exist, show default
        	    if (applicationProperties == null ) {
        	    	property=null;
        	    }
                if (null != property)
                        return prop.get(property).toString();
                else 
                        return defaultMessage;
        }
}

