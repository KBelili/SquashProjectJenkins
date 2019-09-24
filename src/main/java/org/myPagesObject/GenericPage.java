package org.myPagesObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public abstract class GenericPage {

	public final static String URL = "http://192.168.102.56:9898/squash/login";
	protected final WebDriver driver;

	// ******************************to log********************
	@FindBy(how = How.XPATH, using = "//*[@id=\'username\']")
	WebElement userNameInput;

	@FindBy(how = How.XPATH, using = "//*[@id=\'password\']")
	WebElement passwordInput;

	@FindBy(how = How.XPATH, using = "//input[@value=\'Se connecter\']")
	WebElement validateLink;

	// *****************************to select add*************************
	// to click on the icon test case
	@FindBy(how = How.XPATH, using = "//*[@id=\'test-case-link\']")
	WebElement iconTestCase;


	// to click on ligne TestProject1
	@FindBy(how = How.XPATH, using = "//li[@id='TestCaseLibrary-14']/a")
	WebElement clickOnTestProject;

	// to click on icone + to add testcase
	@FindBy(how = How.XPATH, using = "//a[contains(@id,'tree-create-button')]")
	WebElement clicOnIconePlus;

	// to select new test case
	@FindBy(how = How.XPATH, using = "//a[@id='ui-id-9']")
	WebElement selectNewTestCase;

	// ******************************To fill the
	// form*********************************
	@FindBy(how = How.XPATH, using = "//input[@id='add-test-case-name']")
	WebElement selectAddNameTest;

	@FindBy(how = How.XPATH, using = "//input[@id='add-test-case-reference']")
	WebElement selectAddRef;

	@FindBy(how = How.XPATH, using = "//div[contains(@aria-labelledby,'ui-id-17')]//input[contains(@value,'Ajouter')][2]")
	WebElement addButton;

	// *********************************To make an
	// assert*****************************************************************
	@FindBy(how = How.XPATH, using = "//input[@id='add-test-case-name']")
	WebElement inputIdVerify;

	public WebElement getInputIdVerify() {
		return inputIdVerify;
	}

	public GenericPage(WebDriver driver) {
		super();
		this.driver = driver;

	}

}
