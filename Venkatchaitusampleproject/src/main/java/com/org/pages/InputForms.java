package com.org.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.org.TestBase.TestBase;

public class InputForms {
	
	public WebDriver driver;
	public WebDriverWait wait;
	
	@FindBy (linkText ="Demo Website!")
	private WebElement DemoWebsite;
	
	@FindBy (xpath ="//*[@id='at-cv-lightbox-close']")
	private WebElement closelightwindow;
	
	@FindBy (xpath="//a[text()='Input Forms']")
	private WebElement inputForm;
	
	//SimpleFormDemo
	@FindBy (xpath="(//li[@class='tree-branch']//a)[3]")
	private WebElement simpleFormDemo;
	
	@FindBy (id="sum1")
	private WebElement sum1;
	
	@FindBy (id="sum2")
	private WebElement sum2;
	
	@FindBy (xpath="//button[text()='Get Total']")
	private WebElement totalBtn;
	
	@FindBy (xpath="//span[@id='displayvalue']")
	private WebElement totalValAct;
	
	//CheckBox	
	@FindBy(linkText ="Checkbox Demo")
    private WebElement checkboxdemo;
	
	@FindBy(xpath="//*[@id='isAgeSelected']")
	private WebElement checkbox;
	
	@FindBy(xpath="//*[@id='txtAge']")
	private WebElement checkboxmsg;
	
	//SelectDropdownList
	@FindBy(linkText ="Select Dropdown List")
    private WebElement selectdropdownlist;
	
	@FindBy(id="select-demo")
	private WebElement selectdropdown;
	
	@FindBy(className="selected-value")
	private WebElement selectedmessage;
			
	//RadioButton
	@FindBy (xpath="(//li[@class='tree-branch']//a)[5]")
	private WebElement radioButtonsDemo;
	
	@FindBy(xpath="//input[@value='Male' and @name='gender']")
	private WebElement selectGender;
	
	@FindBy(name="ageGroup")
	private WebElement selectAgeGroup;
	
	@FindBy(xpath="//button[text()='Get values']")
	private WebElement getValuesBtn;
	
	@FindBy(className="groupradiobutton")
	private WebElement selectedValues;
	
	//Ajax Form Submit
	@FindBy(xpath="//*[@id=\"treemenu\"]/li/ul/li[1]/ul/li[6]/a")
	private WebElement ajaxFormSubmitLink;
	
	@FindBy(xpath="//input[@class='form-control']")
	private WebElement ajaxName;
	
	@FindBy(xpath="//textarea[@class='form-control']")
	private WebElement ajaxComments;
	
	@FindBy(xpath="//input[@id='btn-submit']")
	private WebElement ajaxSubmitBtn;
	
	@FindBy(id="submit-control")
	private WebElement ajaxSuccessMsg;
	
	//Initializing
	public InputForms (WebDriver driver) {
		  this.driver = driver;
		  this.wait= new WebDriverWait(driver, 30);
		  PageFactory.initElements(driver, this);
	}
	
//public Page actions (methods)

	public void Gotodemowebsite() {
		this.DemoWebsite.click();
	}
	
	public void closelightwindow() {
		this.closelightwindow.click();
	}
	
	public void clickOnInputFormsLink() {
		inputForm.click();
	}
	
	public void clickOnSimpleFormDemoLink() {
		simpleFormDemo.click();
	}
	
	public void enterFirstNumber(int num1) {
		sum1.sendKeys(String.valueOf(num1));
	}
	
	public void enterSecondNumber(int num2) {
		sum2.sendKeys(String.valueOf(num2));
	}
	
	public void clickOnTotalBtn() {
		totalBtn.click();
	}
	
	public String getTotalAct() {
		return totalValAct.getText();
	}
	
	public void Gotocheckbox() {
		this.inputForm.click();
		this.checkboxdemo.click();
	}
	
	public void selectcheckbox() {
		this.checkbox.click();
	}
	
	public String checkboxmessage() {
		  return this.checkboxmsg.getText();
	}
	
	public void selectdropdownlist() {
		this.inputForm.click();
		this.selectdropdownlist.click();
	}
	
	public void selectsunday() {
		Select select = new Select(this.selectdropdown);
		select.selectByVisibleText("Sunday");
	}
		
	public String selectedmessage() {
		  return this.selectedmessage.getText();
	}
	
	public void selectGender() {
		selectGender.click();
	}
	
	public void selectradioButtonsDemoLink() {
		radioButtonsDemo.click();
	}
	
	public void selectAgeGroup() {
		selectAgeGroup.click();
	}
	
	public void clickGetValuesBtn() {
		getValuesBtn.click();
	}
	
	public boolean valuesSelected() {
		String actualSelections = selectedValues.getText();
		return actualSelections.contains("Male");
	}
	
	public void clickOnAjaxFormSubmitLink() {
		ajaxFormSubmitLink.click();
	}
	
	public void enterAjaxName(String name) {
		ajaxName.sendKeys(name);
	}
	
	public void enterAjaxComments(String comments) {
		ajaxComments.sendKeys(comments);
	}
	
	public void clickAjaxSubmitBtn() {
		ajaxSubmitBtn.click();
	}
	
	public String getAjaxSuccessMsg() {
		return wait.until(ExpectedConditions.visibilityOf(ajaxSuccessMsg)).getText();
	}
}
