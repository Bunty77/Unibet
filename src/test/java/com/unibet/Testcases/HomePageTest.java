package com.unibet.Testcases;


import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.unibet.Base.TestBase;
import com.unibet.Pages.CartPage;
import com.unibet.Pages.HomePage;
import com.unibet.Pages.Search;
import com.unibet.Utils.TestUtil;


public class HomePageTest extends TestBase
{

	HomePage homepage;
	Search search;
	CartPage cart;

	
	public HomePageTest()
	{
		super();
	}  
	
	

	@BeforeMethod
	public void setup()
	{
		initialization();
		 homepage = new HomePage();
		 search = new Search();
		 cart = new CartPage();
		 

		  
	}
	
	@Test(priority=1)
	public void validateAmazon() throws InterruptedException
	{
		
		homepage.clickDepartment();
		
		homepage.clickHeadPhones();
		homepage.viewHeadPhone();
		
		homepage.selectdropdown("1");
		homepage.AddtoCart();
		

	}
	
	@Test(priority=2)
	public void validatesearchResult() throws InterruptedException 
	{
		
		search.SearchText();
		search.clickSearch();
		search.clickmacbook("Apple MacBook Pro");
		homepage.selectdropdown("2");
		homepage.AddtoCart();
		homepage.clickwarrenty();
		

	}
	
	
	@Test(priority=3)
	public void cartAction() throws InterruptedException
	{
		cart.clickCartlogo();
		cart.removecartitem();
		cart.dropdown();
		

	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		 
		
		}
		 
	
	
	
}
