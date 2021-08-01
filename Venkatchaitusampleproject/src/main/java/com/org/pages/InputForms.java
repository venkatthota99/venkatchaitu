package com.org.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
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
	
  //Input form Submit
	
	@FindBy(xpath ="//ul[@class='dropdown-menu']//a[normalize-space()='Input Form Submit']")
    private WebElement inputformsubmitdropdown;
		
	@FindBy(name ="first_name")
	private WebElement ipsfirstname;
	
	@FindBy(name ="last_name")
	private WebElement ipslastname;
	
	@FindBy(name ="email")
	private WebElement ipsemail;
	
	@FindBy(name ="phone")
	private WebElement ipsphone;
	
	@FindBy(name ="address")
	private WebElement ipsaddress;
	
	@FindBy(name ="city")
	private WebElement ipscity;
	
	@FindBy(name ="state")
	private WebElement ipsstate;
	
	@FindBy(name ="zip")
	private WebElement ipszip;
	
	@FindBy(name ="website")
	private WebElement ipswebsite;
	
	@FindBy(xpath ="//input[@value='yes']")
	private WebElement ipshosting;
		
	@FindBy(name ="comment")
	private WebElement ipscomment;
	
	@FindBy(className="//button[@type='submit' and @class='btn btn-default']")
	private WebElement ipssubmit;
			
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
	
	// Inputformsubmit actions
	
	public void GotoInputFormSubmitLink() throws InterruptedException {
		this.inputForm.click();
		Thread.sleep(20000);	
		this.inputformsubmitdropdown.click();
	}
	
	public void submitinputformwithdetails() throws InterruptedException {
		
		this.ipsfirstname.sendKeys("Venkat");
		Thread.sleep(20000);	
		this.ipslastname.sendKeys("thota");
		Thread.sleep(20000);
		this.ipsemail.sendKeys("ipsemail@gmail.com");
		Thread.sleep(20000);	
		this.ipsphone.sendKeys("4168973233");
		Thread.sleep(20000);	
		this.ipsaddress.sendKeys(" tailors colony rd, nellore");
		Thread.sleep(20000);	
		this.ipscity.sendKeys("nellore");
		Thread.sleep(20000);
		Select selectips = new Select(this.ipsstate);
		selectips.selectByIndex(3);
		Thread.sleep(20000);	
		this.ipszip.sendKeys("85013");
		Thread.sleep(20000);	
		this.ipswebsite.sendKeys("www.ipswebsite.com");
		Thread.sleep(20000);	
		this.ipshosting.click();
		Thread.sleep(20000);	
		this.ipscomment.sendKeys(" abcd  efgh  ijkl  mnop  qrst ");
		Thread.sleep(20000);	
		this.ipssubmit.click();	
		Thread.sleep(20000);	
		Thread.sleep(20000);
	}
}
