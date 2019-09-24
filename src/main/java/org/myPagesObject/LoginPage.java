package org.myPagesObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends GenericPage {

	public LoginPage(WebDriver driver) {

		super(driver);
		PageFactory.initElements(driver, this);
	}

	// Fill the login page with sent info
	// Args : - username : username
	// - password : password
	public void fillLoginForm(String username, String password) {
		userNameInput.clear();
		userNameInput.sendKeys(username);
		passwordInput.click();
		passwordInput.sendKeys(password);
	}

	// Click on the submit button to log in + PageFactory
	public HomePage submitLoginForm() {
		validateLink.click();
		return PageFactory.initElements(driver, HomePage.class);
	}
}
