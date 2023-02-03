package pom.pages;

import wrappers.GenericWrappers;

public class IRCTCHomePage extends GenericWrappers{
	
	
	public void clickOnRegister() {
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[1]/a[2]");
	}	
	
	public void mouseHoverOnHolidays() {
		mouseHoverByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/a");
		
		
	}
	
	public void mouseHoverOnStays() {
		mouseHoverByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]/a/span[1]");
		
		
	}
	
	public void clickOnLounge() {
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]/ul/li[2]/a/span");
		
		
		
		switchToLastWindow();
		
	}
	public void mouseHoverontrains() {
		mouseHoverByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[3]/a/span/strong");
	}
	public void clickonftr() {
		clickByXpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[3]/ul/li[9]/a/span");
	}
	public void switchToftrpage(){
	switchToLastWindow();
	}
	

}
