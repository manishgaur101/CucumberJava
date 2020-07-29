package pojectContext;

import org.openqa.selenium.WebDriver;

import seleniumUtil.DriverManager;

public class TestContext {
	
	DriverManager webManager;
	
	public TestContext(){
		System.out.println("**********");
	}

	public WebDriver getWebManager() {
		this.webManager = new DriverManager();
		return webManager.getWebDriver();
	}
	
	public String getReportManager(){
		return "";
	}

}
