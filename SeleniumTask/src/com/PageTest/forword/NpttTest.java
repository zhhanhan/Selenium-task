package com.PageTest.forword;

import org.testng.annotations.Test;

import com.PageLogin.ForLoginPage;
import com.webtest.core.BaseTest;

public class NpttTest extends BaseTest{

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
	public void proceedsClick() throws InterruptedException{
		webtest.click("xpath=//a[contains(.,'����')]");	
		Thread.sleep(5000);
	}
	@Test(dependsOnMethods="proceedsClick")
	public void priceClick() throws InterruptedException{
		webtest.click("xpath=//a[contains(.,'�۸�')]");	
		Thread.sleep(5000);
	}
	@Test(dependsOnMethods="priceClick")
	public void talkClick() throws InterruptedException{
		webtest.click("xpath=//a[contains(.,'������')]");	
		Thread.sleep(5000);
	}
	@Test(dependsOnMethods="talkClick")
	public void timeClick() throws InterruptedException{
		webtest.click("xpath=//a[contains(.,'�ϼ�ʱ��')]");	
		Thread.sleep(5000);
	}
}
