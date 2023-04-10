package WebDrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://letcode.in/radio");
driver.manage().window().maximize();
WebElement checkbox = driver.findElement(By.xpath("//input[@id='nobug']"));
Thread.sleep(3000);
checkbox.click();

	}

}
