package com.org.TestPages;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.org.TestBase.TestBase;
import com.org.pages.InputForms;

public class InputFormsTest extends TestBase {
	
	InputForms inputforms;
	
	public InputFormsTest() {
		super();  // it is used to call parent class methods and constructors
	}
	
	@BeforeMethod	
	public void setup() {
		Initialization();
		inputforms = new InputForms(driver);
		}
	
	@Test (priority = 1)
	public void checkboxTest() {
		inputforms = new InputForms(driver);
		inputforms.Gotodemowebsite();
		inputforms.closelightwindow();
		inputforms.Gotocheckbox();
		inputforms.selectcheckbox();
		String msg = inputforms.checkboxmessage();
		Assert.assertEquals(msg, "Success - Check box is checked");
	}
	
	@Test (priority = 2)
	public void selectdropdownTest() {
		inputforms = new InputForms(driver);
		inputforms.Gotodemowebsite();
		inputforms.closelightwindow();
		inputforms.selectdropdownlist();
		inputforms.selectsunday();
		String selmsg = inputforms.selectedmessage();
		Assert.assertEquals(selmsg, "Day selected :- Sunday");
	}

	@AfterTest
	public void quit() {
		this.driver.close();;
	}
}
