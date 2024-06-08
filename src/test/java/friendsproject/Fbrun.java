package friendsproject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Fbrun extends fbtest{

	WebDriver driver;
	
	@Test
	void fblogindetails() {
		
		FBL.fblogindetails(prop.getProperty("phonenumber"),prop.getProperty("password"));
	}
	
	
}
