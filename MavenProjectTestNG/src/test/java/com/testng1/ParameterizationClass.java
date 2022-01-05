package com.testng1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class ParameterizationClass {
@Test  @Parameters("name")
	public void printName1(String name) {
System.out.println("i am "+name);
	}


@Test  @Parameters("age")
	private void printAge(int age) {
System.out.println("my age is "+age);
	}
	
	
}
