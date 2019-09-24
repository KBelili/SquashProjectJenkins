package org.myPagesObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CreateTest extends GenericPage {

	public CreateTest(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);

	}

	public void FillFormTest(String projectName) throws InterruptedException {

		selectAddNameTest.click();
		selectAddNameTest.sendKeys(projectName);
//		selectAddRef.click();
//		selectAddRef.sendKeys(ref);
		Thread.sleep(1000);
		addButton.click();
	}

}
