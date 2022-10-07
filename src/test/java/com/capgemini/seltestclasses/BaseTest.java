package com.capgemini.seltestclasses;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import com.capgemini.POMs.BasePage;
import com.capgemini.testUtilities.*;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseTest {
	
	public WebDriver driver;
	
	XSSFSheet sh;
	//BasePage base = new BasePage(driver);

	@BeforeClass
	@Parameters("browser")
	public void setUp(String browser) throws IOException
	{
		if(browser.equalsIgnoreCase("browserChrome"))
		{
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("browserFF"))
		{
			System.setProperty("webdriver.firefox.driver","geckodriver");
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
	//	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get(PropertyManager.getProperty("url"));	
		
	}

	@Test
	public void loginBtn() throws Exception	{
		BasePage base = new BasePage(driver);
		
		Thread.sleep(10000);
	base.login();
	
		// assertEquals("POSMO", driver.getTitle());
		System.out.println("Login Button is working");
		Thread.sleep(8000);
		base.email("prahas.kattimani@pratian.com");
		Thread.sleep(1000);
		base.pass("Qwerty123");
		
		base.click();
		Thread.sleep(8000);
		
	
	
		
		
	}

	
		
	

	/*@AfterClass
	public void tearDown()
	{
		driver.close();
		driver.quit();
	}*/

}
