package com.testvagrant.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.utils.TestInitilizer;
import com.utils.TestUtil;
/**
 * @author Jeevan.Nikam
 *
 */
public class CleartripSearchFlightsPage extends TestInitilizer{
	
	static WebDriver driver;
	
	public CleartripSearchFlightsPage(WebDriver driver) {
		CleartripSearchFlightsPage.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = HomeScreen.SearchFlights.searchFlightsOneWay_Id)
	public WebElement searchFlightsOneWay;
	
	@FindBy(how = How.ID, using = HomeScreen.SearchFlights.searchFlightsFromTag_Id)
	public WebElement searchFlightsFromTag;
	
	@FindBy(how = How.ID, using = HomeScreen.SearchFlights.selectFromCity_Id)
	public WebElement selectFromCity;
	
	@FindBy(how = How.TAG_NAME, using = HomeScreen.SearchFlights.selectFromCityFromList_TagName)
	public List <WebElement> selectFromCityFromList;
	
	@FindBy(how = How.ID, using = HomeScreen.SearchFlights.searchFlightsToTag_Id)
	public WebElement searchFlightsToTag;
	
	@FindBy(how = How.ID, using = HomeScreen.SearchFlights.selectToCity_Id)
	public WebElement selectToCity;
	
	@FindBy(how = How.TAG_NAME, using = HomeScreen.SearchFlights.selectToCityFromList_TagName)
	public List <WebElement> selectToCityFromList;
	
	@FindBy(how = How.ID, using = HomeScreen.SearchFlights.departOn_Id)
	public WebElement departOn;
	
	@FindBy(how = How.XPATH, using = HomeScreen.SearchFlights.searchFlightsDepartDate_Xpath)
	public WebElement searchFlightsDepartDate;
	
	@FindBy(how = How.ID, using = HomeScreen.SearchFlights.searchFlightsSearchButton_Id)
	public WebElement searchFlightsSearchButton;
	
	@FindBy(how = How.CLASS_NAME, using = HomeScreen.SearchFlights.searchFlightsSearchSummary_ClaasName)
	public WebElement searchFlightsSearchSummary;
	
	
	public void selectOneWayFlight() {
		
		try {
			TestUtil.waitForElementToBeClickable(searchFlightsOneWay, "AttendanceButton");
			searchFlightsOneWay.click();
			log.info("One way button selected");
		} catch (Exception e) {
			log.info("Exception occured while clicking on OneWay button : " + e);
		}
	}
	
	public void enterFromCity(String city) {
		
		try {
			sendKeys(city, searchFlightsFromTag, "Search flights from city");
			selectFromCity.click();
			TestUtil.waitForSometime(2);
			log.info("Selected from city : " + city);
		} catch (Exception e) {
			log.info("Exception occured in enterFromCity method" + e);
		}
	}
	
	public void enterToCity(String city) {
		
		try {
			sendKeys(city, searchFlightsToTag, "Search flights to city");
			selectToCity.click();
			TestUtil.waitForSometime(2);
			log.info("Selected to city : " + city);
		} catch (Exception e) {
			log.info("Exception occured in enterToCity method" + e);
		}
	}
	
	public void clickOnDepartDate() {
		
		try {
			departOn.click();
			log.info("Clicked on depart date");
		} catch (Exception e) {
			log.info("Exception occured in clickOnDepartDate method" + e);
		}
	}
	
	public void selectDate() {
		
		try {
			searchFlightsDepartDate.click();
			log.info("Travel date selected as 16th of June");
		} catch (Exception e) {
			log.info("Exception occured in selectDate method" + e);
		}
	}
	
	public void clickOnSearchFlightsButton() {
		
		try {
			searchFlightsSearchButton.click();
			log.info("Clicked on search flight button");
		} catch (Exception e) {
			log.info("Exception occured in clickOnSearchFlightsButton method" + e);
		}
	}
	
	public boolean validateSummaryOnResultPage() {
		boolean status = false;
		try {
			status = TestUtil.isElementDisplayed(searchFlightsSearchSummary, 5);
			log.info("Clicked on search flight button");
		} catch (Exception e) {
			log.info("Exception occured in clickOnSearchFlightsButton method" + e);
		}
		return status;
	}
	
}
