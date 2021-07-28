package com.org.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.org.TestBase.TestBase;


public class InputForms extends TestBase {
	
	public WebDriver driver;
	public WebDriverWait wait;
	
	@FindBy (linkText ="Demo Website!")
	private WebElement DemoWebsite;
	
	@FindBy (xpath ="//*[@id='at-cv-lightbox-close']")
	private WebElement closelightwindow;
	
	@FindBy (linkText ="Input Forms")
	private WebElement InputForms;
	
	@FindBy(linkText ="Checkbox Demo")
    private WebElement checkboxdemo;
	
	@FindBy(xpath="//*[@id='isAgeSelected']")
	private WebElement checkbox;
	
	@FindBy(xpath="//*[@id='txtAge']")
	private WebElement checkboxmsg;
	
	@FindBy(linkText ="Select Dropdown List")
    private WebElement selectdropdownlist;
	
	@FindBy(id="select-demo")
	private WebElement selectdropdown;
	
	@FindBy(className="selected-value")
	private WebElement selectedmessage;
	
		
	//Initializing
	public InputForms (WebDriver driver) {
		  this.driver = driver;
		  this.wait= new WebDriverWait(driver, 30);
		  PageFactory.initElements(driver, this);
	}
	
	//Actions
	public void Gotodemowebsite() {
		this.DemoWebsite.click();
	}
	
	public void closelightwindow() {
		this.closelightwindow.click();
	}
	
	
	public void Gotocheckbox() {
		this.InputForms.click();
		this.checkboxdemo.click();
	}
	
	public void selectcheckbox() {
		this.checkbox.click();
	}
	
	public String checkboxmessage() {
		  return this.checkboxmsg.getText();
	}
	
	public void selectdropdownlist() {
		this.InputForms.click();
		this.selectdropdownlist.click();
	}
	
	public void selectsunday() {
		Select select = new Select(this.selectdropdown);
		select.selectByVisibleText("Sunday");
	}
		
	public String selectedmessage() {
		  return this.selectedmessage.getText();
	}
}
