package com.unibet.Base;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.unibet.Utils.TestUtil;



public class TestBase 
{

	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase()
	{
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("config.properties");
			prop.load(ip);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialization()
	{
		
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "chromedriver");	
			driver = new ChromeDriver(); 
			System.out.println("Browser Launch Successfully");
		}
		else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "geckodriver");	
			driver = new FirefoxDriver(); 
			
		}

		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		driver.findElement(By.xpath("//span[text()='Hello, Sign in']")).click();
		driver.findElement(By.id("ap_email")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id("ap_password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.id("signInSubmit")).click();
}
	
	
	
}
