package com.TestCases;

import java.io.File;

import org.apache.commons.io.CopyUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Utils.ASINSearch;
import com.Utils.ExcelUtils;
import com.Utils.SelectBrowser;
import com.sun.jna.platform.FileUtils;

public class SearchASIN2 {
	ExcelUtils exu;
	SelectBrowser sel_Browser;
	
	ASINSearch asin;
	WebDriver driver;
	
	@BeforeMethod
	  public void beforeMethod() {
		  exu=new ExcelUtils();
		  sel_Browser=new SelectBrowser();
		  asin=new ASINSearch();
		  
		 	   
	  }
	
  @Test
  public void testCase1() {
	  boolean tc_res=false;
	  try
	  {
		 XSSFSheet sht =exu.getSheet("D:\\CQ\\Feb\\Tester\\Nitin\\03 Apr.xlsx", "Format");
		 
		 String ASIN=exu.getASIN(sht, 1, 1);
		 driver=sel_Browser.getBrowser();//Select browse

		 asin.searchASIN(driver, ASIN);
	  }
	  catch (Exception e)
	  {
		  e.printStackTrace();
		  Reporter.log("Error Message"+e.getMessage());
		  tc_res=false;
	  }
	  
  }
  

  @AfterMethod
  public void afterMethod() {
	  driver.close();
	  driver.quit();
  }

}
