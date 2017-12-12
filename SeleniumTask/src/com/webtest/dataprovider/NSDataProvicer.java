package com.webtest.dataprovider;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NSDataProvicer {

	@DataProvider(name="s1")
	public static Object[][] getTxt(){
		FileDataProvider ft = new FileDataProvider("data/news.txt");
		return ft.getTestDataByTxt();
	}
	
	@DataProvider(name="s2")
	public static Object[][] getTxt1(){
		FileDataProvider ft = new FileDataProvider("data/notice.txt");
		return ft.getTestDataByTxt();
	}
	
//	@DataProvider(name="s10")
//	public static Object[][] getXsl() throws IOException{
//		ExcelDataProvider ft = new ExcelDataProvider("data/testData.xlsx","Sheet1");
//		return ft.getTestDataByExcel();
//	}
	
	
}
