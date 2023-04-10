package MouseOperations;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandling {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://testautomationpractice.blogspot.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
WebElement inputbox = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
inputbox.sendKeys("java");
WebElement button = driver.findElement(By.className("wikipedia-search-button"));
button.click();
List<WebElement> all_links = driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']/a"));

for(WebElement links : all_links)
{
	links.click();
}
String parentid = driver.getWindowHandle();
System.out.println(parentid);
Set<String> all_handles = driver.getWindowHandles();
System.out.println(all_handles);







	}

}
