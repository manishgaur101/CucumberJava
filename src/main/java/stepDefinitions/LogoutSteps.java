package stepDefinitions;

import io.cucumber.java.en.Then;
import pojectContext.TestContext;

public class LogoutSteps {
	
	TestContext testContext;
	public LogoutSteps(TestContext testContext) {
		this.testContext = testContext;
	}
	
	
	@Then("Logout from the application")
	public void logout() {
		testContext.getWebManager();
		System.out.println("Logout successful");
	}
}
