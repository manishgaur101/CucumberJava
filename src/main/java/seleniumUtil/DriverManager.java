package seleniumUtil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	WebDriver driver = null;
	
	public WebDriver getWebDriver(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}
}
