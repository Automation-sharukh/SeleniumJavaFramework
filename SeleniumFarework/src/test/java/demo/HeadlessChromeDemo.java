package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeDemo
{
   public void test()
   {
		String ProjectPath = System.getProperty("user.dir");
		System.out.println("Project path"+ProjectPath);
		
		System.setProperty("webdriver.chrome.driver",ProjectPath+"/drivers/chromedriver/chromedriver.exe");
	    
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--Headless");
		WebDriver driver= new ChromeDriver(options);
	    
	    driver.get("https://google.com");
	    System.out.println(driver.getTitle());
	    driver.findElement(By.name("q")).sendKeys("Automation");
	    driver.findElement(By.name("btnK")).click();
	    
	    driver.close();
	    driver.quit();
	    System.out.println("Test Completed......");
   }
}
