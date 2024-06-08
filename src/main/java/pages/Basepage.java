package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Basepage {
	
    WebDriver driver;
    
  public Basepage(WebDriver driver) {
	  this.driver=driver;
	  
  }
  
  void sendkeys(By locator,String text) {
	  driver.findElement(locator).sendKeys(text);  
	  
  }
  
  void click(By locator) {
	  
	  driver.findElement(locator).click();
  }
  void refresh() {
	  driver.navigate().refresh();
	  
  }
  
}
