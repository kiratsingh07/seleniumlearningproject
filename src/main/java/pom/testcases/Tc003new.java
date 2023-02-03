package pom.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.pages.IRCTCHomePage;
import pom.pages.Irctcftrnewpage;
import wrappers.Prepostactions1;

public class Tc003new extends Prepostactions1 {
	@BeforeTest
	public void beforetest() {
	testcasename="Tc003new";
	testcasedescription="irctcftrnew";
}
	@Test
	public void irctcftrnewpage() throws InterruptedException {
		IRCTCHomePage hp = new IRCTCHomePage();
		hp.mouseHoverontrains();
		hp.clickonftr();
		hp.switchToftrpage();
		Thread.sleep(3000);
		Irctcftrnewpage ftrnew = new Irctcftrnewpage();
		ftrnew.clickonnewuser();
		ftrnew.enteruserid("kirat007");
		ftrnew.enterpassword("Malhi9038");
		ftrnew.entercnfrmpasswrd("Malhi9038");
		ftrnew.clickonsecurityquestion();
		ftrnew.selectquestion("5");
		ftrnew.entersecanswer("singh");
		ftrnew.clickondateofbirth();
		ftrnew.enterdateofbirth("5/12/1993");
		ftrnew.clickondate();
		ftrnew.clickongender();
		ftrnew.clickonmaritialstatus();
		ftrnew.enteremail("gurki.singhmalhi@gmail.com");
		ftrnew.clickonoccupation();
		ftrnew.selectoccupation("Government");
		ftrnew.enterfirstname("gurkirrat");
		ftrnew.entermiddlename("singh");
		ftrnew.enterlastname("malhi");
		ftrnew.clickonnationality();
		ftrnew.selectnationality("94");
		ftrnew.enterflatno("18");
		ftrnew.enterstreetno("raystreet");
		ftrnew.enterarea("bhawanipur");
		ftrnew.clickoncountry();
		ftrnew.selectcountry("94");
		ftrnew.entermobilenumber("9883086081");
		ftrnew.enterpincode("700020");
		ftrnew.clickcity();
		ftrnew.selectcity("Kolkata");
		ftrnew.clickonstate();
		ftrnew.selectstate("WEST BENGAL");
		ftrnew.clickpostoffice();
		ftrnew.selectpostoffcie("A.J.C.Bose Road S.O");
		Thread.sleep(3000);
		ftrnew.clickonno();
		ftrnew.enterflatnumber("14");
		ftrnew.enterstreet("raystreet");
		ftrnew.enterarea1("bhawanipur");
		ftrnew.clickcountry1();
		ftrnew.selectcountry1("94");
		ftrnew.entermobilenumber1("9883086081");
		ftrnew.enterpincode1("700014");
		ftrnew.clickoncity1();
		ftrnew.selectcity1("Kolkata");
		ftrnew.clickonstate1();
		ftrnew.selectstate1("WEST BENGAL");
		ftrnew.clickpostoffice1();
		ftrnew.selectpostoffice1("Sealdah S.O");
		
		
		
		
			
		
	}

}
