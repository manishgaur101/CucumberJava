package com.actions.web;

import java.lang.reflect.InvocationTargetException;

import com.objects.web.HomePage;

import pojectContext.AppContext;
import pojectContext.Context;
import pojectContext.PageContext;
import pojectContext.TestContext;

public class TypeAction {
TestContext testContext;
PageContext pageContext;
//AppContext appContext;
AppContext appContext = new AppContext();
//Context context;

public TypeAction(){
	
}
	public TypeAction(TestContext testContext,PageContext pageContext,AppContext appContext) {
		this.testContext = testContext;
		this.pageContext = pageContext;
		this.appContext = appContext;
		//this.context = appContext;
	}
	
	public void typeText(String elementName,String value,String page){
		//appContext.setUpContext(page);
		Object obj = appContext.getContextObject(appContext.getContext());
		try {
			obj.getClass().getMethod("showMessage").invoke(obj);
		} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException
				| SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Extent
		//Log4j
	}
	
	public static void main(String[] str){
		TypeAction typeObj  = new TypeAction();
		typeObj.typeText("A", "B", "home");
	}
}
