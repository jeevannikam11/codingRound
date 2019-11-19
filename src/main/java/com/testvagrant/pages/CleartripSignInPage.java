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
public class CleartripSignInPage extends TestInitilizer {

	static WebDriver driver;

	public CleartripSignInPage(WebDriver driver) {
		CleartripSignInPage.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = HomeScreen.SignInScreen.userName_Id)
	public WebElement userName;

	@FindBy(how = How.ID, using = HomeScreen.SignInScreen.password_Id)
	public WebElement password;

	@FindBy(how = How.ID, using = HomeScreen.SignInScreen.signInButton_Id)
	public WebElement signInButton;

	@FindBy(how = How.ID, using = HomeScreen.SignInScreen.errorMessage_Id)
	public WebElement errorMessage;

	@FindBy(how = How.ID, using = HomeScreen.SignInScreen.closeButton_Id)
	public WebElement closeButton;

	public void enterUserName(String uName) {

		try {
			sendKeys(uName, userName, "Enter user name");
			log.info("Username entered : " + uName);
		} catch (Exception e) {
			log.info("Exception occured while enterning Username : " + e);
		}
	}

	public void enterPassword(String pass) {

		try {
			sendKeys(pass, password, "Enter Password");
			log.info("Password entered : " + pass);
		} catch (Exception e) {
			log.info("Exception occured while enterning Password : " + e);
		}
	}

	public void clickOnSignInButton() {

		try {
			signInButton.click();
			log.info("Clicked on signIn button");
		} catch (Exception e) {
			log.info("Exception occured while clicking on SignIn button : " + e);
		}
	}

	public String getErrorMessage() {
		String message = "";
		try {
			message = errorMessage.getText();
			log.info("Error message captured");
		} catch (Exception e) {
			log.info("Exception occured while getting error message : " + e);
		}
		return message;
	}

	public void clickOnCloseButton() {
		try {
			closeButton.click();
			log.info("Clicked on close button");
		} catch (Exception e) {
			log.info("Exception occured while clicking on close button : " + e);
		}
	}

}
