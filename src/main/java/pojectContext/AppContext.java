package pojectContext;

import org.openqa.selenium.WebElement;

import com.objects.web.HomePage;
import com.objects.web.LoginPage;

public class AppContext<T> {
	TestContext testContext;
	PageContext pageContext;
	static String context;

	public AppContext() {

	}

	public AppContext(TestContext testContext, PageContext pageContext) {
		this.testContext = testContext;
		this.pageContext = pageContext;
	}

	/**
	 * Method to get PageContext object access
	 * 
	 * @return
	 */
	public PageContext getPageContext() {
		return pageContext;
	}
	
	public String getContext() {
		return context;
	}

	/**
	 * Method to set the Context
	 * 
	 * @param page
	 * @return
	 */
	public Object getContextObject(String page) {
		Object home = null;
		Object login;
		switch (page.toUpperCase()) {
		case "HOME":
			home = pageContext.getHomePage();
			break;
		case "LOGIN":
			login = pageContext.getLoginPage();
			break;
		default:
			// coobjContexttext = pageContext.getLoginPage();
		}
		return home;

	}

	/**
	 * Method to extract WebElement using Reflection
	 * 
	 * @param elementName
	 *            is name of the element to found
	 * @param page
	 *            is page on which we want to search the element
	 * @return WebElement is the element
	 */
	public WebElement getElement(String elementName, String page) {
		WebElement element = null;
		Object obj = getContextObject(page);
		try {
			// calling child class methods using Reflection
			element = (WebElement) obj.getClass().getMethod("userName").invoke(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return element;
	}

	/**
	 * Method to get WebElement using DownCasting
	 * 
	 * @param element
	 * @param page
	 * @return
	 */
	public WebElement getWebElement(String element, String page) {
		Object obj = getContextObject(page);
		WebElement webElement = null;
		if (obj instanceof HomePage) {
			HomePage home = (HomePage) obj;
			home.getField(element);
		} else if (obj instanceof HomePage) {
			LoginPage login = (LoginPage) obj;
			login.getField(element);
		}

		return webElement;
	}

	public void setContext(String appContext) {
		context = appContext;

	}
}
