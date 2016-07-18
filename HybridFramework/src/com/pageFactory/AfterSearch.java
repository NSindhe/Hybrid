package com.pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AfterSearch {
	
	public AfterSearch(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//table[@id='title']/tbody/tr/td[1]/a")
	private WebElement FirstASIN;
	public WebElement FirstApp()
	{
		return FirstASIN;
	}
}
