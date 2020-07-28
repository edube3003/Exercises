package com.richmond.webdriverjava.sampleapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgottenPasswordConfirmationPage {
	
	private WebDriver driver;
	
	private By confirmation = By.id("content");
	
	public ForgottenPasswordConfirmationPage (WebDriver driver) {
		this.driver=driver;
	}
	
	public String getConfirmationString () {
		return driver.findElement(confirmation).getText();
		
	}
	

}
