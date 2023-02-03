package utilities;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class CommonReporter {
	
	public static ExtentReports extent;
	public static ExtentTest test;
	
	
	public void startReport() {
		extent =  new ExtentReports("./reports/report.html");
	}
	
	public void startTest(String testCaseName, String testCaseDescription) {
		test = extent.startTest(testCaseName, testCaseDescription);
	}
	
	
	
	public void endTest() {
		extent.endTest(test);
	}
	
	public void endReport() {
		extent.flush();
	}

}
