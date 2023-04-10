package WebDrivers;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calculate {
	WebDriver driver;
	@BeforeTest
	public void test()
	{
		ChromeOptions c = new ChromeOptions();
		c.addArguments("--disable-notifications");
		
	WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	
	driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
	driver.manage().window().maximize(); 
	WebElement Alert = driver.findElement(By.id("wzrk-cancel"));
	Alert.click();
}

@Test (dataProvider="Datas")
public void calculate(String rate, String interest, String Tenure) throws InterruptedException
{
	driver.findElement(By.name("principal")).sendKeys(rate);
	driver.findElement(By.name("interest")).sendKeys(interest);
	driver.findElement(By.name("tenure")).sendKeys(Tenure);
	
 }
@DataProvider
public Object[] Datas()
{
	Object datas[]= {"10000", "2", "12"};
	return datas;
}
@AfterTest
public void tear() throws InterruptedException
{
	Thread.sleep(3000);
	driver.close();
}
}
