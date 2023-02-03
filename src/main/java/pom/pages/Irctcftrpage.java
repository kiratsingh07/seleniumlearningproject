package pom.pages;

import wrappers.GenericWrappers;

public class Irctcftrpage extends GenericWrappers {
	
	public void clickonnewuser() {
		clickByXpath("//*[@id=\"planner\"]/table/tbody/tr[4]/td[2]/div/a[2]");
	}public void enterusername(String text) {
		enterById("userId",text);

	}public void enterpassword(String text) {
		enterById("password",text);
	}public void enterconfirmpsswrd(String text) {
		enterById("cnfPassword",text);
	}public void clickonsecurityquestion() {
		clickById("secQstn");
	}public void selectquestion( String text) {
		selectbyvalue("secQstn",text);
	}public void enterdateofbirth(String text) {
		enterById("dateOfBirth",text);
	}public void clickondate() {
		clickByXpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[1]/a");
	
	}public void clickonmale() {
		clickByName("gender");
	}public void clickonmaritial() {
		clickByName("maritalStatus");
	}public void enteremail(String text) {
		enterById("email",text);
	}public void clickonoccupation() {
		clickById("occupation");
	}public void selectoccupation(String text) {
		selectbyvalue("occupation",text);
	}public void enterfirstname(String text) {
		enterById("fname",text); 
		}
	public void entermiddlename(String text) {
		enterById("mname",text);
	}
	public void enterlastname (String text) {
		enterById("lname",text);
	}
	public void clicknationality() {
		clickById("natinality");
	}
	public void selectnationality(String text) {
		selectbyvalue("natinality",text);
	}
	public void enterflatno(String text) {
		enterById("flatNo",text);
	}
	public void enterstreet(String text) {
		enterById("street",text);
	}
	public void enterarea(String text) {
		enterById("area",text);
		
	}
	public void  clickcountry() {
		clickById("country");
	}
	public void selectcountry(String text) {
		selectbyvalue("country",text);
	}
	public void entermobile(String text) {
		enterById("mobile",text);
	}
	public void enterpincode(String text) {
		enterById("pincode",text);
	}
	public void clickoncity() {
		clickById("city");
	}
	public void selectcity(String text) {
		selectbyvalue("city",text);
	}
	public void clickonstate() {
		clickById("state");
	}
	public void selectstate(String text) {
		selectbyvalue("state",text);
	}
	public void clickonpostoffice() {
		clickById("postOffice");
	}
	public void selectpostoffice(String text) {
		selectbyvalue("postOffice",text);
	}
	public void clickonNO() {
		scrollToTheElement("name", "sameAddresses");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickByName("sameAddresses");
	}
	public void enterflatnumber(String text) {
		enterById("flatNoOffice",text);
	}
	public void enterstreet1(String text) {
		enterById("streetOffice",text);
	}
	public void enterarea1(String text) {
		enterById("areaOffice",text);
	}
public void clickoncountry() {
	clickById("countryOffice");
}
public void selectcountry1(String text) {
	selectbyvalue("countryOffice",text);
}
public void entermobile1(String text) {
	enterById("mobileOffice",text);
}
public void enterpincode1(String text) {
	enterById("pincodeOffice",text);
}
public void clickoncity1() {
	clickById("cityOffice");
}
public void selectcity1(String text) {
	selectbyvalue("cityOffice",text);
}
public void clickonstate1() {
	clickById("stateOffice");
}
public void selectstate1(String text) {
	selectbyvalue("stateOffice",text);
}
public void clickonpostoffice1() {
	clickById("postOfficeOffice");
}
public void selectpostoffice1(String text) {
	selectbyvalue("postOfficeOffice",text);
}

}
