package com.testng1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LearnParameters {
	@DataProvider (name = "login")
public  String[][] getData() 
{
	String [][] data= new String[2][2];
	
	data[0][0]="ravi@gmail.com";
	data[0][1]="pass123$";
	data[1][0]="rajesh@gmail.com";
	data[1][1]="1punchman";
	return data;
}

	@Test (dataProvider = "login")
	public void login(String user , String pass) {
    WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.get("https://www.facebook.com/");
    WebElement username = driver.findElement(By.name("email"));
	username.sendKeys(user);
	driver.findElement(By.id("pass")).sendKeys(pass);
	driver.findElement(By.name("login")).click();
	
	String title = driver.getTitle();
	System.out.println("title is "+title);
	
}
}