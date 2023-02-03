import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frameshomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://chercher.tech/practice/frames");
driver.switchTo().frame("iamframe");
driver.switchTo().frame("frame3");
driver.findElementById("a").click();
driver.switchTo().parentFrame();
driver.findElementByXPath("/html/body/input").sendKeys("selenium");
driver.switchTo().defaultContent();

driver.switchTo().frame("frame2");
WebElement animalel= driver.findElementById("animals");
Select selanimal = new Select (animalel);
selanimal.selectByValue("babycat");



	}

}
