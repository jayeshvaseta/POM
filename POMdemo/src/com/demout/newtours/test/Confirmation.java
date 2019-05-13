package com.demout.newtours.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirmation {

	@FindBy(css="body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr:nth-child(1) > td:nth-child(2) > table > tbody > tr:nth-child(3) > td > p > font > b > font:nth-child(2)")
	private WebElement mssg;
	
	public Confirmation(WebDriver driver) {
		PageFactory.initElements(driver, this);
			}
	
	
	
	public WebElement mssg() {
		return mssg;
		
	}
	
	
}
