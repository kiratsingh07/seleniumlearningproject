package pom.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.pages.IRCTCHomePage;
import pom.pages.Irctcftrpage;
import wrappers.Prepostactions1;

public class Tc003 extends Prepostactions1 {
	@BeforeTest
	public void beforetest() {
		testcasename="Tc003";
		testcasedescription="irctc ftr";
	}
	
	
	@Test
public void irctcftr() throws InterruptedException {
	IRCTCHomePage hp = new IRCTCHomePage();
	hp.mouseHoverontrains();
	hp.clickonftr();
	hp.switchToftrpage();
	Thread.sleep(3000);
	
	Irctcftrpage ftrpage=new Irctcftrpage();
	ftrpage.clickonnewuser();
	ftrpage.enterusername("kirat007");
	ftrpage.enterpassword("Malhi9038");
	ftrpage.enterconfirmpsswrd("Malhi9038");
	//ftrpage.clickonsecurityquestion();
	ftrpage.selectquestion("5");
	ftrpage.enterdateofbirth("5/12/1993");
	ftrpage.clickondate();
	ftrpage.clickonmale();
	ftrpage.clickonmaritial();
	ftrpage.enteremail("gurki.singhmalhi@gmail.com");
	ftrpage.clickonoccupation();
	ftrpage.selectoccupation("Public");
	ftrpage.enterfirstname("gurkirrat");
	ftrpage.entermiddlename("singh");
	ftrpage.enterlastname("malhi");
	ftrpage.clicknationality();
	ftrpage.selectnationality("94");
	ftrpage.enterflatno("18");
	ftrpage.enterstreet("raystreet");
	ftrpage.enterarea("bhawanipur");
	//ftrpage.clickcountry();
	ftrpage.selectcountry("94");
	ftrpage.entermobile1("12345678");
	ftrpage.enterpincode("700020");
	ftrpage.clickoncity();
	ftrpage.selectcity("Kolkata");
	ftrpage.clickonstate();
	ftrpage.selectstate("WEST BENGAL");
	//ftrpage.clickonpostoffice();
	ftrpage.selectpostoffice("A.J.C.Bose Road S.O");
	Thread.sleep(3000);
	ftrpage.clickonNO();
	Thread.sleep(5000);
	ftrpage.enterflatnumber("14");
	ftrpage.enterstreet1("chakraberia");
	ftrpage.enterarea1("bhawanipur");
	ftrpage.clickoncountry();
	ftrpage.selectcountry("94");
	ftrpage.entermobile1("87654321");
	ftrpage.enterpincode1("700014");
	ftrpage.clickoncity1();
	ftrpage.selectcity1("Kolkata");
	ftrpage.clickonstate1();
	ftrpage.selectstate1("WEST BENGAL");
	ftrpage.clickonpostoffice1();
	ftrpage.selectpostoffice1("A.J.C.Bose Road S.O");
	
	
	
	
	}
}
