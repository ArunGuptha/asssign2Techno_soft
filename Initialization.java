package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class Initialization {

	
	 private static WebDriver driver = null;
	 private static final String  URL = "https://facebook.com/";
	 public static WebDriver getDriver() {
			return driver;
		}

		public static void setDriver(WebDriver driver) {
			Initialization.driver = driver;
		}

		@BeforeClass
	    public void intializeWebDriver() {
	        System.setProperty("webdriver.chrome.driver", "C://Selenium//chromedriver.exe");
	        driver = new ChromeDriver();

//	        System.setProperty("webdriver.gecko.driver", "/Users/mohammadmuntakim1/Downloads/geckodriver");
//	        driver = new FirefoxDriver();
	        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        driver.get(URL);
	    }
		@AfterClass
	    public void tearDown() {
	        if(driver != null) {
	            driver.manage().deleteAllCookies();
	            driver.manage().window().maximize();
	            driver.quit();
	        }}
}
