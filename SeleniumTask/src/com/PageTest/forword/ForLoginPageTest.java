package com.PageTest.forword;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.PageLogin.ForLoginPage;
import com.webtest.core.BaseTest;



public class ForLoginPageTest extends BaseTest{
	
	String baseUrl ="http://localhost:8032/zl_shop/index.php/Login/login.html";
	@BeforeClass
	public void setup(){		
		webtest.open(baseUrl);		
	}
	
	@Test(priority=0)
	public void loginFail1() throws InterruptedException{
		ForLoginPage LG=new ForLoginPage(webtest);
		LG.LoginFailed1("11111111" ,"123456");
		assertTrue(webtest.getHtmlSource().contains("’À∫≈ªÚ√‹¬Î¥ÌŒÛ"));
	}
	
	@Test(priority=1)
	public void loginFail2() throws InterruptedException{
		ForLoginPage LG=new ForLoginPage(webtest);
		LG.LoginFailed2("»Ìº˛≤‚ ‘406" ,"12345666");
		assertTrue(webtest.getHtmlSource().contains("’À∫≈ªÚ√‹¬Î¥ÌŒÛ"));
	}
	
	@Test(priority=2)
	public void loginSuccess() throws Exception{
		ForLoginPage LG=new ForLoginPage(webtest);
		LG.LoginSuccess("»Ìº˛≤‚ ‘406","123456");
		assertTrue(webtest.getHtmlSource().contains("ÕÀ≥ˆ"));
	}
}
