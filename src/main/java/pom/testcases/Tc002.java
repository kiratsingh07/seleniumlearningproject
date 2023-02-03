package pom.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.pages.IRCTCHomePage;
import pom.pages.IRctcholidayspage;
import wrappers.Pre_Post_Actions;

public class Tc002  extends Pre_Post_Actions{
	@BeforeTest
	public void beforetest() {
		testCaseName="tc002";
		testCaseDescription="irctc lounge";
	}
	
	
	@Test
	public void irctcholiday() throws InterruptedException {
	IRCTCHomePage hp=new IRCTCHomePage();
	hp.mouseHoverOnHolidays();
	hp.mouseHoverOnStays();
	
	IRctcholidayspage holpage =new IRctcholidayspage();
	holpage.clickonlounge();
	holpage.switchToLoungePage();
	holpage.clickonstation();
	holpage.selectstationame("SDAH");
	holpage.clickonlounge1();
	holpage.selectloungename("1: Object");
	holpage.clickonperson();
	holpage.selectonnumberperson("2");
	Thread.sleep(3000);
	holpage.clickoncheckin();
	holpage.clickonyear();
	holpage.clickondate();
	holpage.clickoncheckintime();
	holpage.selecttime("04:00");
	holpage.clickonduration();
	holpage.selecthours("02:00");
	holpage.clickonbook();
	holpage.clickonguest();
	holpage.enterguestemail("seleniumjava@gmail.com");
	holpage.entermobilenumber("12345678");
	holpage.clickonlogin();
	holpage.entername("kirat");
	holpage.enterage("28");
	holpage.clickongender();
	holpage.selectgender("Male");
	holpage.entername1("harry");
	holpage.enterage1("25");
	holpage.clickongender1();
	holpage.selectgender1("Male");
	holpage.clickonstate();
	holpage.selectstate("WEST BENGAL");
	holpage.clickonsubmit();
	holpage.verifyEmailId("");
	holpage.verifypassword("");	
	holpage.getAmount();
	holpage.clickonagree();
	holpage.clickonpayment();
	
		
	

	
	
	}

}
