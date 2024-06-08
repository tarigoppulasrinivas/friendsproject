package friendsproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pages.fblogin;

public class fbtest {
	
	WebDriver driver;
	fblogin FBL;
	Properties prop;
	
	@BeforeTest

	void fbsetup() throws IOException {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		FBL = new fblogin(driver);
		prop = new Properties();
		FileInputStream file = new FileInputStream("C:/Users/pc/eclipse-workspace/friendsproject/src/test/resources/confif.properties2");
	    prop.load(file);
		
	}
	
	
	

	@AfterTest
	void closefb() {
		
		driver.close();
	}
}
