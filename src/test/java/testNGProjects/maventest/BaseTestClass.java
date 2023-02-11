package testNGProjects.maventest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.DashBoard;
import pages.ZerodhaLogin;

public class BaseTestClass {

static WebDriver driver;
		
		ZerodhaLogin login;
		// declare the instance of page classes
		DashBoard dash;
		@BeforeSuite
		public void LaunchApp() {
			WebDriverManager.chromedriver().setup();
			
			ChromeOptions option=new ChromeOptions();
			option.addArguments("--start-maximized");
			
			driver=new ChromeDriver(option);
			
			driver.get("https://kite.zerodha.com/");
		}
		
		@BeforeClass
		public void createObject() {
			login=new ZerodhaLogin(driver);
			// create the instance and pass parameter as driver
			dash=new DashBoard(driver);
		}
	}


