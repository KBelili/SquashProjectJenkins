package org.TestPackage;

import static org.junit.Assert.*;

import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.junit.Test;
import org.myPagesObject.CreateTest;
import org.myPagesObject.HomePage;
import org.myPagesObject.LoginPage;

public class TestVerifyItem extends GenericTest {
	
	
	public String nameCaseFirefox = "Test avec Firefox";
	public String nameCaseChrome = "Test avec Chrome";
	public String ref1 = "REF001-FIREFOX";
	public String ref2 = "REF002-CHROME";
	public String nameProject = "";
	
	public  TestVerifyItem() {
		
		super();
	}
	

	@Test
	public void testApp() throws InterruptedException{
		
		//To log
		LoginPage loginPage = new LoginPage(driver);
		loginPage.fillLoginForm("admin", "admin");
		
		//to go to home page 
		HomePage homePage = loginPage.submitLoginForm();
		
		//to select and go to CreateTest
		CreateTest createTest = homePage.create();
		
		nameProject = createTest.getInputIdVerify().getText();
		
		
		//to fill the for
		if (BROWSER.equalsIgnoreCase("Firefox")) {
			createTest.FillFormTest(nameCaseFirefox);
		
			Thread.sleep(2000);
			System.out.println(nameProject);
			assertTrue("Project not present", nameProject.equals(nameCaseFirefox));
			
		}else {
			createTest.FillFormTest(nameCaseChrome);	
			
			Thread.sleep(2000);
			System.out.println(nameProject);
		//	assertTrue("Project not present", nameProject.equals(nameCaseChrome));
			
			System.out.println(nameProject);
		}
		
		
		

		
		

	}
}
	