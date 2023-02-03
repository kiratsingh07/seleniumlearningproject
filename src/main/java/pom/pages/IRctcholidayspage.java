package pom.pages;

import wrappers.GenericWrappers;

public class IRctcholidayspage extends GenericWrappers {

	
		// TODO Auto-generated method stub
public void mousehoveronholidays() {
	mouseHoverByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/a");
}
public void mousehoveronstays() {
		mouseHoverByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]/a/span[1]");
		
	}
public void clickonlounge() {
	clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]/ul/li[2]/a/span");
}
public void switchToLoungePage() {
	switchToLastWindow();
}
public void clickonstation() {
	clickByName("city");
}
public void selectstationame(String text) {
	selectvaluebyname("city",text);
}
public void clickonlounge1() {
	clickByName("laungecity");
}
public void selectloungename(String text) {
	selectvaluebyname("laungecity",text);
}
public void clickonperson() {
	clickByName("selPassangers");
}
public void selectonnumberperson(String text) {
	selectvaluebyname("selPassangers",text);
}
public void clickoncheckin() {
	clickByName("acservicecheckindate");
}
public void clickonyear() {
	clickByXpath("/html/body/app-root/accommodation/div[2]/div[2]/div/form/div[4]/div/div/table/thead/tr[1]/th[2]");
}
public void clickondate() {
	clickByXpath("/html/body/app-root/accommodation/div[2]/div[2]/div/form/div[4]/div/div/table/thead/tr[1]/th[2]");
}
public void clickoncheckintime() {
	clickByName("checkInTime");
}
public void selecttime(String text) {
	selectvaluebyname("selecttime",text);
}
	
	public void clickonduration() {
		clickByName("checkOutTime");
	}
	public void selecthours(String text) {
		selectvaluebyname("V",text);
	}
		public void clickonbook() {
			clickByXpath("/html/body/app-root/accommodation/div[2]/div[2]/div/form/div[11]/button[2]");
		}
		public void clickonguest() {
			clickById("profile-tab");
		}
			public void enterguestemail(String email) 
			{ enterByName("email",email);
			}
			public void entermobilenumber( String mobile) 
			{enterByName ("mobileNo",mobile);
			}
			public void clickonlogin() {
				clickByXpath("//*[@id=\"profile\"]/div/form/div[3]/button");
			}
			public void entername( String name) {
				enterByXpath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[1]/td[2]/input",name);
			}
			public void enterage( String age) {
				enterByXpath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[1]/td[3]/input",age);
			}
			public void clickongender() {
				clickByXpath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[1]/td[4]/select");
				
			}
			public void selectgender (String text) {
				selectvaluebyxpath("html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[1]/td[4]/select","text");
			}
			public void entername1( String name1) {
				enterByXpath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[2]/td[2]/input",name1);
				
			}
			public void enterage1(String age1) {
				enterByXpath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[2]/td[3]/input",age1);
			}
			public void clickongender1() {
				clickByXpath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[2]/td[4]/select");
			}
			public void selectgender1(String text) {
				selectbyvalue("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[2]/td[4]/select","text");
			}
			public void clickonstate() {
				clickByName("state");
			}
			public void selectstate(String text) {
				selectvaluebyname("state",text);
			}	
			public void  clickonsubmit() {
			clickByXpath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[4]/button[2]");
			}
			public void verifyEmailId(String expectedText) {
			verifytextbyName("email", expectedText);	
			}
			public void verifypassword(String expectedpassword) {
				verifytextbyName("mobileNo",expectedpassword);
			}
			
			public void getAmount() {
				System.out.println(getTextByXpath("/html/body/app-root/acsummery/div/div[2]/div/div/div/div[3]/div[1]/div[3]/span"));
			}
			public void clickonagree() {
				clickByXpath("/html/body/app-root/acsummery/div/div[2]/div/div/div/div[3]/div[1]/div[5]/div/label/span");
				
			}
			public void  clickonpayment() {
				clickByXpath("/html/body/app-root/acsummery/div/div[2]/div/div/div/div[3]/div[2]/button");
				
			}
			
				
				
				
				
				
			
		

	
}
	



