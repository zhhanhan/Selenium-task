package com.PageTest.forword;

import org.testng.annotations.Test;

import com.PageLogin.ForLoginPage;
import com.webtest.core.BaseTest;

public class SportRushTest extends BaseTest{


	@Test
	public void Login() throws Exception{
		webtest.open("http://localhost:8032/zl_shop/index.php/Login/login.html");
		ForLoginPage LG=new ForLoginPage(webtest);
		LG.LoginSuccess("软件测试406","123456");
		Thread.sleep(5000);
	}
	@Test(dependsOnMethods="Login")
	public void sportClick() throws InterruptedException{
		// TODO Auto-generated method stub
		webtest.click("xpath=//*[@id='navitems']/ul/li[6]/a");
		
		Thread.sleep(5000);
	}
	@Test(dependsOnMethods="sportClick")
	public void Rush() throws InterruptedException{
		webtest.click("xpath=//a[contains(.,'本千2015夏棉麻短袖t恤 女套装民族风宽松大码两件套长裙亚麻女装')]");
		Thread.sleep(3000);	
	}
	

}
