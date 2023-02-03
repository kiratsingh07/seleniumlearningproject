import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sel_Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// to launch chrome driver
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		// to maximize 
		driver.manage().window().maximize();
		
		// to load url
		driver.get("https://facebook.com");

		
		driver.findElementById("email").sendKeys("selenium@gmail.com");
		
		
			driver.findElementById("pass").sendKeys("SeleniumJava");
			
			driver.findElementByName("login").click();
		
	}

}
