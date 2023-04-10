package com.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestLoginPage {
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/?"
				+ "privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhd"
				+ "Glvbl90aW1lIjoxNjc4MjU4OTkxLCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		LoginPage login = new LoginPage(driver);
		
			}
	
	public void checkinputbox()
	{
		
	}
	public void checkpwdbox()
	{
		
	}
	public void checkloginbtn()
	{
		
	}
	public void checklink()
	{
		
	}

}
