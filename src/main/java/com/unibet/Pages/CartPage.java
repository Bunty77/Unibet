package com.unibet.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.unibet.Base.TestBase;

public class CartPage extends TestBase
{

	@FindBy(xpath ="//span[text()='Cart']")
	WebElement Cart;
	
	
	public CartPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickCartlogo()
	{
		Cart.click();
	}
	
	public void removecartitem() throws InterruptedException
	{
		driver.findElement(By.xpath("(//input[@value='Delete'])[2]")).click();
		Thread.sleep(4000);
	}
	
	public void dropdown() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='a-dropdown-container']")).click();
		List<WebElement> io =  driver.findElements(By.xpath("//li[@class='a-dropdown-item quantity-option']"));
		io.get(0).click();
		
		Thread.sleep(5000);
	}
	
}
