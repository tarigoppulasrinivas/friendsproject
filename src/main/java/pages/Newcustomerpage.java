package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Newcustomerpage extends Basepage {
	
	WebDriver driver;
	 public Newcustomerpage(WebDriver driver) {
		 super(driver);
		this.driver=driver; 
		 
	 }
     //locators
	   By LOGIN= By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]");
		By NewCustomer= By.xpath("/html/body/div[3]/div/ul/li[2]/a");
	    By CustomerName=By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input");
	    By DateofBirth= By.xpath("//*[@id=\"dob\"]");
	    By Address= By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/textarea");
	    By City= By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input");
	    By State= By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[9]/td[2]/input");
	    By PIN= By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[10]/td[2]/input");
	    By MobileNumber= By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input");
	    By Email= By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[12]/td[2]/input");
	    By password= By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[13]/td[2]/input");
	    By Submit= By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[14]/td[2]/input[1]");
	    
	  public void Newcustomer_details(String name,String DOB,String adrs,String city,String state,String pin,String mbln,String mail,String pw){
		  
		  click(NewCustomer);
		    refresh();
		    click(NewCustomer);
		    sendkeys(CustomerName,name);
		    sendkeys(DateofBirth,DOB);
		    sendkeys(Address,adrs);
		    sendkeys(City,city);
		    sendkeys(State,state);
		    sendkeys(PIN,pin);
		    sendkeys(MobileNumber,mbln);
		    sendkeys(Email,mail);
		    sendkeys(password,pw);
		   click(Submit);
		    
	    }
}
