package com.richmond.webdriverjava.sampleapp.forgottenpassword;

import com.richmond.webdriverjava.sampleapp.BaseTests;
import com.richmond.webdriverjava.sampleapp.pages.ForgottenPasswordConfirmationPage;
import com.richmond.webdriverjava.sampleapp.pages.ForgottenPasswordPage;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ForgottenPasswordTests extends BaseTests{
	@Test
	public void testForgottenPassword () {
		ForgottenPasswordPage forgottenPasswordPage = homePage.clickForgottenPasswordLink(); 
		forgottenPasswordPage.setEmail("eli@example.com");
		ForgottenPasswordConfirmationPage forgottenPasswordConfirmationPage = forgottenPasswordPage.clicksubmitButton();
		assertTrue(forgottenPasswordConfirmationPage.getConfirmationString().contains("Your e-mail's been sent!"));
	}

}
