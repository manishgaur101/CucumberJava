package stepDefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pojectContext.TestContext;
import seleniumUtil.DriverManager;

public class LoginSteps {
	
	
	TestContext testContext;
	
	public LoginSteps(TestContext testContext) {
		this.testContext = testContext;
	}
	

	@Given("User is navigate to automationpractice Login Page")
	public void user_is_navigate_to_automationpractice_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("*************User is navigate to automationpractice Login Page****************");
	    testContext.getWebManager();
	}

	
	@Given("User login with below credentials")
	public void user_login_with_below_credentials(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps();
		for(int i = 0;i<data.size();i++){
		System.out.println(data.get(i).get("UserName"));
		System.out.println(data.get(i).get("Password"));
		}
	}



	@When("Click on Submit button")
	public void click_on_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User enters valid password");
	}

	@Then("Login should be successful")
	public void login_should_be_successful() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Login should be successful");
	}

	@Given("User enter credentials as {} and {}")
	public void user_enter_credentials(String userName,String password) {
	    System.out.println(userName);
	    System.out.println(password);
	}


	@Then("Login should not be successful")
	public void login_should_not_be_successful() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Login should not be successful");
	}

}
