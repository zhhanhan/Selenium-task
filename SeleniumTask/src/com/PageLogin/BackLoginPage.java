package com.PageLogin;

import com.webtest.core.WebDriverEngine;

public class BackLoginPage {

	public WebDriverEngine webtest;
    public BackLoginPage(WebDriverEngine webtest) {
		this.webtest = webtest;	
    }

 //   String baseUrl ="http://localhost:8032/zl_shop/admin.php/Login/index.html";
//    public void LoginSucceed() throws InterruptedException {
//		// TODO Auto-generated method stub
//        Thread.sleep(3000);
//        webtest.type("xpath=//input[@name='name']","admin");
//		webtest.type("name=password","admin");
//		webtest.click("xpath=//input[@type='submit']");
//	}

	public void LoginSucceed() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(5000);
		webtest.type("xpath=//input[@name='name']", "admin");
		webtest.type("xpath=//input[@name='password']", "admin");
		webtest.click("xpath=//button[@type='submit']");
	}

}
