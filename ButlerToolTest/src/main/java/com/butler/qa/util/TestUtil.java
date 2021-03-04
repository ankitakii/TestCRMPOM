package com.butler.qa.util;

import com.butler.qa.base.TestBase;

public class TestUtil extends TestBase{
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;
	
	public void switchToFrame() {
		driver.switchTo().frame("mainpanel");
	}

}
