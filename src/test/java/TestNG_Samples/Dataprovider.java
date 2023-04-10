package TestNG_Samples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dataprovider {
	WebDriver driver;
	
	@BeforeTest
	public void FB()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
						
	}
    @Test (dataProvider = "data" )
    public void collect()
    {
    	driver.findElement(By.id("email")).sendKeys("uname");
    	driver.findElement(By.id("pass")).sendKeys("pwd");
    	driver.findElement(By.name("login")).click();
    }
    @DataProvider
    public Object[][] data()
    {
    	Object array[][]= {{"Jayachitrakbk94@gmail.com"},{"Monikafm@10"}}; 
    	return array;		       
    	
    }
    @AfterTest
    public void tear() throws InterruptedException
    {
    	Thread.sleep(3000);
    	driver.close();
    	    }
}
