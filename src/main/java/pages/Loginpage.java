package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage extends Basepage {
	
	WebDriver driver;
	
	public Loginpage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	//locators
	
	By UserId= By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input");
	By Password= By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input");
	By LOGIN= By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]");
	
	//action methods
    public void login_details(String Id,String pw) {   
    	
    sendkeys(UserId,Id);
    sendkeys(Password,pw);
    click(LOGIN);

    }
   
    }