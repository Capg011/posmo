package com.capgemini.POMs;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ViewWorkshop2 {
	WebDriver driver;
	public ViewWorkshop2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how = How.XPATH, using = "/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div[1]/div/div/div/div/nb-layout-column/ngx-dashboard/ngx-sidebar/div/div/div/div[2]/ul[2]/li")
    @CacheLookup
    public static WebElement eventBtn;
	
	
	@FindBy(how = How.XPATH, using = "/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div/div/div/div/div/nb-layout-column/ngx-interview-dashboard/div/div[3]/div/div/div[3]")
    @CacheLookup
    public static WebElement workshoptabBtn;
	
	
	@FindBy(how = How.XPATH, using = "/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div/div/div/div/div/nb-layout-column/ngx-interview-dashboard/div/div[3]/ngx-kanban-dashboard/div/div[1]/div[4]/div/div[2]/button")
	@CacheLookup
	public static WebElement addBtn;
	
	@FindBy(how = How.XPATH, using = "/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div[1]/div/div/div/div/nb-layout-column/ngx-interview-dashboard/div/div[1]/ngx-add-interview/div[1]/div[3]/form/mat-form-field[1]/div/div[1]/div/input")
	@CacheLookup
	public static WebElement titleBtn;
	
	@FindBy(how = How.XPATH, using = "/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div[1]/div/div/div/div/nb-layout-column/ngx-interview-dashboard/div/div[1]/ngx-add-interview/div[1]/div[3]/form/mat-form-field[2]/div/div[1]/div[1]")
	@CacheLookup
	public static WebElement clientBtn;
	
	
	@FindBy(how = How.XPATH, using = "/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div[2]/div[2]/div/div/div/mat-option[9]/span")
	@CacheLookup
	public static WebElement selectBtn;
	
	
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"mat-select-value-7\"]/span")
	@CacheLookup
	public static WebElement engagementBtn;
	
	@FindBy(how = How.XPATH, using= "/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div[2]/div[2]/div/div/div/mat-option/span")
	@CacheLookup
	public static WebElement dropdownBtn;
	
	@FindBy(how = How.XPATH, using="/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div[1]/div/div/div/div/nb-layout-column/ngx-interview-dashboard/div/div[1]/ngx-add-interview/div[1]/div[3]/form/mat-form-field[4]/div/div[1]/div[1]/mat-select/div/div[1]/span")
	@CacheLookup
	public static WebElement workShopBtn;
	
	@FindBy(how=How.XPATH, using="/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div[2]/div[2]/div/div/div/mat-option[1]/span")
	@CacheLookup
	public static WebElement optionBtn;
	
	
	@FindBy(how = How.XPATH, using = "/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div[1]/div/div/div/div/nb-layout-column/ngx-interview-dashboard/div/div[1]/ngx-add-interview/div[1]/div[3]/form/mat-form-field[5]/div/div[1]/div[1]/mat-select/div/div[1]")
	@CacheLookup
	public static WebElement timezoneBtn;
	
	@FindBy(how = How.XPATH, using = "/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div[2]/div[2]/div/div/div/mat-option[1]/span")
	@CacheLookup
	public static WebElement droplistBtn;
	
	@FindBy(how = How.XPATH, using ="/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div[1]/div/div/div/div/nb-layout-column/ngx-interview-dashboard/div/div[1]/ngx-add-interview/div[1]/div[3]/form/div[1]/div[1]/mat-form-field/div/div[1]/div[1]/input")
	@CacheLookup
	public static WebElement startdateBtn;
	
	@FindBy(how = How.XPATH, using ="/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div[2]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/mat-calendar-header/div/div/button[3]")
	@CacheLookup
	public static WebElement nextMonthBtn;
	
	
	@FindBy(how = How.XPATH, using = "/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div[2]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-month-view/table/tbody/tr[2]/td[3]/div[1]")
	@CacheLookup
	public static WebElement datebtn;
	
	@FindBy(how= How.XPATH, using="/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div[1]/div/div/div/div/nb-layout-column/ngx-interview-dashboard/div/div[1]/ngx-add-interview/div[1]/div[3]/form/div[1]/div[2]/mat-form-field/div/div[1]/div/input")
	@CacheLookup
	public static WebElement starttimeBtn;
	
	
	@FindBy(how = How.XPATH, using ="/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div[1]/div/div/div/div/nb-layout-column/ngx-interview-dashboard/div/div[1]/ngx-add-interview/div[1]/div[3]/form/div[1]/div[3]/mat-form-field/div/div[1]/div[2]/mat-icon")
	@CacheLookup
	public static WebElement enddateBtn; 
	
	@FindBy(how = How.XPATH, using="/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div[2]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/mat-calendar-header/div/div/button[3]")
	@CacheLookup
	public static WebElement nextMonth2Btn;
	
	@FindBy(how = How.XPATH, using = "/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div[2]/div[2]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-month-view/table/tbody/tr[3]/td[4]/div[1]")
	@CacheLookup
	public static WebElement date2Btn;
	
	@FindBy(how = How.XPATH, using = "/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div[1]/div/div/div/div/nb-layout-column/ngx-interview-dashboard/div/div[1]/ngx-add-interview/div[1]/div[3]/form/div[1]/div[4]/mat-form-field/div/div[1]/div/input")
	@CacheLookup
	public static WebElement endtimeBtn;
	
	
	@FindBy(how = How.XPATH, using = "/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div[1]/div/div/div/div/nb-layout-column/ngx-interview-dashboard/div/div[1]/ngx-add-interview/div[1]/div[3]/form/div[2]/div/textarea")
	@CacheLookup
	public static WebElement descBtn;
	
	@FindBy(how = How.XPATH, using = "/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div[1]/div/div/div/div/nb-layout-column/ngx-interview-dashboard/div/div[1]/ngx-add-interview/div[1]/div[3]/form/div[3]/div/div/div[1]/label")
	@CacheLookup
	public static WebElement locationBtn;
	
	@FindBy(how = How.XPATH, using = "/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div[1]/div/div/div/div/nb-layout-column/ngx-interview-dashboard/div/div[1]/ngx-add-interview/div[1]/div[3]/form/div[4]/mat-form-field/div/div[1]/div/mat-chip-list/div/input")
	@CacheLookup
	public static WebElement attendeeBtn;
	
	@FindBy(how = How.XPATH, using="/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div[1]/div/div/div/div/nb-layout-column/ngx-interview-dashboard/div/div[1]/ngx-add-interview/div[1]/div[3]/form/div[5]/mat-form-field/div/div[1]/div/mat-chip-list/div/input")
	@CacheLookup
	public static WebElement consultantBtn;
	
	
	@FindBy(how = How.XPATH, using="/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div[1]/div/div/div/div/nb-layout-column/ngx-interview-dashboard/div/div[1]/ngx-add-interview/div[1]/div[3]/form/div[6]/button[2]")
	@CacheLookup
	public static WebElement createBtn;
	
	@FindBy(how= How.XPATH, using="/html/body/ngx-app/ngx-get2aha/ngx-one-column-layout/nb-layout/div[2]/div[2]/div/mat-dialog-container/ngx-popup/div[2]/div/div[3]/div/div/div[2]/button")
	@CacheLookup
	public static WebElement alertBtn;
	
