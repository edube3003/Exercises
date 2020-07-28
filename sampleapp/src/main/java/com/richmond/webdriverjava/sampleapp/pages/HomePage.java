package com.richmond.webdriverjava.sampleapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	private WebDriver driver;
	
	public HomePage (WebDriver driver) {
		this.driver = driver;
	}
	
	public LoginPage clickFormAuthentication () {
		ClickLink("Form Authentication");
		return new LoginPage(driver);
	}
	
	public DropDownPage clickDropDownLink () {
		ClickLink("Dropdown");
		return new DropDownPage(driver);
	}
	
	public ForgottenPasswordPage clickForgottenPasswordLink() {
		ClickLink ("Forgot Password");
		return new ForgottenPasswordPage(driver);
	}
	
	public HoversPage clickHoversLink () {
		ClickLink ("Hovers");
		return new HoversPage(driver);
	}
	private void ClickLink (String linkText) {
		driver.findElement(By.linkText(linkText)).click();
	}
}
