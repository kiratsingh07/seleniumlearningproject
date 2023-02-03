import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HOmework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	driver.manage().window().maximize();
	Actions act = new Actions(driver);
	WebElement rightclick = driver.findElementByXPath("//*[@id=\"authentication\"]/span");
	act.contextClick(rightclick).perform();
	driver.findElementByXPath("//*[@id=\"authentication\"]/ul/li[1]").click();
	
	String text = driver.switchTo().alert().getText();
	System.out.println(text);
	driver.switchTo().alert().accept();
	
	WebElement right = driver.findElementByXPath("//*[@id=\"authentication\"]/span");
	act.contextClick(right).perform();
	driver.findElementByXPath("//*[@id=\"authentication\"]/ul/li[2]/span").click();
	String message = driver.switchTo().alert().getText();
	System.out.println(message);
	driver.switchTo().alert().accept();
	
	WebElement me =driver.findElementByXPath("//*[@id=\"authentication\"]/span");
	act.contextClick(me).perform();
	driver.findElementByXPath("//*[@id=\"authentication\"]/ul/li[3]/span").click();
	String note = driver.switchTo().alert().getText();
	System.out.println(note);
	driver.switchTo().alert().accept();
	
	WebElement Double = driver.findElementByXPath("//*[@id=\"authentication\"]/button");
    act.doubleClick(Double).perform();
    String term = driver.switchTo().alert().getText();
    System.out.println(term);
    driver.switchTo().alert().accept();
	
			
			
	

	

	}

}
