package com.PageTest.back;

import org.testng.annotations.Test;

import com.PageLogin.BackLoginPage;
import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvicer;

public class NewsNoticesTest extends BaseTest{

	@Test
	public void Login() throws Exception{
		webtest.open("http://localhost:8032/zl_shop/admin.php/Login/index.html");
		BackLoginPage LG=new BackLoginPage(webtest);
		LG.LoginSucceed();
		Thread.sleep(5000);
	}

	@Test
	public void Notice() throws InterruptedException{
		webtest.click("xpath=//span[contains(.,' 新闻管理 ')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[@href='/zl_shop/admin.php/News/index']");
		Thread.sleep(3000);
		webtest.click("xpath=//a[@href='/zl_shop/admin.php/Notices/add']']");
		Thread.sleep(3000);
	}
	@Test(dependsOnMethods="Notice")
	public void Notice1() throws InterruptedException{
		webtest.click("xpath=//button[@type='submit']");
		Thread.sleep(3000);
	}
	@Test(dependsOnMethods="Notice")
	public void Notice2() throws InterruptedException{
		webtest.type("xpath=//input[@name='title']","标题");
		webtest.click("xpath=//button[@type='submit']");
		Thread.sleep(3000);	
	}
	@Test(dependsOnMethods="Notice")
	public void Notice3() throws InterruptedException{
		webtest.type("xpath=//textarea[@name='content']","aaaaaa");
		webtest.click("xpath=//button[@type='submit']");
		Thread.sleep(3000);
	}
	@Test(dependsOnMethods="Notice",dataProvider="s2",dataProviderClass=NSDataProvicer.class)
	public void Notice4(String titles,String contents) throws InterruptedException{
		webtest.type("xpath=//input[@name='title']", titles);
		webtest.type("xpath=//textarea[@name='content']", contents);
		webtest.click("xpath=//button[@type='submit']");
		Thread.sleep(3000);
	}
	@Test(dependsOnMethods="Notice")
	public void Notice5() throws InterruptedException{
		webtest.type("xpath=//input[@name='title']", "aaaa");
		webtest.click("xpath=//button[@type='reset']");
		webtest.type("xpath=//input[@name='title']", "bbbb");
		webtest.click("xpath=//button[@type='submit']");
		Thread.sleep(3000);
	}	
}
