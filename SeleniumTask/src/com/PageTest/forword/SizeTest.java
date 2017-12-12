package com.PageTest.forword;

import org.testng.annotations.Test;

import com.PageLogin.ForLoginPage;
import com.webtest.core.BaseTest;

public class SizeTest extends BaseTest{

	@Test
	public void Login() throws Exception{
		webtest.open("http://localhost:8032/zl_shop/index.php/Login/login.html");
		ForLoginPage LG=new ForLoginPage(webtest);
		LG.LoginSuccess("Èí¼þ²âÊÔ406","123456");
	}
	
	@Test(dependsOnMethods="Login")
	public void underClick() throws InterruptedException{
		// TODO Auto-generated method stub
		webtest.click("linkText=ÄÚÒÂ");	
		Thread.sleep(5000);
	}
	@Test(dependsOnMethods="underClick")
	public void sizeClick() throws InterruptedException{
		webtest.click("xpath=//a[contains(.,'3XL')]");	
	}
}
