package com.capgemini.seltestclasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.capgemini.POMs.ViewWorkshop2;

public class ViewWorkshopTest2 extends BaseTest {
	@Test
	public void workshopPage() throws Exception{
		ViewWorkshop2 Int= new ViewWorkshop2(driver);
		Int.click();
	}

		/*
		 * AssertEquals(true, Int.workshopBtn.isEnabled());
		 * System.out.println("Workshop summary is displayed");
		 * 
		 * }
		 * 
		 * @Test(dependsOnMethods="workshopPage") public void TestAddBtn() throws
		 * Exception{ WorkshopSummary2 Int = new WorkshopSummary2(driver);
		 * Thread.sleep(5000); assertEquals(true,WorkshopSummary2.addBtn.isDisplayed()
		 * );
		 * System.out.println("Add new button is available on workshop summary page");
		 * WorkshopSummary2.addBtn.click(); Thread.sleep(2000);
		 * assertEquals(true,WorkshopSummary2.newWorkshop.isDisplayed() );
		 * System.out.println("new workshop is available");
		 */
		
	}
	
	


