package com.org.TestBase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {
	private WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}

