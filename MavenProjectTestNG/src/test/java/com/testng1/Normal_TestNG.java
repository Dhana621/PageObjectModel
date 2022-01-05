package com.testng1;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class Normal_TestNG {

	@Test (timeOut = 2000 , expectedExceptions = ThreadTimeoutException.class)
	private void kio_ken_10() throws Exception {
		Thread.sleep(3000);
System.out.println("kio ken times 10");
	}                         
}
