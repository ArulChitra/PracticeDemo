package com.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pages.SigninPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSigninPage {
	WebDriver driver;
	SigninPage SIP;
@BeforeTest
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid."
				+ "return_to=https%3A%2F%2Fwww.amazon.com%2F%3F_encoding%3DUTF8%26ref"
				+ "_%3Dnav_em_hd_re_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%"
				+ "2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.m"
				+ "ode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2F"
				+ "auth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net"
				+ "%2Fauth%2F2.0&&ref_%3Dnav_em_hd_clc_signin_0_1_1_39");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		SigninPage SIP =new SigninPage(driver);
		}
@Test
public void check_title()
{
	String actualTitle = SIP.checkTitle();
	String expectedTitle = "Amazon Sign-In";
	Assert.assertEquals(actualTitle, expectedTitle);
}
@Test
public void check_conditionlink()
{
	boolean btn = SIP.checklink();
	Assert.assertTrue(btn);
}
@Test
public void login()
{
	SIP.dologin("Jayachitrakbk94@gmail.com");
}
@Test
public void tear()
{
	driver.close();
	
}
}

