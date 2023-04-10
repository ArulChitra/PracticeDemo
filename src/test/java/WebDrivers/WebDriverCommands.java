package WebDrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.edgedriver().setup();
WebDriver driver = new EdgeDriver();
driver.get("https://www.google.com/search?q=facebook&rlz=1C1YTUH_enIN1009IN1009&oq=fa&aqs=chrome.1.69i57j0i131i433i512l5j46i131i433j69i61.1909j0j7&sourceid=chrome&ie=UTF-8");
driver.manage().window().maximize();
String url = driver.getCurrentUrl();
System.out.println(url);
String title = driver.getTitle();
System.out.println(title);
String expectedtitle = "Facebook";
String pageSource = driver.getPageSource();
System.out.println(pageSource);
if
(title.equals(expectedtitle))
{
	System.out.println("Test case Passed");
	}
else
{
	System.out.println("Test case Failed");
}
	}
	

}
