package com.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppSearch {
	
	public AppSearch(WebDriver drv)
	{
		PageFactory.initElements(drv, this);
	}
	
	@FindBy(id="searchString")
	
	private WebElement searchBox;
	
	public WebElement searchBoxPage()
	{
		return searchBox;
	}
	
	@FindBy(id="basicSearchButton")
	private WebElement searchButton;
	
	public WebElement searchButtonPage()
	{
		return searchButton;
	}

}
