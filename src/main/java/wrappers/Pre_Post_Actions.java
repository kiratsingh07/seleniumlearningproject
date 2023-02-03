package wrappers;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Pre_Post_Actions extends GenericWrappers{
	
	
	public static String testCaseName;
	public static String testCaseDescription;
	
	@BeforeSuite
	public void beforeSuite() {
		startReport();
	}
	
	
	
	@BeforeClass
	public void beforeClass() {
		startTest(testCaseName, testCaseDescription);
	}
	
	
	@BeforeMethod
	public void beforeMethod() {
		invokeApp("chrome", "https://irctc.co.in");
	}
	
	@AfterMethod
	public void afterMethod() {
		closeAllBrowsers();
	}
	
	@AfterClass
	public void afterClass() {
	endTest();	
	}
	
	@AfterTest
	public void afterTest() {
		
	}
	
	@AfterSuite
	public void afterSuite() {
		endReport();
	}
	

}
