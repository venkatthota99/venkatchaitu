package com.org.TestBase;

import org.openqa.selenium.WebDriver;

public class TestBase {
	private WebDriver driver;
	
	public void setUp() {
		
	}
	
	public void quit() {
		driver.quit();
	}
}
