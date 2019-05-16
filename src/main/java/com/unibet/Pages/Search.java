package com.unibet.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.unibet.Base.TestBase;

public class Search extends TestBase
{

	@FindBy(xpath ="(//div[@class='DyuNWRwk8LaMul8OtByVk '])[3]")
	WebElement searchlogo;
	
	
	@FindBy(xpath ="//input[@class='_2wd9gLhmkYlXBxVhBXNH6i']")
	WebElement searchlogoText;
	
	@FindBy(xpath ="(//h1[text()='ATP '])[1]")
	WebElement TextSearch;
	
	
	
	
	public Search() 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickSearch() throws InterruptedException
	{
		searchlogo.click();
		Thread.sleep(3000);
		
	}
	
	
	public void SearchText() throws InterruptedException
	{
		
		searchlogoText.sendKeys(prop.getProperty("sportname"));
		searchlogoText.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		
	}
	
	public String getText()
	{
		String io =TextSearch.getText();
		return io;
	}
	
	
}
