package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import utils.Utility;

public class ProjectSpecificationMethod extends Utility{
	
	@Parameters({"url","browser"})
	@BeforeMethod
	public void launchingBrowserandLoadingURL(String url,String browser) {
		
		 browser(url,browser);

	}
	
	@AfterMethod
	public void closeBrowser() {
		
		browserclose();
	}
}
	

