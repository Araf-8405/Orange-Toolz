package seleniumtestproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@SuppressWarnings("deprecation")
public class LoginFunctionalityTest {

	public static WebDriver getDriver() {
		// TODO Auto-generated method stub


		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe" );
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 return driver;
	}

}
