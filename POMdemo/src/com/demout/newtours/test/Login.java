package com.demout.newtours.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login  {
	
	@FindBy(name="userName")
	private WebElement user;
	
	@FindBy(name="password")
	private WebElement pass;
	
	@FindBy(name="login")
    private WebElement submit;
	
	
	public Login(WebDriver driver) {
PageFactory.initElements(driver, this);
	}


	public void openBrowser(String sn, String pw) {
		user.sendKeys(sn);
		pass.sendKeys(pw);
		submit.click();
	}
	
	
	

}
