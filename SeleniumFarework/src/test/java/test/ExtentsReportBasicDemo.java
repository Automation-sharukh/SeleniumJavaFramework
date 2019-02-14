package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentsReportBasicDemo {

	private static WebDriver driver = null;
  public static void main(String[] args) 
  {
	  //start reports
	ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("ExtentsReport.html");
	
	//create ExtentsReports and  attach reports
	ExtentReports extent = new ExtentReports();
	extent.attachReporter(htmlReporter);
	
	//creates a toggle for the given test, adds all log events under it
	ExtentTest test1 =extent.createTest("MyFisrtTest","this is test for google search...");
	
	
	String ProjectPath = System.getProperty("user.dir");
	System.out.println("Project path"+ProjectPath);
	System.setProperty("webdriver.chrome.driver",ProjectPath+"/drivers/chromedriver/chromedriver.exe");
    driver= new ChromeDriver();
    
    test1.log(Status.INFO, "Satrting Test Case....");
	 
    driver.get("https://google.com");
    
    test1.pass("Navigate to google.com ");
    
    driver.findElement(By.name("q")).sendKeys("Automation Testing");
    
    test1.pass("Entered text in saerchbox");
    
    driver.findElement(By.name("btnK")).click();
    
    test1.pass("Press Keyboard EnterKey");
    
    driver.close();
    driver.quit();
    
    test1.pass("Test Completed...");
    
    extent.flush();
	
  }

}
