package WebDrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathLocators {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.co.in/");
	driver.manage().window().maximize();
	WebElement path = driver.findElement(By.xpath("//body[@jsmodel='hspDDF']"));
	System.out.println(path);
}
}
