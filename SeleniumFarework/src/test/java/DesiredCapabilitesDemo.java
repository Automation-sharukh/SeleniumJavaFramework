import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCapabilitesDemo {

	public static void main(String[] args) 
	{
		String ProjectPath = System.getProperty("user.dir");
		System.out.println("Project path"+ProjectPath);
		
		DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("ignoreProtectedModeSettings",true);
        
		System.setProperty("webdriver.ie.driver",ProjectPath+"/drivers/iedriver/IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver(caps);

		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Automation Testing");
		driver.findElement(By.name("btnK")).click();
		
		driver.close();
		driver.quit();

	}

}
