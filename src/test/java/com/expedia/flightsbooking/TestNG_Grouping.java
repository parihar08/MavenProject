package com.expedia.flightsbooking;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_Grouping {
	
	@BeforeClass(alwaysRun=true)
	public void setUp() {
		System.out.println("\nTestNG_Grouping -->This runs once before class");
	}
	
	@Test(groups = {"cars","suv"})
	public void testBMWX6() {
		System.out.println("\nRunning Test -->TestNG_Grouping -->Test BMWX6");
	}

	@Test(groups = {"cars","sedan"})
	public void testAudiA6() {
		System.out.println("\nRunning Test -->TestNG_Grouping -->Test AudiA6");
	}
	
	@Test(groups = {"bikes"})
	public void testNinja() {
		System.out.println("\nRunning Test -->TestNG_Grouping -->Test Ninja");
	}
	
	@Test(groups = {"bikes"})
	public void testHondaCBR() {
		System.out.println("\nRunning Test -->TestNG_Grouping -->Test HondaCRV");
	}

	@AfterClass(alwaysRun=true)
	public void cleanUp() {
		System.out.println("\nTestNG_Grouping -->This runs once after class");
	}

}
