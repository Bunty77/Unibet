package com.unibet.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.unibet.Base.TestBase;

public class HomePage extends TestBase
{
	
	
	@FindBy(xpath ="//img[@class='brand-logo']")
	WebElement weblogo;
	
	@FindBy(xpath ="(//span[text()='Casino'])[1]")
	WebElement register;
	
	
	//Initializing the Page Objects:
		public HomePage() {
			PageFactory.initElements(driver, this);
		}
		
		
		
		
		//Actions:
		
		public String validateHomePageTitle()
		{
			System.out.println("Navnath Sujgure:"+driver.getTitle());
			return driver.getTitle();
			
		}
		
		
		public boolean ValidateLogo()
		{
			return weblogo.isDisplayed();
			
		}
		
		public void registerLink()
		{
			register.click();
			
		}
		

}



