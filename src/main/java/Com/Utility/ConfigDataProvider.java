package Com.Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	
	Properties pro;
	
	public ConfigDataProvider() throws Exception
	{
		String path = "C:\\Users\\SANTOSH GUDLUMANI\\eclipse-workspace\\Shubham_SK\\Config\\Config.Properties";
		FileInputStream fis = new FileInputStream(path);
		pro = new Properties();
		pro.load(fis); 
		
	}
	
	public String getBaseUrl_QA1() {
		return pro.getProperty("BaseUrl_QA1");
		
	}

}
