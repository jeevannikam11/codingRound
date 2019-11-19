package com.testvagrant.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.utils.TestInitilizer;

/**
 * @author Jeevan.Nikam
 * 
 */
public class CleartripHomePage extends TestInitilizer{
	
	static WebDriver driver;
	
	public CleartripHomePage(WebDriver driver) {
		CleartripHomePage.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = HomeScreen.yourTrips_Id)
	public WebElement yourTrips;
	
	@FindBy(how = How.ID, using = HomeScreen.signInButton_Id)
	public WebElement signInButton;
	
	public void clickOnYourTrips() {
		
		try {
			yourTrips.click();
			log.info("Clicked on Your trips");
		} catch (Exception e) {
			log.info("Exception occured while clicking on Your Trips button : " + e);
		}
	}
	
	public void clickOnSignInButton() {
		
		try {
			signInButton.click();
			log.info("Clicked on SignIn Button");
		} catch (Exception e) {
			log.info("Exception occured while clicking on Sign Button : " + e);
		}
	}
	
}
