package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportDemoWithTestNG
{
	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test1;

	@BeforeSuite
	public void setUp()
	{
		//start reports
		htmlReporter = new ExtentHtmlReporter("Extents.html");

		//create ExtentsReports and  attach reports
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

	}

	@Test
	public void test1()
	{
		test1 =extent.createTest("MyFisrtTest","this is test for google search...");
		test1.pass("Navigate to google.com ");
		test1.pass("Entered text in saerchbox");
		test1.pass("Press Keyboard EnterKey");
	}
	@AfterSuite
	public void tearDown()
	{
		extent.flush();

	}
}
