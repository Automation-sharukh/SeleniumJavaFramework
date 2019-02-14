package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitDemo {
	public static void main(String[] args) throws InterruptedException {
		test();
	}
	
	public static void test() throws InterruptedException
	{
		String ProjectPath = System.getProperty("user.dir");
		System.out.println("Project path"+ProjectPath);
		
		System.setProperty("webdriver.chrome.driver",ProjectPath+"/drivers/chromedriver/chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    
	    driver.get("https://google.com");
	    driver.findElement(By.name("q")).sendKeys("Automation");
	    driver.findElement(By.name("btnK")).click();
	    
	    driver.findElement(By.xpath("1")).click();
	    
	    Thread.sleep(3000);
	    driver.close();
	    driver.quit();
	}

}
