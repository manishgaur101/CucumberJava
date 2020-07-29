package com.actions.web;

import pojectContext.AppContext;
import pojectContext.Context;
import pojectContext.TestContext;

public class NavigateToAction {

	TestContext testContext;
	AppContext appContext;
	
	Context context;
	public NavigateToAction(TestContext testContext){
		this.testContext = testContext;
	}
	
	public void navigateTo(String url){
		testContext.getWebManager().get(url);
	}
	
	public void context(String page){
		//appContext.AppPageContext(page).setContext();
		//appContext.setUpContext(page);
		appContext.setContext(page);
	}
}
