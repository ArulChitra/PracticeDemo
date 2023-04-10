package WebDrivers;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlartCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("https://the-internet.herokuapp.com/javascript_alerts");
driver.manage().window().maximize();
WebElement element = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
element.click();
Alert alt = driver.switchTo().alert();
Thread.sleep(5000);
alt.accept();
WebElement element2 = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
element2.click();
Alert alt2 = driver.switchTo().alert();
Thread.sleep(5000);
alt2.dismiss();
WebElement element3 = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
element3.click();
Alert alt3 = driver.switchTo().alert();
Thread.sleep(3000);
alt.sendKeys("Oranium Tech");
alt.accept();
driver.close();

	}

}
