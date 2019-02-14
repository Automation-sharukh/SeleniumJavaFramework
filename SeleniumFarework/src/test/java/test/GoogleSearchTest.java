package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPage;

public class GoogleSearchTest {
	
	private static WebDriver driver = null;

	public static void main(String[] args)
	{
		googleSearch();
	}
	
	public static void googleSearch()
	{
		String ProjectPath = System.getProperty("user.dir");
		System.out.println("Project path "+ProjectPath);
		System.setProperty("webdriver.chrome.driver",ProjectPath+"/drivers/chromedriver/chromedriver.exe");
	    
	    driver = new ChromeDriver();
	    driver.get("https://google.com");
	    
	 //   driver.findElement(By.name("q")).sendKeys("Autoamtion Testing");
	   
	    GoogleSearchPage.textbox_search(driver).sendKeys("Automation Testing");
	    
   	//    driver.findElement(By.name("btnK")).click();
	   
	    GoogleSearchPage.button_search(driver).click();

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
