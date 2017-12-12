package com.BeforePage;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import SendMail.Sendmail;

public class WebtestListener extends TestListenerAdapter{
	//Testָ����ÿһ����������
	public void onTestFailure(ITestResult result){
		System.out.println("����ִ��ʧ�ܣ�������־");
	}
	public void onTestSkipped(ITestResult result){
		System.out.println("����������Ծִ��");
	}
	public void onTestSuccess(ITestResult result){
		System.out.println("ִ�гɹ���");		
	}
	//3.��������������testng.xml�е�,test��ǩ��ʼǰ����ִ��

	public void onStart(ITestContext content){
		System.out.println("������ʼִ��");
	}
	
	public void onFinish(ITestContext content){
		System.out.println("����ִ����ϣ������ʼ�");
		Sendmail sendmail=new Sendmail();
		try {
			sendmail.setMail();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			sendmail.createMimeMessage(null, toString(), toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
}
