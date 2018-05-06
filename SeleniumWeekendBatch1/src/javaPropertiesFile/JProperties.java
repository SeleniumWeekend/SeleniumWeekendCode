package javaPropertiesFile;

import java.io.FileInputStream;
import java.util.Properties;

public class JProperties 
{
	public static String getProData(String key)
	{
		String data = null;
		try
		{
			FileInputStream fis = new FileInputStream("C:\\Users\\SHALINI KUMARI\\workspace\\SeleniumWeekendBatch1\\Environment\\config.properties");
			Properties p = new Properties();
			p.load(fis);
			data = p.getProperty(key);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return data;
		
	}
}
