package com.Utils;

import java.io.InputStream;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SelectBrowser {
	
	String brName;
	public WebDriver getBrowser()
	{
		WebDriver drv = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter browser name:--> ");
		System.out.println();
		brName=sc.nextLine();
		
		switch(brName)
		{
		case "firefox":
			drv = new FirefoxDriver();	
			break;
		case "ie":
			String IEPath="D:\\Selenium jars\\IEDriverServer.exe";
			System.setProperty("webdriver.ie.driver", IEPath);
			drv = new InternetExplorerDriver();
			break;
		case "chrome":
			String chPath = "D:\\Selenium jars\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", chPath);
			drv = new ChromeDriver();
			break;
		default:
			System.out.println("Invalid browser");
		
		}
		//drv=new FirefoxDriver();
		drv.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		drv.manage().window().maximize();
		drv.get(Constants.URL);
		return drv;
	
		
		
	}

}
