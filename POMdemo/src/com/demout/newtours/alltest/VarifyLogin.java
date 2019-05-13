package com.demout.newtours.alltest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.demout.newtours.test.FlightFinder;
import com.demout.newtours.test.Login;

public class VarifyLogin extends BaseClass {
	
	@Test
	public void varify() {

		Login ln = new Login(driver);
		FlightFinder fl = new FlightFinder(driver);

		ln.openBrowser("mercury", "mercury");
		boolean prnted = fl.getSignOff().isDisplayed();

		Assert.assertTrue(prnted);
	}

	
}
