package com.PageLogin;

import com.webtest.core.WebDriverEngine;

public class ForLoginPage {
	
    public WebDriverEngine webtest;
    public ForLoginPage(WebDriverEngine webtest) {
		this.webtest = webtest;
		
    }

 
	public void LoginSuccess(String name, String password) throws InterruptedException {
		// TODO Auto-generated method stub
        Thread.sleep(3000);
        webtest.type("name=username",name);
		webtest.type("name=password",password);
		webtest.click("xpath=//input[@type='submit']");
	}
	
	public void LoginFailed1(String name, String password) throws InterruptedException {
		// TODO Auto-generated method stub
	
        Thread.sleep(3000);
        webtest.type("name=username",name);
		webtest.type("name=password",password);
		webtest.click("xpath=//input[@type='submit']");
	}
	
	public void LoginFailed2(String name, String password) throws InterruptedException {
		// TODO Auto-generated method stub
	
        Thread.sleep(3000);
        webtest.type("name=username",name);
		webtest.type("name=password",password);
		webtest.click("xpath=//input[@type='submit']");
	}
	
	
}
