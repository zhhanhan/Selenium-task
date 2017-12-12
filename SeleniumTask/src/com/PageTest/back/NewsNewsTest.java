 package com.PageTest.back;

import org.testng.annotations.Test;

import com.PageLogin.BackLoginPage;
import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvicer;

public class NewsNewsTest extends BaseTest{

	@Test
	public void Login() throws Exception{
		webtest.open("http://localhost:8032/zl_shop/admin.php/Login/index.html");
		BackLoginPage LG=new BackLoginPage(webtest);
		LG.LoginSucceed();
		Thread.sleep(5000);
	}

	@Test
	public void News() throws InterruptedException{
		webtest.click("xpath=//span[contains(.,' 新闻管理 ')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[@href='/zl_shop/admin.php/News/index']");
		Thread.sleep(3000);
		webtest.click("xpath=//a[@href='/zl_shop/admin.php/News/add']");
		Thread.sleep(3000);
	}
	@Test(dependsOnMethods="News")
	public void News1() throws InterruptedException{
		webtest.click("xpath=//button[@type='submit']");
		Thread.sleep(3000);
	}
	@Test(dependsOnMethods="News")
	public void News2() throws InterruptedException{
		webtest.type("xpath=//input[@placeholder='请输入新闻标题']","标题");
		webtest.click("xpath=//button[@type='submit']");
		Thread.sleep(3000);	
	}
	@Test(dependsOnMethods="News")
	public void News3() throws InterruptedException{
		webtest.click("xpath=//*[@id='main-container']/div/div[2]/div[2]/div[2]/div/form/div[3]/div/input[1]");
		webtest.click("xpath=//button[@type='submit']");
		Thread.sleep(3000);
	}
	@Test(dependsOnMethods="News")
	public void News4() throws InterruptedException{
		webtest.type("xpath=//textarea[@name='content']","aaaaaa");
		webtest.click("xpath=//button[@type='submit']");
		Thread.sleep(3000);
	}
	@Test(dependsOnMethods="News",dataProvider="s1",dataProviderClass=NSDataProvicer.class)
	public void News5(String title,String content) throws InterruptedException{
		webtest.type("xpath=//input[@placeholder='请输入新闻标题']", title);
		webtest.click("xpath=//*[@id='main-container']/div/div[2]/div[2]/div[2]/div/form/div[3]/div/input[1]");
		webtest.type("xpath=//textarea[@name='content']", content);
		webtest.click("xpath=//button[@type='submit']");
		Thread.sleep(3000);
	}
	@Test(dependsOnMethods="News")
	public void News6() throws InterruptedException{
		webtest.type("xpath=//input[@placeholder='请输入新闻标题']", "aaaa");
		webtest.click("xpath=//button[@type='reset']");
		webtest.type("xpath=//input[@placeholder='请输入新闻标题']", "bbbb");
		webtest.click("xpath=//button[@type='submit']");
		Thread.sleep(3000);
	}
}
