package com.PageTest.back;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.PageLogin.BackLoginPage;
import com.webtest.core.BaseTest;

public class OrderDetailTest extends BaseTest{

	@Test
	public void Login() throws Exception{
		webtest.open("http://localhost:8032/zl_shop/admin.php/Login/index.html");
		BackLoginPage LG=new BackLoginPage(webtest);
		LG.LoginSucceed();
		Thread.sleep(5000);
	}

	@Test
	public void TDetail() throws InterruptedException{
		webtest.click("xpath=//span[contains(.,' �������� ')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[@href='/zl_shop/admin.php/Orders/index']");
		Thread.sleep(3000);
		webtest.click("xpath=//i[contains(.,'����')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,'>>')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[@class='check_review_btn']");
		Thread.sleep(3000);
		webtest.click("xpath=//div[@class='top2']");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,'���ض����б�')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,'>>')]");
		Thread.sleep(3000);
		webtest.click("xpath=//a[contains(.,'��������')]");
	}
	@Test(dependsOnMethods="TDetail")
	public void MDetail() throws InterruptedException{
		webtest.click("xpath=//a[contains(.,'�������')]");
		assertTrue(webtest.getHtmlSource().contains("�ѷ���"));
		
	}
	@Test(dependsOnMethods="MDetail")
	public void DDetail() throws InterruptedException{
		webtest.click("xpath=//i[contains(.,'ɾ��')]");
		
	}
}
