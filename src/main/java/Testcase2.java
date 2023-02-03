import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		WebElement holidays = driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/a");
	act.moveToElement(holidays).perform();
WebElement STAYS = driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]");
act.moveToElement(STAYS).perform();
Thread.sleep(3000);
driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]/ul/li[2]/a/span").click();
Thread.sleep(5000);
Set<String> Winids2 = driver.getWindowHandles();
for (String id2:Winids2) {
	driver.switchTo().window(id2);}
	driver.findElementByXPath("//*[@id=\"sidebarCollapse\"]/i").click();
	driver.findElementByXPath("//*[@id=\"sidebar\"]/ul/li[13]/a").click();
	Thread.sleep(3000);
	driver.findElementById("enquiry-tab").click();
	Thread.sleep(3000);
	driver.findElementByName("name").sendKeys("kirat");
	driver.findElementByName("organization").sendKeys("abc");
	driver.findElementByName("address").sendKeys("236 street");
	driver.findElementByName("mobile").sendKeys("12345678");
	driver.findElementByName("email").sendKeys("selenium@gmail.com");
	WebElement requestel = driver.findElementByName("requestFor");
	Select selrequest = new Select(requestel);
	selrequest.selectByValue("Saloon Charter");
	driver.findElementByName("originStation").sendKeys("howrah");
	driver.findElementByName("destnStation").sendKeys("ludhiana");
	driver.findElementByName("checkInDate").click();
	driver.findElementByXPath("//*[@id=\"enquiry\"]/div/form/div/div[9]/div/div/table/tbody/tr[4]/td[1]/span").click();
	driver.findElementByName("checkOutDate").click();
	driver.findElementByXPath("//*[@id=\"enquiry\"]/div/form/div/div[10]/div/div/table/tbody/tr[5]/td[3]/span").click();
	driver.findElementByName("durationPeriod").sendKeys("10");
	driver.findElementByName("coachDetails").sendKeys("2");
	driver.findElementByName("numPassenger").sendKeys("2");
	driver.findElementByName("charterPurpose").sendKeys("family");
	driver.findElementByName("services").sendKeys("none");
	driver.findElementByXPath("//*[@id=\"enquiry\"]/div/form/div/div[17]/button").click();
	Thread.sleep(5000);
	
	
}

	

	}


