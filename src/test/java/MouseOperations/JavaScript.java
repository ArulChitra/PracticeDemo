package MouseOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://www.instagram.com/");
driver.manage().window().maximize();
WebElement input = driver.findElement(By.xpath("//input[@class='_aa4b _add6 _ac4d']"));
input.sendKeys("9840147221");
JavascriptExecutor jsc = (JavascriptExecutor)driver;
jsc.executeScript("arguments[0].style.border='3px solid red';",input);
Thread.sleep(2000);
WebElement pwd = driver.findElement(By.name("password"));
pwd.sendKeys("Anamithra@2021");

	}

}
