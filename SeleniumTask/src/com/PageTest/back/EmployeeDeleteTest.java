package com.PageTest.back;

import org.testng.annotations.Test;

import com.PageLogin.BackLoginPage;
import com.webtest.core.BaseTest;

public class EmployeeDeleteTest extends BaseTest{

	@Test
	public void Login() throws Exception{
		webtest.open("http://localhost:8032/zl_shop/admin.php/Login/index.html");
		BackLoginPage LG=new BackLoginPage(webtest);
		LG.LoginSucceed();
		Thread.sleep(5000);
	}
	@Test
	public void EDelete() throws InterruptedException{
		webtest.click("xpath=//span[contains(.,' �û����� ')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[@href='/zl_shop/admin.php/Admin/index']");
		Thread.sleep(3000);
		webtest.click("xpath=//a[@class='next']");
		Thread.sleep(3000);
		webtest.click("xpath=//i[contains(.,'ɾ��')]");
		webtest.getAlert().accept();
		
	}

}
