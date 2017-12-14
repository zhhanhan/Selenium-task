package com.PageTest.forword;

import org.testng.annotations.Test;

import com.PageLogin.ForLoginPage;
import com.webtest.core.BaseTest;

public class ColorTest extends BaseTest{

	@Test
	public void Login() throws Exception{
		webtest.open("http://localhost:8032/zl_shop/index.php/Login/login.html");
		ForLoginPage LG=new ForLoginPage(webtest);
		LG.LoginSuccess("�������406","123456");
	}
	
	@Test(dependsOnMethods="Login")
	public void underClick() throws InterruptedException{
		// TODO Auto-generated method stub
		webtest.click("xpath=//*[@id='navitems']/ul/li[5]/a");	
		Thread.sleep(5000);
	}
	@Test(dependsOnMethods="underClick")
	public void colorClick() throws InterruptedException{
		webtest.click("xpath=//a[contains(.,'��ɫ')]");
		Thread.sleep(5000);
	}
	@Test(dependsOnMethods="underClick")
	public void morecheckColor(){
		webtest.click("xpath=//a[contains(.,'+ ��ѡ')]");
		webtest.click("xpath=//a[contains(.,'��ɫ')]");
		webtest.click("xpath=//a[contains(.,'����ɫ')]");
		webtest.click("xpath=//button[contains(.,'ȷ��')]");
	}
	@Test(dependsOnMethods="morecheckColor")
	public void checkColor(){
		webtest.click("xpath=//a[contains(.,'��ѡ')]");
		webtest.click("xpath=//a[contains(.,'��ɫ')]");
	}
	
}
