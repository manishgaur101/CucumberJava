package com.objects.web;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pojectContext.AppContext;
import pojectContext.Context;
import pojectContext.TestContext;

public class LoginPage extends AppContext implements Context<LoginPage> {
	
	TestContext testContext;
	
	
	public LoginPage(TestContext testContext){
		this.testContext = testContext;
	}
	
	@FindBy(xpath = "//a[@title='Log in to your customer account']")
	WebElement sign_in_button;
	
	@FindBy(id = "email")
	WebElement email_text_box;
	
	@FindBy(id = "passwd")
	WebElement password_text_box;
	
	@FindBy(name = "SubmitLogin")
	WebElement submit_button;
	
	@FindBy(xpath = "//a[@title='Log me out']")
	WebElement logout_button;
	
		public LoginPage(){
		PageFactory.initElements(testContext.getWebManager(), this);
	}

		public TestContext getTestContext() {
			return testContext;
		}

		public WebElement getSign_in_button() {
			return sign_in_button;
		}

		public WebElement getEmail_text_box() {
			return email_text_box;
		}

		public WebElement getPassword_text_box() {
			return password_text_box;
		}

		public WebElement getSubmit_button() {
			return submit_button;
		}

		public WebElement getLogout_button() {
			return logout_button;
		}

		@Override
		public LoginPage setContext() {
			// TODO Auto-generated method stub
			return new LoginPage();
		}
		
		public WebElement getField(String element){
			if(element.toUpperCase().equalsIgnoreCase("SIGNINBUTTON"))
				return sign_in_button;
			return null;
		}

}
