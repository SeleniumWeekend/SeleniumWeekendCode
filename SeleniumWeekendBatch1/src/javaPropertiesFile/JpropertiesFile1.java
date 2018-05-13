package javaPropertiesFile;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class JpropertiesFile1 
{
	public static String getValue(String key)
	{
		String data = null;
		try
		{
			FileInputStream f = new FileInputStream("C:\\Users\\SHALINI KUMARI\\git\\WeekendcodeWork\\SeleniumWeekendBatch1\\Environment\\config.properties");
			
			Properties pro = new Properties();
			pro.load(f);
			
			data  = pro.getProperty(key);
			System.out.println(data);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return data;
		
	}
}
