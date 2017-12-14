package com.PageTest.forword;

import org.testng.annotations.Test;

import com.PageLogin.ForLoginPage;
import com.webtest.core.BaseTest;

public class PriceTest extends BaseTest{

	@Test
	public void Login() throws Exception{
		webtest.open("http://localhost:8032/zl_shop/index.php/Login/login.html");
		ForLoginPage LG=new ForLoginPage(webtest);
		LG.LoginSuccess("»Ìº˛≤‚ ‘406","123456");
	}
	
	@Test(dependsOnMethods="Login")
	public void underClick() throws InterruptedException{
		// TODO Auto-generated method stub
		webtest.click("xpath=//*[@id='navitems']/ul/li[5]/a");	
		Thread.sleep(5000);
	}
	@Test(dependsOnMethods="underClick")
	public void priceClick() throws InterruptedException{
		webtest.click("xpath=//a[@tag='100_300']");
		Thread.sleep(5000);
	}
	@Test(dependsOnMethods="priceClick")
	public void LB() throws InterruptedException{
		webtest.type("xpath=//input[@name='egt']","300");
		webtest.type("xpath=//input[@name='elt']","500");
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(5000);	
	}
	
	@Test(dependsOnMethods="priceClick")
	public void BL() throws InterruptedException{
		webtest.type("xpath=//input[@name='egt']","500");
		webtest.type("xpath=//input[@name='elt']","200");
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(5000);	
	}
	@Test(dependsOnMethods="priceClick")
	public void ZB() throws InterruptedException{
		webtest.type("xpath=//input[@name='elt']","500");
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(5000);	
	}
	@Test(dependsOnMethods="priceClick")
	public void BZ() throws InterruptedException{
		webtest.type("xpath=//input[@name='egt']","500");
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(5000);	
	}
}
