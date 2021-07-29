package com.org.TestPages;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
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
		inputforms.Gotodemowebsite();
		inputforms.closelightwindow();
		}
	
	@Test
	public void getTotalTest() {		
		inputforms.clickOnInputFormsLink();
		inputforms.clickOnSimpleFormDemoLink();
		inputforms.enterFirstNumber(3);
		inputforms.enterSecondNumber(5);
		inputforms.clickOnTotalBtn();
		int actualTotal= Integer.parseInt(inputforms.getTotalAct());
		Assert.assertEquals(actualTotal, 8);
	}
	
	@Test (priority = 1)
	public void checkboxTest() {
		inputforms.Gotocheckbox();
		inputforms.selectcheckbox();
		String msg = inputforms.checkboxmessage();
		Assert.assertEquals(msg, "Success - Check box is checked");
	}
	
	@Test (priority = 2)
	public void selectdropdownTest() {
		inputforms.selectdropdownlist();
		inputforms.selectsunday();
		String selmsg = inputforms.selectedmessage();
		Assert.assertEquals(selmsg, "Day selected :- Sunday");
	}
	
	@Test
	public void selectRadioButtonTest() {
		inputforms.clickOnInputFormsLink();
		inputforms.selectradioButtonsDemoLink();
		inputforms.selectGender();
		inputforms.selectAgeGroup();
		inputforms.clickGetValuesBtn();
		boolean actualValuesSelected = inputforms.valuesSelected();
		Assert.assertEquals(actualValuesSelected, true);
	}
	
	@Test
	public void ajaxFormSubmitTest() {
		inputforms.clickOnInputFormsLink();
		inputforms.clickOnAjaxFormSubmitLink();
		inputforms.enterAjaxName("abc");
		inputforms.enterAjaxComments("form submission");
		inputforms.clickAjaxSubmitBtn();
		String ajaxMsg = inputforms.getAjaxSuccessMsg();
		Assert.assertEquals(ajaxMsg, "Form submited Successfully!");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		}
}
