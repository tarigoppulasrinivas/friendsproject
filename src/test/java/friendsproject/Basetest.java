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

import pages.Loginpage;
import pages.Newcustomerpage;

public class Basetest {
	
	WebDriver driver;
	Loginpage lp;
	Newcustomerpage NCP;
	Properties prop;
	
	@BeforeTest
	void setup() throws IOException {
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/v4/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.navigate().refresh();
	lp =new Loginpage(driver);
	NCP = new Newcustomerpage(driver);
	prop = new Properties();
	FileInputStream file = new FileInputStream("C:\\Users\\pc\\eclipse-workspace\\friendsproject\\src\\test\\resources\\config.properties");
	prop.load(file);

}
	@AfterTest
	void closeapp() {
		driver.quit();
	}
	}