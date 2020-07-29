package com.steps.web;

import com.actions.web.TypeAction;

import io.cucumber.java.en.When;
import pojectContext.TestContext;

public class TypeActionsSteps {
TestContext testContext;
TypeAction typeAction = new TypeAction();	
	public TypeActionsSteps(TestContext testContext) {
		this.testContext = testContext;
	}
	
	@When("User enter text in {} field as {}")
	public void enterText(String elementName,String value) {
		
		//typeAction.typeText(elementName, value);
		typeAction.typeText(elementName, value, page);
		
	}
}
