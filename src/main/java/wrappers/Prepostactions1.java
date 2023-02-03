package wrappers;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Prepostactions1 extends GenericWrappers{
	public static String testcasename;
	public static String testcasedescription;
	
	
	@BeforeSuite
	public void beforeSuite() {
		startReport();
	}
	
	
	
	@BeforeClass
	public void beforeClass() {
		startTest(testcasename, testcasedescription);
	}
	
	
	@BeforeMethod
	public void beforeMethod() {
		invokeApp("chrome", "https://irctc.co.in");
	}
	
	@AfterMethod
	public void afterMethod() {
		//closeAllBrowsers();
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

	
	


