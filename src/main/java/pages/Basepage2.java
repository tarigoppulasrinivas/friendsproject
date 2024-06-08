package pages;

import javax.security.auth.login.LoginContext;
import javax.security.auth.login.LoginException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Basepage2 {
	
	WebDriver driver;
	
	public Basepage2(WebDriver driver) {
		this.driver=driver;
		
	} 
	
	void sendkeys(By locator,String text) {
		driver.findElement(locator).sendKeys(text);
		
	}

	void click(By locator) {
		driver.findElement(locator).click();
	
	}
}
