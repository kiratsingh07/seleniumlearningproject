import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumhomework {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://facebook.com");
driver.findElementByXPath("//*[text()='Create New Account']").click();
Thread.sleep(3000);
driver.findElementByName("firstname").sendKeys("gurkirrat");
driver.findElementByName("lastname").sendKeys("malhi");
driver.findElementByName("reg_email__").sendKeys("7783842303");
driver.findElementById("password_step_input").sendKeys("singh");

WebElement dateEle =   driver.findElementById("day");
Select selDate = new Select(dateEle);
selDate.selectByVisibleText("5");



WebElement monthEle = driver.findElementById("month");
Select selMonth = new Select(monthEle);
selMonth.selectByValue("1");

WebElement yearEle = driver.findElementById("year");
Select selYear = new Select(yearEle);
selYear.selectByIndex(26);





	}

}
