package com.richmond.webdriverjava.sampleapp.login;

import com.richmond.webdriverjava.sampleapp.BaseTests;
import com.richmond.webdriverjava.sampleapp.pages.LoginPage;
import com.richmond.webdriverjava.sampleapp.pages.SecureAreaPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.*;
public class LoginTests extends BaseTests{
	@Test
	public void testSuccessfulLogin () {
		LoginPage loginPage = homePage.clickFormAuthentication();
		loginPage.setUsername("tomsmith");
		loginPage.setPassword("SuperSecretPassword!");
		SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
		assertTrue("Alert Message was incorrect",secureAreaPage.getAlertText().contains("You logged into a secure area!"));
	}

}
