package com.testng1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnotations {
	@BeforeSuite
	private void beforeSuite() {
		System.out.println("BeforeSuite");
	}

	@AfterSuite
	private void afterSuite() {
		System.out.println("AfterSuite");
	}

	@Test
	private void normalTest() {
		System.out.println("normalTest");
	}

	@BeforeMethod
	private void beforeMethod() {
		System.out.println("BeforeMethod");
	}

	@AfterMethod
	private void afterMethod() {
		System.out.println("AfterMethod");
	}

	@BeforeClass
	private void beforeClass() {
		System.out.println("BeforeClass");
	}

	@Test
	private void normalTest111() {
		System.out.println("normalTest111");
	}

	@AfterClass
	private void afterClass() {
		System.out.println("AfterClass");
	}

	@BeforeTest
	private void beforeTest() {
		System.out.println("BeforeTest");
	}

	@AfterTest
	private void afterTest() {
		System.out.println("AfterTest");
	}

	@BeforeSuite
	private void beforeSuite1() {
		System.out.println("Second BeforeSuite");
	}

	@AfterTest
	private void afterSuite11() {
		System.out.println("Second after Suite");
	}

	@Test
	private void test33() {
		System.out.println("test33");
	}

	@BeforeClass
	private void beforeClass111() {
		System.out.println("Second before Class");
	}
}
