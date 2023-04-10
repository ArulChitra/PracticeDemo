package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	                                                 
//using locators
	By name = By.id("email");
	By pwd = By.id("pass");
	By log_in = By.name("login");
	By forget_link = By.xpath("//a[text()='Forgotten account?']");
	By signin_link = By.xpath("//a[text()='Sign up for Facebook']");
	this.driver=driver
	//using actions
	public void Inputbox()
	{
		
	}
	public void pwdbox()
	{
		
	}
	public void loginbtn()
	{
		
	}
	public void link()
	{
		
	}
	
}
