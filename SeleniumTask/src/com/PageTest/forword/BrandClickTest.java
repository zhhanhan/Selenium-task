package com.PageTest.forword;

import org.testng.annotations.Test;

import com.PageLogin.ForLoginPage;
import com.webtest.core.BaseTest;

public class BrandClickTest extends BaseTest{

	@Test
	public void Login() throws Exception{
		webtest.open("http://localhost:8032/zl_shop/index.php/Login/login.html");
		ForLoginPage LG=new ForLoginPage(webtest);
		LG.LoginSuccess("软件测试406","123456");
		Thread.sleep(5000);
	}
	@Test(dependsOnMethods="Login")
	public void Click() throws InterruptedException{

		webtest.click("xpath=//*[@id='navitems']/ul/li[7]/a");	
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,'KAILAS')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,'不限')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,'Jack Wolfskin')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,'ARCTERYX')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,'稻草人')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,'Paul Frank')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,'speedo')]");
		Thread.sleep(3000);
		
	
	}
}
