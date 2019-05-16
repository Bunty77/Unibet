package com.unibet.Testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.unibet.Base.TestBase;
import com.unibet.Pages.HomePage;
import com.unibet.Pages.Casino;

public class HomePageTest extends TestBase
{

	HomePage homepage;
	Casino casino;
	
	public HomePageTest()
	{
		super();
	}  
	
	

	@BeforeMethod
	public void setup()
	{
		initialization();
		 homepage = new HomePage();
		 casino = new Casino();
		  
	}
	
	
	@Test
	public void homepageTitleTest()
	{
		String title = homepage.validateHomePageTitle();
		Assert.assertEquals(title, "Sports Blog | Latest Football & Sports News | Betting Tips - Unibet Blog");		
	}
	
	
	@Test
	public void homepagelogoTest()
	{
		boolean title = homepage.ValidateLogo();
		Assert.assertTrue(title);	
	}
	
	@Test
	public void ValidateCasinoLink()
	{
		
			homepage.registerLink();
			String io = casino.validatecasino();
			System.out.println("Current url:"+io);
			Assert.assertEquals(io, "https://www.unibet.co.uk/casino");
		
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
}
