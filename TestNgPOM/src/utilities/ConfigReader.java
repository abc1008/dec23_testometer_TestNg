package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	public static String readData(String propertyName) throws IOException
	{
		String path = System.getProperty("user.dir") + "\\Config.properties";
		FileInputStream file = new FileInputStream(path);  
		Properties prop = new Properties();
		prop.load(file);
		String dataFromConfigFile = prop.getProperty(propertyName);

		return dataFromConfigFile;
		
	}
	
	
	

}
