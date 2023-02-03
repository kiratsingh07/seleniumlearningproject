package pom.pages;

import wrappers.GenericWrappers;

public class IRCTCRegPage extends GenericWrappers{

	
	
	public void enterUserName(String userName) {
		enterById("userName", userName);
	}
	
	public void enterPassword(String pwd) {
		enterById("usrPwd", pwd);
	}
	
	public void enterCnfPassword(String cnfPwd) {
		enterById("cnfUsrPwd", cnfPwd);
	}
	
	public void clickonPreferredLanguage() {
		clickByXpath("//*[@id=\"ui-tabpanel-0\"]/div/div[5]/p-dropdown/div");
	
	}
	public void clickonEnglish() {
		clickByXpath("//*[@id=\"ui-tabpanel-0\"]/div/div[5]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]/li");
		
	}
	public void clickonsecurityquestion() {
		clickByXpath("//*[@id=\"ui-tabpanel-0\"]/div/div[6]/p-dropdown/div/div[2]/span");
	}
	public void clickonquestion  ()  {
		clickByXpath("//*[@id=\"ui-tabpanel-3\"]/div/div[6]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[1]/li/span");
	}
	public void entersecurityanswer(String sanswer) {
		enterByXpath("//*[@id=\"ui-tabpanel-0\"]/div/div[7]/input",sanswer);
	}
	public void clickoncontinue() {
		clickByXpath("//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button");
		}

	public void enterfirstname(String firstName) {
		enterById("firstName",firstName);
	}
	public void entermiddlename ( String middlename) {
		enterById ("middleName",middlename);
	}
	public void enterlastname (String lastname) {
		enterById ("lastname",lastname);
		
	}
	public void clickonselectoccupation () {
		clickByXpath("//*[@id=\"ui-tabpanel-1\"]/div/div[5]/p-dropdown/div");
	}
	public void clickonpublic() {
		clickByXpath ("//*[@id=\"ui-tabpanel-1\"]/div/div[5]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[2]/li");
	}
	public void clickondateofbirth() {
		clickByXpath("//*[@id=\"ui-tabpanel-4\"]/div/div[6]/p-calendar/span/input");
	}
	public void clickonmonth() {
		clickByXpath("//*[@id=\"ui-tabpanel-4\"]/div/div[6]/p-calendar/span/div/div/div[1]/div/select[1]");
	}
	public void  selectmonth () {
		selectVisibileTextById("//*[@id=\\\"ui-tabpanel-4\\\"]/div/div[6]/p-calendar/span/div/div/div[1]/div/select[1]", "December");
	}
	
	public void clickonyear() {
		clickByXpath("//*[@id=\"ui-tabpanel-4\"]/div/div[6]/p-calendar/span/div/div/div[1]/div/select[2]");
		
		
	}
	public void selectyear() {
		selectVisibileTextById("//*[@id=\\\"ui-tabpanel-4\\\"]/div/div[6]/p-calendar/span/div/div/div[1]/div/select[2]","1993");
	}
	public void clickondate() {
		clickByXpath("//*[@id=\"ui-tabpanel-4\"]/div/div[6]/p-calendar/span/div/div/div[2]/table/tbody/tr[2]/td[1]/a");
	
	}
			
	public void clickonmale () {clickByXpath("//*[@id=\"ui-tabpanel-4\"]/div/div[9]/p-selectbutton/div/div[1]/span");
	
	}
	public void enteremail (String email) {
		enterById("email",email);
	}
	public void entermobile ( String mobile) {
		enterById("mobile", mobile);
	}
	public void clickonselectnationality () {
		clickByXpath("//*[@id=\"ui-tabpanel-4\"]/div/div[13]/select");
	}
	public void selectnationality() {
		selectVisibileTextById("//*[@id=\\\"ui-tabpanel-4\\\"]/div/div[13]/select","India");
	}
	public void clickoncontinue1() {
		clickByXpath("//*[@id=\"divMain\"]/div/app-user-registration/div/div/form/div/div[2]/div[2]/div[2]/button");
	}
	public void enterflatnumber( String flatno) {
		enterByXpath("//*[@id=\"resAddress1\"]",flatno);
	}
	public void enterstreet(String street) {
		enterByXpath("//*[@id=\"resAddress2\"]",street);
	}
	public void enterarea ( String area) {
		enterByXpath("//*[@id=\"resAddress3\"]",area);
	}
	public void enterpincode ( String pincode) {
		enterByXpath("//*[@id=\"ui-tabpanel-2\"]/div/div[4]/input",pincode);
	}
	public void enterstate ( String state) {
		enterById("resState",state);
	}
	public void clickoncity ( String city) {
		clickByXpath("//*[@id=\"ui-tabpanel-8\"]/div/div[6]/select");
	}
	public void selectcity() {
	selectVisibileTextById("//*[@id=\\\"ui-tabpanel-8\\\"]/div/div[6]/select","Kolkata");
	}
	public void clickonselectpostoffice() {
		clickByXpath("//*[@id=\"ui-tabpanel-2\"]/div/div[7]/select");
		
	}
	public void selectpostoffice() {
		selectVisibileTextById("/*[@id=\\\"ui-tabpanel-2\\\"]/div/div[7]/select","A.J.C.Bose Road S.O");
		
	}
	public void enterphonenumber(String phone) {
		enterById("resPhone",phone);
		
		
	}
	public void clickonno() {
		clickByXpath("//*[@id=\"no\"]/div/div[2]/span");
		
	}
	public void enterofficenumber( String officeno) {
		enterByXpath("//*[@id=\"offAddress1\"]",officeno);
		
	}
	public void enterofficestreet( String officestreet) {
		enterByXpath("//*[@id=\"offAddress2\"]",officestreet);
	}
	public void enterofficearea ( String officearea) {
		enterByXpath("//*[@id=\"offAddress3\"]",officearea);
	}
	public void clickonselectcountry() {
		clickByXpath("//*[@id=\"ui-tabpanel-2\"]/div/div[10]/div[4]/p-dropdown/div");
	}
	public void clickonindia() {
		clickByXpath("//*[@id=\"ui-tabpanel-2\"]/div/div[10]/div[4]/p-dropdown/div/div[4]/div/ul/p-dropdownitem[105]/li");
		
	}
	public void enterofficepin( String officepin) {
		enterById ("offPinCode",officepin);
	}
	public void enterofficestate( String officestate) {
		enterById("offState",officestate);
		
	}
	public void clickonofficeselectcity() {
		clickByXpath("//*[@id=\"ui-tabpanel-2\"]/div/div[10]/div[7]/select");
	}
	public void selectofficecity() {
		selectbyvalue("//*[@id=\\\"ui-tabpanel-2\\\"]/div/div[10]/div[7]/select","Kolkata");
		
	}
	public void clickonpostoffice() {
		clickByXpath("//*[@id=\"ui-tabpanel-2\"]/div/div[7]/select");
		
	}
	public void selectofficepostoffice() {
		selectVisibileTextById("//*[@id=\\\"ui-tabpanel-2\\\"]/div/div[7]/select","A.J.C.Bose Road S.O");
	}
		
		public void enterphone( String phone) {
			enterById("offPhone",phone);
			
	}
		public void clickonterms() {
			clickByXpath("//*[@id=\"ui-tabpanel-2\"]/div/div[13]/span[1]/input");
		}
	
		
	}
	
		
	

