package com.unibet.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.unibet.Base.TestBase;

public class HomePage extends TestBase
{
	
	
	@FindBy(xpath ="//span[text()='Departments']")
	WebElement departments;
	
	@FindBy(xpath ="//a[text()='Headphones']")
	WebElement Headphones;
	
	@FindBy(xpath ="//div[contains(@class,'a-spacing-none')]/h2/a/span")
	List<WebElement> headphoneview;
	
	@FindBy(id ="add-to-cart-button")
	WebElement AddtoCart;
	
	
	
	//Initializing the Page Objects:
		public HomePage() {
			PageFactory.initElements(driver, this);
		}
		
		
		
		
		//Actions:
		
		
		public void clickDepartment()
		{
			departments.click();
		}
		
		
		public void clickHeadPhones()
		{
			Headphones.click();
		}
		
		public void viewHeadPhone() throws InterruptedException
		{
			
			List<WebElement> lip = driver.findElements(By.xpath("//div[contains(@class,'a-spacing-none')]/h2/a/span"));
			
			lip.get(0).click();
			Thread.sleep(2000);
			
		}
		
		public void selectdropdown(String value) throws InterruptedException
		{
			driver.findElement(By.id("quantity")).click();
			Select dropdown = new Select(driver.findElement(By.id("quantity")));
			dropdown.selectByValue(value);
			driver.findElement(By.id("quantity")).click();
			
		}
		
		public void AddtoCart() throws InterruptedException 
		{
			AddtoCart.click();
			Thread.sleep(4000);
			
			
		}
		
		public void clickwarrenty()
		{
			driver.findElement(By.xpath("//i[@class='a-icon a-icon-close']")).click();
		}
		

}



