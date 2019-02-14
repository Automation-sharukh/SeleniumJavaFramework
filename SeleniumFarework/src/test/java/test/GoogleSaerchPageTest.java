package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSaerchPageObjects;

public class GoogleSaerchPageTest {
	
    private static  WebDriver driver =null;
	public static void main(String[] args)
	{
		googleSearchTest();
	}
	  
	public static void googleSearchTest()
	  {
		String ProjectPath = System.getProperty("user.dir");
		System.out.println("Project path"+ProjectPath);
		
		System.setProperty("webdriver.chrome.driver",ProjectPath+"/drivers/chromedriver/chromedriver.exe");
	    driver= new ChromeDriver();
	    
	    GoogleSaerchPageObjects searchPgObj = new GoogleSaerchPageObjects(driver);
	    
	    driver.get("https://google.com");
	    searchPgObj.setTextInSearchBox("Abcd");
	    searchPgObj.clickSearchButton();
	    driver.close();
	  }

	}


