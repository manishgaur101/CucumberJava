package com.objects.web;

import org.openqa.selenium.WebElement;

import pojectContext.AppContext;
import pojectContext.Context;

public class HomePage extends AppContext implements Context<HomePage> {
	
	
	public WebElement userName(){
		Object obj = null;
		return (WebElement) obj;
	}
	
	public void showMessage(){
		System.out.println("MANISH");
	}

	@Override
	public HomePage setContext() {
		// TODO Auto-generated method stub
		return new HomePage();
	}
	
	public WebElement getField(String element){
		if(element.toUpperCase().equalsIgnoreCase("username")){
			return userName();
		}
		return null;
	}

}
