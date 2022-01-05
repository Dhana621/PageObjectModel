package com.dataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CorrectUser_WrongPass {

@Test	 @Parameters({"username","password"})
private void loginWithCorrectUser(String user, String pass) {
WebDriver driver = new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/");

driver.findElement(By.id("txtUsername")).sendKeys(user);
driver.findElement(By.id("txtPassword")).sendKeys(pass);
driver.findElement(By.id("btnLogin")).click();
driver.quit();




		
}
}
