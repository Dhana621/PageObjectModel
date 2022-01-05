package com.testng1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertionss {

	String name = "agni";
	
	@Test
	private void checkEqual() {
Assert.assertNotEquals(name, "agni");
	}
	
}
