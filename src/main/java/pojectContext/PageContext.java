package pojectContext;

import org.openqa.selenium.WebElement;

import com.objects.web.DashboardPage;
import com.objects.web.HomePage;
import com.objects.web.LoginPage;
import com.objects.web.LogoutPage;

public class PageContext {
//Contains all WebPages contexts
	LoginPage loginPage;
	LogoutPage logoutPage;
	DashboardPage dashboardPage;
	HomePage homePage;
	AppContext appContext;
	//will write a constructor to initialize every pages from pico container
	// what if we have 500 pages? will we mention 500 parameters?
	
	public PageContext(AppContext appContext,LoginPage loginPage){
		this.appContext = appContext;
		this.loginPage = loginPage;
	}
	
	public HomePage getHomePage(){
		return new HomePage();
	}
	
	public LoginPage getLoginPage(){
		return loginPage;
	}
	
	
	/*public WebElement getWebElement(String elementName){
		WebElement element= null;
		WebElement element= appContext.context;
		return element;
	}
	*/
}
