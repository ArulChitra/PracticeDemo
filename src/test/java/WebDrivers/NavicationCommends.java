package WebDrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavicationCommends {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com");
driver.manage().window().maximize();
driver.get("https://www.amazon.in/");
driver.get("https://www.flipkart.com/");
driver.get("https://www.shopsy.in/reseller-homepage-store?utm_medium=WA&utm_campaign=WA_1005868&cmpid=WA_1005868");
Thread.sleep(5000);

driver.navigate().back();
Thread.sleep(5000);
driver.navigate().back();
Thread.sleep(5000);
driver.navigate().back();
Thread.sleep(5000);
driver.navigate().refresh();
driver.navigate().to("https://www.instagram.com/");
Thread.sleep(5000);
driver.close();











	}

}
