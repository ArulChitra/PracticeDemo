package WebDrivers;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Youtube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.co.in/");
driver.manage().window().maximize();
WebElement btn1 = driver.findElement(By.linkText("Images"));
btn1.click();
WebElement name = driver.findElement(By.className("gLFyf"));
name.sendKeys("selenium");
name.submit();


	}

}
