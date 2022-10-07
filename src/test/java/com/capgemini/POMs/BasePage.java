package com.capgemini.POMs;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.capgemini.testUtilities.ExcelUtility;

public class BasePage {
	WebDriver driver;
	
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how = How.XPATH, using = "/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div/div/div/div/div/nb-layout-column/ngx-landing-screen/div/ngx-top-header/div/div/div[3]/div/div[2]/button")
	@CacheLookup
	public static WebElement loginBtn;
	
	@FindBy(how = How.XPATH,using = "//*[@id=\"email\"]")
	@CacheLookup
	public static WebElement emailBox;
	
	@FindBy(how = How.XPATH,using = "//*[@id=\"password\"]")
	@CacheLookup
	public static WebElement passBox;
	
	@FindBy(how = How.XPATH,using = "//*[@id=\"next\"]")
	@CacheLookup
	public static WebElement signinBtn;
	
	public void login() {
		loginBtn.click();
	}
	/*
	 * public void testkeys() throws Exception { file = new File("data.xlsx"); fin=
	 * new FileInputStream(file); wb= new XSSFWorkbook(fin); sh=
	 * wb.getSheet("login");
	 * 
	 * for(int i=1;i<sh.getLastRowNum();i++) {
	 * 
	 * String keyword=sh.getRow(i).getCell(0).getStringCellValue();
	 * 
	 * if(keyword.equalsIgnoreCase("username")) { test(); } } }
	 */

	/*
	 * public void test() {
	 * 
	 * for(int i=sh.getFirstRowNum()+1; i<=sh.getLastRowNum();i++) {
	 * 
	 * BasePage.emailBox.sendKeys(sh.getRow(i).getCell(0).getStringCellValue());
	 * BasePage.passBox.sendKeys(sh.getRow(i).getCell(1).getStringCellValue());
	 * System.out.println(sh.getRow(i).getCell(0).getStringCellValue());
	 * System.out.println(sh.getRow(i).getCell(1).getStringCellValue());
	 * 
	 * 
	 * 
	 * }
	 * 
	 */
	
public void email(String email) {
	emailBox.sendKeys(email);
	
}
public void pass(String pass) {
	passBox.sendKeys(pass);
}

public void click() throws Exception {
	
	signinBtn.click();
	Thread.sleep(2000);
	System.out.println("login done......Congrats!");
}
	
}
