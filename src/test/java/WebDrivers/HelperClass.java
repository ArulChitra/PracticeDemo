package WebDrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HelperClass {

	public static WebDriver getDriver(String BrowserName)
	{
		switch(BrowserName)
		{
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver = new FirefoxDriver();
			break;
		case "edge":
		    WebDriverManager.edgedriver().setup();
		    WebDriver driver = new EdgeDriver();
		    break;
	
		    default:
		    	System.out.println("Please enter valid browsername");
		    	}
		return driver;
	}
}


