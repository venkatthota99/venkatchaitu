package com.org.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import com.org.util.TestUtil;


public class TestBase {
	

	public static WebDriver driver;     // static variables can be called directly or using class name eg: prop or testbase.prop
	public static Properties prop;      // static means method or variable associated with class and not with object
	
	
	public TestBase()  {  // public, private, protected are access modifiers
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					("/Users/Dell/git/repository/Venkatchaitusampleproject/src/main/java/com/org/config/config.properties"));
			prop.load(ip);
		
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
		
		public static void Initialization() {  // void means this method has no return value
			String browsername = prop.getProperty("browser");
			if(browsername.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver","E:/Selenium 2020/chromedriver/chromedriver.exe");
				driver = new ChromeDriver();
			}
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(TestUtil.page_load_timeout, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.implicit_wait, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
		}
			

	}
