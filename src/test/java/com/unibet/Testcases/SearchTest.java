package com.unibet.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.unibet.Base.TestBase;
import com.unibet.Pages.Search;

public class SearchTest extends TestBase
{
	
	
	Search search;
	SearchTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		search = new Search();
	}
	
	
	@Test
	public void validatesearchResult() throws InterruptedException 
	{
		search.clickSearch();
		search.SearchText();
		String io = search.getText();
		Assert.assertEquals(io, "ATP Tennis Betting: Powerful Del Potro a value underdog in Rome against inconsistent Goffin");
		
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
