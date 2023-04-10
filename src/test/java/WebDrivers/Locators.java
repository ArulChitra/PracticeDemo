package WebDrivers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com");
driver.manage().window().maximize();

WebElement element = driver.findElement(By.name("q"));
element.sendKeys("Oranium");

List<WebElement> list2 = driver.findElements(By.tagName("a"));
System.out.println(list2);
List<WebElement> list = driver.findElements(By.linkText("Advertising"));
int i = list.size();
System.out.println(i);

driver.close();
	}

}
