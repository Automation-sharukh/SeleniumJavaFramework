package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_GoogleSearch {

	public static void main(String[] args)
	{
		googleSearch();
	}
	
	public static void googleSearch()
	{
		String ProjectPath = System.getProperty("user.dir");
		System.out.println("Project path "+ProjectPath);
		System.setProperty("webdriver.chrome.driver",ProjectPath+"/drivers/chromedriver/chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
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
	    driver.close();
	    
	    System.out.println("Test Completed Successfully...");
	}

}
