package com.demout.newtours.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookFlight {
	
	@FindBy(name="passFirst0")
	private WebElement name;
	
	@FindBy(name="passLast0")
	private WebElement lname;
	
	@FindBy(name="creditnumber")
	private WebElement cc;
	
	@FindBy(name="buyFlights")
	private WebElement submit;
	
	public BookFlight(WebDriver driver) {
		PageFactory.initElements(driver, this);
			}
	
	public void flightBooking(String fn, String ln, String num) {
		
		name.sendKeys(fn);
		lname.sendKeys(ln);
		cc.sendKeys(num);
		submit.click();
		
		
		
	}

}
