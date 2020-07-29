package com.steps.web;

import com.actions.web.NavigateToAction;

import io.cucumber.java.en.When;
import pojectContext.AppContext;

public class NavigateToSteps {
	NavigateToAction navigateToAction;
	AppContext appContext;
	
	public NavigateToSteps(NavigateToAction navigateToAction,AppContext appContext){
		this.navigateToAction = navigateToAction;
		this.appContext = appContext;
	}
	
	
	@When("User is at {} page")
	public void setPageContext(String page){
		//navigateToAction.navigateTo(page);
		navigateToAction.context(page);
	}

	
}
