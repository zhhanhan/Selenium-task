package com.PageTest.forword;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.PageLogin.ForLoginPage;
import com.webtest.core.BaseTest;

public class ScrollTest extends BaseTest{

	WebDriver driver =null;

//	https://github.com/amanda-jyn
//	https://github.com/majiashuo
	@Test
	public void Login() throws Exception{
		webtest.open("http://localhost:8032/zl_shop/index.php/Login/login.html");
		ForLoginPage LG=new ForLoginPage(webtest);
		LG.LoginSuccess("�������406","123456");
	}
	
	@Test(dependsOnMethods="Login")
	public void testScrolling(){
		WebElement link =driver.findElement(By.linkText("����"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//������ָ��Ԫ�ص�λ��
		js.executeScript("argument[0].scrollIntoView()",link);
		//������ĳ����λ��
		js.executeScript("window.scrollBy(0,800)");	
		//���������������·�
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	@Test(dependsOnMethods="testScrolling")
	public void linkClick() throws InterruptedException{
		webtest.click("xpath=//a[contains(.,'ΨƷ��')]");	
		Thread.sleep(5000);
		assertTrue(webtest.getHtmlSource().contains("���¼"));
	}
}
