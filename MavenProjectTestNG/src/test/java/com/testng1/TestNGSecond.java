package com.testng1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGSecond {
WebDriver driver;
long startTime;
long endTime;

	@Test 
	private void openGoogle() {
		driver.get("https://www.google.com/");		
	}
	
	
	@Test 
	public void openYahoo() {
driver.get("https://in.search.yahoo.com/?fr2=inr");
	}
	
	@BeforeSuite
	private void beforeAll() {
		startTime = System.currentTimeMillis();
		 driver = new ChromeDriver();
	}
	
@AfterSuite
private void afterAll() {
	driver.quit();
	 endTime = System.currentTimeMillis();
	long totalTime = endTime -  startTime;
	System.out.println(totalTime);
}
}
