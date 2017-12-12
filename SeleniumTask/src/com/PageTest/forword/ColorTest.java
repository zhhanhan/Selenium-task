package com.PageTest.forword;

import static org.testng.Assert.assertTrue;

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
		webtest.click("linkText=����");	
		Thread.sleep(5000);
	}
	@Test(dependsOnMethods="underClick")
	public void colorClick() throws InterruptedException{
		webtest.click("xpath=//a[contains(.,'��ɫ')]");
		Thread.sleep(5000);
	}
	@Test(dependsOnMethods="colorClick")
	public void moreColor() throws InterruptedException{
		webtest.click("xpath=//a[contains(.,'����')]");
		Thread.sleep(5000);
		assertTrue(webtest.getHtmlSource().contains("����"));
		Thread.sleep(5000);
	}
	@Test(dependsOnMethods="moreColor")
	public void retractColor() throws InterruptedException{
		webtest.click("xpath=//a[contains(.,'����')]");
		Thread.sleep(5000);
		assertTrue(webtest.getHtmlSource().contains("����"));
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
