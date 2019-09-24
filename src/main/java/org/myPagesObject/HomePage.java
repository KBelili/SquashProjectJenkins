package org.myPagesObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends GenericPage{

	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	

	
	public CreateTest create() throws InterruptedException {
		iconTestCase.click();
		Thread.sleep(1000);
		clickOnTestProject.click();
		Thread.sleep(1000);
		clicOnIconePlus.click();
		Thread.sleep(1000);
		selectNewTestCase.click();
		Thread.sleep(1000);
		return PageFactory.initElements(driver, CreateTest.class);
	}
	

}
