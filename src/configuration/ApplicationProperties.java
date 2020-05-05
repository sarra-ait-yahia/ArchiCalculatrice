package configuration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ApplicationProperties {
        
    private static Properties prop;
    private static ApplicationProperties applicationProperties = null; 

        
    public static ApplicationProperties getInstance(String fileName) 
    { 
        if (applicationProperties == null) 
                applicationProperties = new ApplicationProperties(fileName); 
  
        return applicationProperties; 
    } 

        
        private ApplicationProperties (String fileName) {
                prop = new Properties();
                InputStream input = null;

                try {
                        input = new FileInputStream(fileName);
                        prop.load(input);
                } catch (FileNotFoundException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                }
        }
        
        public static String readProperty(String property, String defaultMessage) {
                //TODO: When property doesnt exist, show default
                if (null != property)
                        return prop.get(property).toString();
                else 
                        return defaultMessage;
        }
}

