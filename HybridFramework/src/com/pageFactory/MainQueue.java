package com.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainQueue {
	
	public MainQueue(WebDriver drv)
	{
		PageFactory.initElements(drv, this);
	}
	@FindBy(id="appsLink")
	private WebElement apps;
	public WebElement appPage()
	{
		return apps;
	}
	

}
