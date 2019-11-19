package com.testvagrant.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.utils.TestInitilizer;
import com.utils.TestUtil;
/**
 * @author Jeevan.Nikam
 *
 */
public class CleartripSearchForHotelsPage extends TestInitilizer{
	
static WebDriver driver;
	
	public CleartripSearchForHotelsPage(WebDriver driver) {
		CleartripSearchForHotelsPage.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.LINK_TEXT, using = HomeScreen.SearchForHotels.hotelsLink_LinkText)
	public WebElement hotelsLink;
	
	@FindBy(how = How.ID, using = HomeScreen.SearchForHotels.enterLocality_Id)
	public WebElement enterLocality;
	
	@FindBy(how = How.LINK_TEXT, using = HomeScreen.SearchForHotels.selectCity_LinkText)
	public WebElement selectCity;
	
	@FindBy(how = How.ID, using = HomeScreen.SearchForHotels.checkInDate_Id)
	public WebElement checkInDate;
	
	@FindBy(how = How.XPATH, using = HomeScreen.SearchForHotels.calenderCheckInDate_Xpath)
	public WebElement calenderCheckInDate;
	
	@FindBy(how = How.ID, using = HomeScreen.SearchForHotels.checkOutDate_Id)
	public WebElement checkOutDate;
	
	@FindBy(how = How.XPATH, using = HomeScreen.SearchForHotels.calenderCheckOutDate_Xpath)
	public WebElement calenderCheckOutDate;
	
	@FindBy(how = How.ID, using = HomeScreen.SearchForHotels.selectTravellers_Id)
	public WebElement selectTravellers;
	
	@FindBy(how = How.ID, using = HomeScreen.SearchForHotels.searchButton_Id)
	public WebElement searchButton;
	
	@FindBy(how = How.XPATH, using = HomeScreen.SearchForHotels.modifySearchLink_Xpath)
	public WebElement modifySearchLink;
	
	
	public void clickOnHotelsLink() {
		
		try {
			hotelsLink.click();
			log.info("Clicked on hotels link");
		} catch (Exception e) {
			log.info("Exception occured while clicking on Hotels link : " + e);
		}
	}
	
	public void enterLocationToSearchHotel(String location) {
		
		try {
			sendKeys(location, enterLocality, "Enter locality to search hotel");
			TestUtil.waitForSometime(5);
			selectCity.click();
			//selectCity.findElements(By.className("list")).get(0).click();
			log.info("Location entered for search hotel : " + location);
		} catch (Exception e) {
			log.info("Exception occured in enterLocationToSearchHotel method : " + e);
		}
	}
	
	public void clickOnCheckInDate() {
		
		try {
			checkInDate.click();
			log.info("clicked on checkin date");
		} catch (Exception e) {
			log.info("Exception occured in clickOnCheckInDate method" + e);
		}
	}
	
	public void selectCheckInDate() {
		
		try {
			calenderCheckInDate.click();
			log.info("Check In date selected");
		} catch (Exception e) {
			log.info("Exception occured in selectCheckInDate method" + e);
		}
	}
	
	public void clickOnCheckOutDate() {
		
		try {
			checkOutDate.click();
			log.info("clicked on checkout date");
		} catch (Exception e) {
			log.info("Exception occured in clickOnCheckOutDate method" + e);
		}
	}
	
	public void selectCheckOutDate() {
		
		try {
			calenderCheckOutDate.click();
			log.info("Check out date selected");
		} catch (Exception e) {
			log.info("Exception occured in selectCheckOutDate method" + e);
		}
	}
	
	public void selectTravellersFromDropdown(String visibleText) {
		
		try {
			new Select(selectTravellers).selectByVisibleText(visibleText);
			log.info("Travellers selected from dropdown : " + visibleText);
		} catch (Exception e) {
			log.info("Exception occured in selectTravellersFromDropdown method" + e);
		}
	}
	
	public void clickOnSearchHotelsButton() {
		
		try {
			searchButton.click();
			log.info("Clicked on search hotels button");
		} catch (Exception e) {
			log.info("Exception occured in clickOnSearchHotelsButton method" + e);
		}
	}
	
	public boolean validateSummaryOnResultPage() {
		boolean status = false;
		try {
			status = TestUtil.isElementDisplayed(modifySearchLink, 30);
			log.info("Search summury validated");
		} catch (Exception e) {
			log.info("Exception occured in validateSummaryOnResultPage method" + e);
		}
		return status;
	}
	
}




