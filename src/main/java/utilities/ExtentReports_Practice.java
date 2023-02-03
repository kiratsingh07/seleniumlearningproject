package utilities;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReports_Practice {
	
	
	@Test
	public void report() {
		
		ExtentReports extent = new ExtentReports("./reports/samplereport.html");
		
		ExtentTest test = extent.startTest("TC Name", "TC Description");
		
		test.log(LogStatus.PASS, "Test STep Passed");
		test.log(LogStatus.FAIL, "Failed");
		
		
		extent.endTest(test);
		extent.flush();
		
		
		
	}
	

}
