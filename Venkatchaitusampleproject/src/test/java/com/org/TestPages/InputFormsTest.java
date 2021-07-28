package com.org.TestPages;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.org.TestBase.TestBase;
import com.org.pages.InputForms;

public class InputFormsTest extends TestBase {
	InputForms inputForms;
	
	public InputFormsTest() throws IOException {
		super();
	}
	
	
	@BeforeMethod	
	public void setup() {
		Initialization();
		inputForms = new InputForms(driver);
		}
	
	@Test
	public void getTotalTest() {
		inputForms.Gotodemowebsite();
		inputForms.closelightwindow();
		inputForms.clickOnInputFormsLink();
		inputForms.clickOnSimpleFormDemoLink();
		inputForms.enterFirstNumber(3);
		inputForms.enterSecondNumber(5);
		inputForms.clickOnTotalBtn();
		int actualTotal= Integer.parseInt(inputForms.getTotalAct());
		Assert.assertEquals(actualTotal, 8);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
