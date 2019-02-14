import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest1 {

	public static void main(String[] args) 
	{    
		String ProjectPath = System.getProperty("user.dir");
		System.out.println("Project path"+ProjectPath);
		
		// System.setProperty("webdriver.gecko.driver",ProjectPath+"/drivers/geckodriver/geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();
		
	    System.setProperty("webdriver.chrome.driver",ProjectPath+"/drivers/chromedriver/chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    
	//	System.setProperty("webdriver.ie.driver",ProjectPath+"/drivers/iedriver/IEDriverServer.exe");
	//	WebDriver driver = new InternetExplorerDriver();
		
		
		driver.get("https://www.google.com/");
		
		 driver.findElement(By.name("q")).sendKeys("Automation Testing");
	//	WebElement textBox= driver.findElement(By.name("q"));
	//	           textBox.sendKeys("Automation Testing");
		try
		{
		    Thread.sleep(3000);
		} catch (InterruptedException e) 
		{
		    e.printStackTrace();
		}
		    driver.close();
	}

}
