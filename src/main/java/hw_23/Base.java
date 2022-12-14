package hw_23;


import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;


public class Base {
	protected WebDriver driver;
	protected HomePage homePage;
	
	@BeforeMethod
	public void setUp() {
		//System.setProperty("webdriver.gecko.driver", "/Users/marjanaurmy/eclipse-workspace/NYCHospitals/driver/geckodriver");
		WebDriverManager.firefoxdriver().setup(); 
		driver = new FirefoxDriver();
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		driver.get("https://www.nychealthandhospitals.org/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		homePage = new HomePage(driver);
		
	}
	
	@AfterMethod
	public void tearUp() {
		driver.quit();
	}

}

