package com.dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.testng1.DataUtil;
public class LearnDataProviderr {
	
	private String[] data;

	@Test  (dataProvider = "getData", dataProviderClass = DataUtil.class)
public void login (String user, String pass) {

		System.err.println("Email:"+data[0]);
		System.err.println("pass:"+data[1]);
		
		
		
		WebDriver driver = new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/");

driver.findElement(By.id("txtUsername")).sendKeys(user);
driver.findElement(By.id("txtPassword")).sendKeys(pass);
driver.findElement(By.id("btnLogin")).click();
driver.quit();
	}

}