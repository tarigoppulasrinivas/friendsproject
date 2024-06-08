package friendsproject;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

//srinu

public class Gurutest extends Basetest {

   WebDriver driver;
   
   @Test
   void login() {
	   
	lp.login_details(prop.getProperty("Id"),prop.getProperty("pw"));   
	   
	   
   }
   
   @Test
	void newcustomerlogin() {
	   
	   NCP.Newcustomer_details(prop.getProperty("Customername"),prop.getProperty("DOB"),prop.getProperty("adrs"),prop.getProperty("city"),prop.getProperty("State"),prop.getProperty("PIN"),prop.getProperty("MobileNumber"),prop.getProperty("Email"),prop.getProperty("password"));  
	   
   }
	
}
