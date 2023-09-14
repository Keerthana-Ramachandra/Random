package genericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtility 
{
public String readDataFromPropertyFile(String key) throws IOException
{
	Properties pro= new Properties();
	FileInputStream fis= new FileInputStream(".\\src\\test\\resources\\CommonData.properties.txt");
	pro.load(fis);
	String value = pro.getProperty(key);
	return value;
}
}
