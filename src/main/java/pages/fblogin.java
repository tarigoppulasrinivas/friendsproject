package pages;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.browsingcontext.Locator;

public class fblogin extends Basepage2{

	   WebDriver driver;
	   public fblogin(WebDriver driver) {
		   super(driver);
		  this.driver=driver; 
		  
	   }
	   
	   //locators
	   By phonenumber= By.xpath("//*[@id=\"email\"]");
	   By password= By.xpath("//*[@id=\"pass\"]");
	   By login= By.name("login");
	   
	   public void fblogindetails(String mail,String pwd) {
		   sendkeys(phonenumber,mail);
		   sendkeys(password,pwd);
		   click(login);
		   
		   
		   
	   }

	
	}
	   


