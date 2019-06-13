package com.unibet.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.unibet.Base.TestBase;

import io.qameta.allure.Step;

public class CartPage extends TestBase
{

	@FindBy(xpath ="//span[text()='Cart']")
	WebElement Cart;
	
	
	//Actions
	
	
	public CartPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@Step("Click on Cart Logo Steps")
	public void clickCartlogo()
	{
		Cart.click();
	}
	
	@Step("Remove Cart Item Step")
	public void removecartitem() throws InterruptedException
	{
		driver.findElement(By.xpath("(//input[@value='Delete'])[2]")).click();
		Thread.sleep(4000);
	}
	
	@Step("Click on DropDown Item Steps")
	public void dropdown() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='a-dropdown-container']")).click();
		List<WebElement> io =  driver.findElements(By.xpath("//li[@class='a-dropdown-item quantity-option']"));
		io.get(0).click();
		
		Thread.sleep(5000);
	}
	
}
