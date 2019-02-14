package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Demo2 {

  public static	WebDriver driver = null;
     
  @BeforeTest
  public void setUpTest()
	{
		String ProjectPath = System.getProperty("user.dir");
		System.out.println("Project path "+ProjectPath);
		System.setProperty("webdriver.chrome.driver",ProjectPath+"/drivers/chromedriver/chromedriver.exe");
	    
		driver = new ChromeDriver();
	} 

@Test
	public static void googleSearch()
	{
		
	    driver.get("https://google.com");
	    
	    driver.findElement(By.name("q")).sendKeys("Autoamtion Testing");
	    
   	    driver.findElement(By.name("btnK")).click();
	    
   	    //use below code to Press enter button on keyboard
	   // driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	 
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}
	
@AfterTest
	public void tearDownTest()
	{
          driver.close();
          driver.quit();
	      System.out.println("Test Completed Successfully...");
     
	}		 
}
