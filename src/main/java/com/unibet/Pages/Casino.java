package com.unibet.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.unibet.Base.TestBase;

public class Casino extends TestBase
{

	
	public String validatecasino()
	{
		
		return driver.getCurrentUrl();
		
	}
	
}
