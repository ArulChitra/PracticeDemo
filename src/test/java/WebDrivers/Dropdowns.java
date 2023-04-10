package WebDrivers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdowns {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://letcode.in/dropdowns");
	driver.manage().window().maximize();
	List<WebElement> list = driver.findElements(By.xpath("//select[@id='fruits']/option"));
	
	for(WebElement drop: list)
	{
		if(drop.getText().equals("Orange"))
		{
			drop.click();	
		}
	}
	
	
}
}
