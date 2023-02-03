import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowshomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
driver.findElementById("tryhome").click();
Set<String> Winids2= driver.getWindowHandles();
for( String Id2 : Winids2) {
	driver.switchTo().window(Id2);}
	driver.findElementByXPath("//*[@id=\"main\"]/div[4]/div/div[1]/a[3]").click();
	
	
	
	

	
	
}


	



	}

