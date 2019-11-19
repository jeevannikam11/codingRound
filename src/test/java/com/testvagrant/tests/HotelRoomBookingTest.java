package com.testvagrant.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.testvagrant.pages.CleartripSearchForHotelsPage;
import com.utils.TestInitilizer;
import com.utils.TestUtil;
/**
 * @author Jeevan.Nikam
 *
 */

public class HotelRoomBookingTest extends TestInitilizer{
	
	@Test
    public void shouldBeAbleToSearchForHotels() throws InterruptedException {
		
		CleartripSearchForHotelsPage cleartripSearchForHotelsPage = new CleartripSearchForHotelsPage(driver);
		
		cleartripSearchForHotelsPage.clickOnHotelsLink(); // Click on hotels link
		TestUtil.waitForSometime(2);
		cleartripSearchForHotelsPage.enterLocationToSearchHotel("Indiranagar, Bangalore"); // Enter locality
		TestUtil.waitForSometime(2);
		cleartripSearchForHotelsPage.clickOnCheckInDate(); // Click on chekin date
		cleartripSearchForHotelsPage.selectCheckInDate(); // Select checkIn date
		TestUtil.waitForSometime(1);
		cleartripSearchForHotelsPage.clickOnCheckOutDate(); // Click on chekout date
		cleartripSearchForHotelsPage.selectCheckOutDate(); // Select checkOut date
		TestUtil.waitForSometime(1);
		cleartripSearchForHotelsPage.selectTravellersFromDropdown("1 room, 2 adults"); //Select room and travellers
		TestUtil.waitForSometime(1);
		cleartripSearchForHotelsPage.clickOnSearchHotelsButton(); // Click on search hotels button
		TestUtil.waitForSometime(10);
		Assert.assertTrue(cleartripSearchForHotelsPage.validateSummaryOnResultPage(), "Hotels search summary not available"); //Assert condition, check search summary.
	}

}
