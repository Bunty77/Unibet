package com.unibet.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.unibet.Base.TestBase;

import io.qameta.allure.Step;

public class Search extends TestBase
{

	@FindBy(xpath ="//input[@id='twotabsearchtextbox']")
	WebElement searchText;
	
	
	@FindBy(xpath ="//input[@value='Go']")
	WebElement searchClick;
	
	@FindBy(xpath ="(//div[@class='a-section a-spacing-medium'])[4]")
	WebElement Macbook;
	
	
	//Actions
	
	public Search() 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@Step("Click Search Steps")
	public void clickSearch() throws InterruptedException
	{
		searchClick.click();
		Thread.sleep(7000);
		
	}
	
	@Step("Enter Mackbook Pro Value in SearchBox Steps")
	public void SearchText() throws InterruptedException
	{
		
		searchText.sendKeys(prop.getProperty("laptop"));
		
		Thread.sleep(4000);
		
		
	}
	@Step("Click On MacBook Pro Result Steps")
	public void clickmacbook(String Str)
	{
		
		List<WebElement> li = driver.findElements(By.xpath("//h2/a/span[contains(text(),'"+Str+"')]"));
		li.get(1).click();
		
		
	}
	
	
}
