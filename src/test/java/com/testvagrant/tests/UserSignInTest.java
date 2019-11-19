package com.testvagrant.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.testvagrant.pages.CleartripHomePage;
import com.testvagrant.pages.CleartripSignInPage;
import com.utils.TestInitilizer;
import com.utils.TestUtil;

/**
 * @author Jeevan.Nikam
 *
 */
public class UserSignInTest extends TestInitilizer{
	
	 @Test
	    public void shouldThrowAnErrorIfSignInDetailsAreMissing() throws InterruptedException {
		 
		 CleartripHomePage cleartripHomePage = new CleartripHomePage(driver);
		 CleartripSignInPage cleartripSignInPage = new CleartripSignInPage(driver);
		 
		 cleartripHomePage.clickOnYourTrips();    // click on Your trips link
		 cleartripHomePage.clickOnSignInButton(); // click on sign in button
		 TestUtil.waitForSometime(1); 
		 TestUtil.switchFrame("modal_window"); // Switch frame
		 TestUtil.waitForSometime(1);
		 cleartripSignInPage.clickOnSignInButton(); // click on sign in button on User sign page
		 Assert.assertTrue(cleartripSignInPage.getErrorMessage().contains("There were errors in your submission"), "Error message not found...."); // Assert condition, check error message
	 }
}
