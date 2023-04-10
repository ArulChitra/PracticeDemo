package ExtentReports;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportClass {

	ExtentSparkReporter spark;
	ExtentReports extent;
	ExtentTest test;
	
@BeforeTest	
public void setup()
{
	spark = new ExtentSparkReporter(System.getProperty("user.dir")+"\\Report\\Webpage.html");
	extent = new ExtentReports();
	extent.attachReporter(spark);

}
@Test
public void Project()
{
	test = extent.createTest("Signing the test").assignDevice("Chrome").assignCategory("Smoke Test");
	test.log(Status.PASS, "Opening in the Webpage");
	test.pass("Webpage Opening Successfully");
	
}
@Test
public void Project1()
{
	test = extent.createTest("Create first dashboard").assignDevice("Chrome").assignCategory("Sanity Test");
	test.assignAuthor("WPA");
	test.info("Insurence");
}

@AfterTest
public void tear()
{
	extent.flush();
	
}
}