public void click() throws InterruptedException
{
	eventBtn.click();
	Thread.sleep(2000);
	workshoptabBtn.click();
	Thread.sleep(2000);
	addBtn.click();
	Thread.sleep(2000);
	titleBtn.click();
	Thread.sleep(2000);
	titleBtn.sendKeys("Presentation");
	Thread.sleep(2000);
	clientBtn.click();
	Thread.sleep(2000);
	selectBtn.click();
	Thread.sleep(2000);
	engagementBtn.click();
	Thread.sleep(2000);
	dropdownBtn.click();
	Thread.sleep(2000);
	workShopBtn.click();
	Thread.sleep(2000);
	optionBtn.click();
	Thread.sleep(2000);
	timezoneBtn.click();
	Thread.sleep(2000);
	droplistBtn.click();
    Thread.sleep(2000);	
    startdateBtn.click();
    Thread.sleep(2000);
    nextMonthBtn.click();
    Thread.sleep(1000);
    datebtn.click();
    Thread.sleep(2000);
    starttimeBtn.click();
    Thread.sleep(2000);
    starttimeBtn.sendKeys("1420");
    Thread.sleep(2000);
    enddateBtn.click();
    Thread.sleep(2000);
    nextMonth2Btn.click();
    Thread.sleep(1000);
    date2Btn.click();
    Thread.sleep(2000);
    endtimeBtn.click();
    Thread.sleep(2000);
    endtimeBtn.sendKeys("1630");
    Thread.sleep(2000);
     descBtn.click();
    Thread.sleep(2000);
    descBtn.sendKeys("This is a posmo App");
    Thread.sleep(2000);
    locationBtn.click();
    Thread.sleep(2000);
    attendeeBtn.click();
    Thread.sleep(2000);
    attendeeBtn.sendKeys("Akshata");
     Thread.sleep(2000);
    consultantBtn.click();
    Thread.sleep(2000);
    consultantBtn.sendKeys("Yogita");
    Thread.sleep(2000);
    createBtn.click();
    Thread.sleep(2000);
    alertBtn.click();
    Thread.sleep(2000);
    
    
    }
}
