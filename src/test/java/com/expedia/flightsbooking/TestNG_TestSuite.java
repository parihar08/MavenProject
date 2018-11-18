package com.expedia.flightsbooking;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import page.classes.SearchPageMvn;;

public class TestNG_TestSuite {
	private WebDriver driver;
	private String baseUrl;
	private static final Logger log = LogManager.getLogger(TestNG_TestSuite.class.getName());

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		baseUrl = "https://www.expedia.com/";

		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//PropertyConfigurator.configure("log4j.properties");
		driver.get(baseUrl);
	}

	@Test
	public void fillBasicInfo() throws Exception {
		//SearchPageMvn.navigateToFlightsTab(driver);
		SearchPageMvn.fillOriginTextBox(driver, "New York");
		SearchPageMvn.fillDestinationTextBox(driver, "Chicago");
		SearchPageMvn.fillDepartureDateTextBox(driver, "12/25/2018");
		SearchPageMvn.fillReturnDateTextBox(driver, "12/31/2018");
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
