package com.demout.newtours.alltest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.demout.newtours.test.BookFlight;
import com.demout.newtours.test.Confirmation;
import com.demout.newtours.test.FlightFinder;
import com.demout.newtours.test.FlightSelection;
import com.demout.newtours.test.Login;

public class FlightConfirationMessge extends BaseClass {
	
	
	@Test
	public void confirmMessage() {
		
		Login ln = new Login(driver);
		FlightFinder ff = new FlightFinder(driver);
		FlightSelection fs = new FlightSelection(driver);
		BookFlight bf = new BookFlight(driver);
		Confirmation cm = new Confirmation(driver);
		
		ln.openBrowser("mercury", "mercury");
		ff.FindFlight();
		fs.selectFlight();
		bf.flightBooking("jv", "vj", "1234568");
		
		String expectedMessage = "Your itinerary has been booked!";
		String actualMessage = cm.mssg().getText();
		
		Assert.assertEquals(actualMessage, expectedMessage);
		
			}
	

	

}
