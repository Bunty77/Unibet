package com.unibet.Utils;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.unibet.Base.TestBase;

public class TestUtil extends TestBase
{
	
	public static long PAGE_LOAD_TIMEOUT = 50;
	public static long IMPLICIT_WAIT = 50;
	
	public TestUtil()
	{
		super();
	}
	
	public static String captureScreenshot()
	{
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		 // now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src, new File("C:/selenium/error.png"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
		
	}

}
