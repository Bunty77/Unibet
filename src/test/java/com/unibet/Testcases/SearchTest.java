package com.unibet.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.unibet.Base.TestBase;
import com.unibet.Pages.HomePage;
import com.unibet.Pages.Search;

public class SearchTest extends TestBase
{
	
	
	Search search;
	HomePage homepage;
	SearchTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		search = new Search();
		homepage = new HomePage();
	}
	
	
	@Test
	public void validatesearchResult() throws InterruptedException 
	{
		
		search.SearchText();
		search.clickSearch();
		search.clickmacbook("Apple MacBook Pro");
		homepage.selectdropdown("2");
	}

	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
