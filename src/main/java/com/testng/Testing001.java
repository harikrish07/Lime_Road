package com.testng;

import org.testng.annotations.Test;

import com.base.Base_class;

public class Testing001 extends Base_class {
	
	@Test
	private void setUp() {
	  browserLaunch("chrome");

	}

}
