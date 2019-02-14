package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSaerchPageObjects
{
	WebDriver driver = null;
	
  By textbox_search = By.xpath("//input[@title='Search']");
  By button_search  = By.name("btnK");
  
  public GoogleSaerchPageObjects(WebDriver driver){
	  this.driver = driver;
  }
  
  public void setTextInSearchBox(String text)
  {
	  driver.findElement(textbox_search).sendKeys(text);
  }
  
  public void clickSearchButton()
  {
	 driver.findElement(button_search).click(); 
  }
}
