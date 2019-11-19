package com.testvagrant.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.testvagrant.pages.CleartripSearchFlightsPage;
import com.utils.TestInitilizer;
import com.utils.TestUtil;

/**
 * @author Jeevan.Nikam
 *
 */
public class OneWayFlightBookingTest extends TestInitilizer{
	
	@Test
	public  void testThatResultsAppearForAOneWayJourney() throws InterruptedException {
		
		CleartripSearchFlightsPage cleartripSearchFlightsPage = new CleartripSearchFlightsPage(driver);
		
		cleartripSearchFlightsPage.selectOneWayFlight();       // Click on select one way flight radio button
		cleartripSearchFlightsPage.enterFromCity("Bangalore"); // Enter from city as Bangalore
		TestUtil.waitForSometime(1);
		cleartripSearchFlightsPage.enterToCity("Delhi"); // Enter from city as Delhi
		TestUtil.waitForSometime(1);
		cleartripSearchFlightsPage.clickOnDepartDate(); // Click on depart date 
		cleartripSearchFlightsPage.selectDate(); // Select date
		TestUtil.waitForSometime(1);
		cleartripSearchFlightsPage.clickOnSearchFlightsButton(); // Click on search flights button
		TestUtil.waitForSometime(1);
		Assert.assertTrue(cleartripSearchFlightsPage.validateSummaryOnResultPage(), "Summary not available...."); // Assert condition, check summary on summary page
	}
}
