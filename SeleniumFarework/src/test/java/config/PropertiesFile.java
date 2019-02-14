package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.TestNG_Demo;

public class PropertiesFile {

	static Properties prop = new Properties();
	static String ProjectPath = System.getProperty("user.dir");
	public static void main(String[] args) 
	{
	   getProperites();
	   setProperties();
	   getProperites();
	}
	
	public static void getProperites()
	{
	
		try
		{

			InputStream input = new  FileInputStream(ProjectPath+"/src/test/java/config/config.properties");
			prop.load(input);
			String browser = prop.getProperty("browser");
			System.out.println(browser);
			TestNG_Demo.browserName=browser;
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}  
	public static void setProperties()
	{
		try
		{
			OutputStream output = new FileOutputStream(ProjectPath+"/src/test/java/config/config.properties");
			prop.setProperty("browser", "chrome");
			prop.store(output, null);
		}catch(Exception e)
		{

			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
}