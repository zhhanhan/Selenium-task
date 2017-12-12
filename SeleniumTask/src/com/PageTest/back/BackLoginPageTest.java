package com.PageTest.back;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.PageLogin.BackLoginPage;
import com.webtest.core.BaseTest;

public class BackLoginPageTest extends BaseTest{
	
	String baseUrl ="http://localhost:8032/zl_shop/admin.php/Login/index.html";
	@Test
	public void loginSuccess() throws Exception{
		webtest.open(baseUrl);
		BackLoginPage LG=new BackLoginPage(webtest);
		LG.LoginSucceed();
		assertTrue(webtest.getHtmlSource().contains("Ê×Ò³"));
	}
}
