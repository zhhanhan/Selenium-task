package com.PageTest.forword;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.PageLogin.ForLoginPage;
import com.webtest.core.BaseTest;

public class RecommendTest extends BaseTest{

	@Test
	public void Login() throws Exception{
		webtest.open("http://localhost:8032/zl_shop/index.php/Login/login.html");
		ForLoginPage LG=new ForLoginPage(webtest);
		LG.LoginSuccess("软件测试406","123456");
	}
	
	@Test(dependsOnMethods="Login")
	public void underClick() throws InterruptedException{
		// TODO Auto-generated method stub
		webtest.click("xpath=//*[@id='navitems']/ul/li[5]/a");	
		Thread.sleep(5000);
	}
	@Test(dependsOnMethods="underClick")
	public void goodClick() throws InterruptedException{
		webtest.click("xpath=//*[@id='mc']/div[2]/div[1]/div[2]/a");	
		Thread.sleep(5000);

	}
	@Test(dependsOnMethods="underClick")
	public void priceReduction() throws InterruptedException{
		webtest.click("xpath=//a[contains(.,'(降价通知)')]");	
	}
	@Test(dependsOnMethods="underClick")
	public void selectAdd() throws InterruptedException{
		webtest.click("xpath=//label[contains(.,'白色')]");
		webtest.click("xpath=//label[contains(.,'M')]");
		webtest.click("xpath=//a[@class='add']");
		webtest.click("xpath=//b[contains(.,'加入购物车')]");
	}
	@Test(dependsOnMethods="underClick")
	public void selectColor() throws InterruptedException{
		webtest.click("xpath=//label[contains(.,'白色')]");
		webtest.click("xpath=//b[contains(.,'加入购物车')]");
	}
	@Test(dependsOnMethods="underClick")
	public void selectSize() throws InterruptedException{
		webtest.click("xpath=//label[contains(.,'M')]");
		webtest.click("xpath=//b[contains(.,'加入购物车')]");
	}
	@Test(dependsOnMethods="underClick")
	public void addNum() throws InterruptedException{
		webtest.click("xpath=//a[@class='add']");
		webtest.click("xpath=//b[contains(.,'加入购物车')]");
	}
	@Test(dependsOnMethods="underClick")
	public void addtoCart() throws InterruptedException{
		webtest.click("xpath=//b[contains(.,'加入购物车')]");	
	}
	
}
