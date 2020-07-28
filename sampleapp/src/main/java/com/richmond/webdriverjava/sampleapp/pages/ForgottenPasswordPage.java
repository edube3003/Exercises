package com.richmond.webdriverjava.sampleapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgottenPasswordPage {
	
	private WebDriver driver;
	private By emailField = By.id("email");
	private By submitButton = By.id("form_submit");
	
	
	public ForgottenPasswordPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public void setEmail (String email) {
		driver.findElement(emailField).sendKeys(email);
	}
	
	public ForgottenPasswordConfirmationPage clicksubmitButton () {
		driver.findElement(submitButton).click();
		return new ForgottenPasswordConfirmationPage (driver);
	}

}
 