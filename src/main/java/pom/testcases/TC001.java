package pom.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.pages.IRCTCHomePage;
import pom.pages.IRCTCRegPage;
import wrappers.Pre_Post_Actions;

public class TC001 extends Pre_Post_Actions{
	
	
	@BeforeTest
	public void beforeTest() {
		testCaseName="TC001";
		testCaseDescription="IRCTC Sign Up";
	}
	
	
	@Test
	public void irctcReg() {
		
		IRCTCHomePage hp = new IRCTCHomePage();
		hp.clickOnRegister();
		
		IRCTCRegPage regpage = new IRCTCRegPage();
		regpage.enterUserName("Gure");
		regpage.enterPassword("Guru@123");
		regpage.enterCnfPassword("Guru@123");
		regpage.clickonPreferredLanguage();
		regpage.clickonEnglish();
		regpage.clickonsecurityquestion();
		regpage.clickonquestion();
		regpage.entersecurityanswer("");
		regpage.clickoncontinue();
		regpage.enterfirstname("sam");
		regpage.entermiddlename("singh");
		regpage.enterlastname("hond");
		regpage.clickonselectoccupation();
		regpage.clickonpublic();
		regpage.clickondateofbirth();
		regpage.clickonmonth();
		regpage.selectmonth("December");
		regpage.clickonyear();
		regpage.selectyear("1993");
		regpage.clickondate();
		regpage.clickonmale();
		regpage.enteremail("java@seleniumgmail,com");
		regpage.entermobile("12345678");
		regpage.clickonselectnationality();
		regpage.selectnationality("94");
		regpage.clickoncontinue1();
		regpage.enterflatnumber("18");
		regpage.enterstreet("raystreet");
		regpage.enterarea("bhawanipur");
		regpage.enterpincode("700020");
		regpage.enterstate("westbengal");
		regpage.clickoncity("");
		regpage.selectcity("kolkata");
		regpage.clickonselectpostoffice();
		regpage.selectpostoffice();
		regpage.enterphonenumber("12345678");
		regpage.clickonno();
		regpage.enterofficenumber("20");
		regpage.enterofficestreet("chakraberia");
		regpage.enterofficearea("bhawanipur");
		regpage.clickonselectcountry();
		regpage.clickonindia();
		regpage.enterofficepin("700020");
		regpage.enterofficestate("West bengal");
		regpage.clickonofficeselectcity();
		regpage.selectofficecity("Kolkata");
		regpage.clickonpostoffice();
		regpage.selectofficepostoffice("A.J.C.Bose Road S.O");
		regpage.enterphone("87654321");
		regpage.clickonterms();
		
			
		
		
		
		
		
	}
	

}
