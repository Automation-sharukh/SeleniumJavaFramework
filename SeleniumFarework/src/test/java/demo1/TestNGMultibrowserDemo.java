package demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class TestNGMultibrowserDemo 
{
	WebDriver driver = null;
	String ProjectPath = System.getProperty("user.dir");
    
	@Parameters("browsername")
	@BeforeTest
	public void setup(String browsername)
	{
		System.out.println("Browser name:"+browsername);
		System.out.println("Thread id is "+Thread.currentThread().getId());

		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",ProjectPath+"/drivers/chromedriver/chromedriver.exe");
			driver= new ChromeDriver();
		}else if(browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",ProjectPath+"/drivers/geckodriver/geckodriver.exe");
			driver = new FirefoxDriver();
		}else if(browsername.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver",ProjectPath+"/drivers/iedriver/IEDriverServer.exe");
		    driver = new InternetExplorerDriver();
		}
	}
	@Test
	public void test1()
	{
		driver.get("https://google.com");
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
		System.out.println("Test Completed Successfully....");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
}