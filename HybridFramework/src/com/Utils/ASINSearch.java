package com.Utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.pageFactory.AfterSearch;
import com.pageFactory.AppSearch;
import com.pageFactory.MainQueue;

public class ASINSearch {
	
	public boolean searchASIN(WebDriver driver,String ASIN)
	{
		boolean res=false;
		
		try
		{
			ExcelUtils exu=new ExcelUtils();
			
			//Open Queue page
			MainQueue mnq=new MainQueue(driver);
			
			//Click on App tab
			mnq.appPage().click();
			
			//Enter ASIN in search textBox
			AppSearch apps=new AppSearch(driver);
			apps.searchBoxPage().sendKeys(ASIN);
			
			apps.searchButtonPage().click();
			
			//After Search
			AfterSearch  afsrch=new AfterSearch(driver);
			afsrch.FirstApp().click();
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		TakesScreenshot screen = (TakesScreenshot)driver;
		  File src = screen.getScreenshotAs(OutputType.FILE);
		  File des = new File("D:\\Logs\\CQ\\22-Jun\\xcv.jpeg");
		  try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

}
