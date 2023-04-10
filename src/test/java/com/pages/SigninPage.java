package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SigninPage {
	WebDriver driver;
	
	public SigninPage(WebDriver driver)
	{
		this.driver=driver;
	}
By uname=By.id("ap_email");
By button=By.id("continue");
By link=By.linkText("//a[text()='Conditions of Use']");
By link1=By.className("a-expander-prompt");
By button1=By.className("a-button a-button-span12 a-button-base");

public String checkTitle()
{
	String title = driver.getTitle();
	return title;
}
public boolean checklink()
{
	boolean displayed = driver.findElement(link).isDisplayed();
	return displayed;
	}
public void dologin(String username)
{
	driver.findElement(uname).sendKeys(username);
	driver.findElement(button).click();
	
}



}
