package com.PageTest.back;

import org.testng.annotations.Test;

import com.PageLogin.BackLoginPage;
import com.webtest.core.BaseTest;

public class MemberReviseTest extends BaseTest{

	@Test
	public void Login() throws Exception{
		webtest.open("http://localhost:8032/zl_shop/admin.php/Login/index.html");
		BackLoginPage LG=new BackLoginPage(webtest);
		LG.LoginSucceed();
		Thread.sleep(5000);
	}
	@Test
	public void Revise() throws InterruptedException{
		webtest.click("xpath=//span[contains(.,' �û����� ')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[@href='/zl_shop/admin.php/Users/index']");
		Thread.sleep(3000);
		webtest.click("xpath=//i[contains(.,'�޸�')]");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@value='Ů']");

		webtest.click("xpath=//button[@type='submit']");
	}
}
