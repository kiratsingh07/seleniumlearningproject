import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mouse_Actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement holidays = driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/a");

		
		// to perform mouse hover
		act.moveToElement(holidays).perform();
		
		// to perform double click
		act.doubleClick(holidays).perform();
		
		// to perform right click
		act.contextClick(holidays).perform();
		
		
		// for drag and drop
		act.dragAndDrop(holidays, holidays).perform();
		
	}

}
