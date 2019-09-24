package org.TestPackage;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.myPagesObject.GenericPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public abstract class GenericTest {

	WebDriver driver;
	public String BROWSER = System.getProperty("browser");

	public GenericTest() {
		super();

		if (BROWSER.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Installation\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (BROWSER.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Installation\\Drivers\\chromedriver.exe");
		
		} else if (BROWSER.isEmpty()) {
			System.setProperty("webdriver.gecko.driver", "C:\\Installation\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		System.setProperty("webdriver.gecko.driver", "C:\\Installation\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.navigate().to(GenericPage.URL);
	}

	 @After
	 public void teardown() {
	 driver.close();
	 }

}
