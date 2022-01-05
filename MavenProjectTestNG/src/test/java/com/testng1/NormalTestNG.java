package com.testng1;

import org.testng.annotations.Test;

public class NormalTestNG {

	@Test(groups = {"dragon"})
	private void Goku() {
    System.out.println("Legend");
	}
	
	@Test(groups = {"Ball"})
	private void vegeta() {
    System.out.println("King");
	}
        
	@Test(groups = {"dragon"})
	private void gohan() {
    System.out.println("blessed");
	}
	
	@Test(groups = {"Ball"})
	private void piccolo() {
    System.out.println("teacher");
	}
            
}
