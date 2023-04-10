package WebDrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConditionalCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();

WebDriver driver = new ChromeDriver();
driver.get("https://www.computerhope.com/jargon/c/checkbox.htm");
driver.manage().window().maximize();
WebElement inputbox = driver.findElement(By.name("q"));
boolean displayed = inputbox.isDisplayed();
System.out.println(displayed);
boolean enabled = inputbox.isEnabled();
System.out.println(enabled);

WebElement select = driver.findElement(By.xpath("//input[@name='Example-1']"));
select.click();
WebElement select1 = driver.findElement(By.xpath("//input[@name='Example-2']"));
select1.click();
boolean selected = select.isSelected();
System.out.println(selected);
driver.close();


	}

}
