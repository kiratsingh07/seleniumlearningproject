import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcases3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.irctc.co.in/nget/train-search");
driver.manage().window().maximize();
Actions act = new Actions(driver);
WebElement holidays = driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/a");
act.moveToElement(holidays).perform();
WebElement stays = driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]");
act.moveToElement(stays).perform();
Thread.sleep(3000);
driver.findElementByXPath("//span[text()='Lounge']").click();
Set<String> windsid2 =driver.getWindowHandles();
for ( String id2: windsid2) {driver.switchTo().window(id2);}
Thread.sleep(5000);
WebElement stationel= driver.findElementByName("city");
Select selstation = new Select(stationel);
selstation.selectByValue("SDAH");
Thread.sleep(3000);
WebElement loungeel = driver.findElementByName("laungecity");
Select sellounge = new Select(loungeel);
sellounge.selectByVisibleText("IRCTC Executive Lounge");
WebElement personel = driver.findElementByName("selPassangers");
Select selperson = new Select(personel);
selperson.selectByValue("2");
driver.findElementByName("acservicecheckindate").click();
driver.findElementByXPath("/html/body/app-root/accommodation/div[2]/div[2]/div/form/div[4]/div/div/table/tbody/tr[4]/td[1]/span").click();
WebElement checkel =driver.findElementByName("checkInTime");
Select selcheck = new Select(checkel);
selcheck.selectByValue("02:00");
WebElement durationel = driver.findElementByName("checkOutTime");
Select selduration = new Select(durationel);
selduration.selectByValue("02:00");
Thread.sleep(3000);
driver.findElementByXPath("/html/body/app-root/accommodation/div[2]/div[2]/div/form/div[11]/button[2]").click();
Thread.sleep(3000);
driver.findElementById("profile-tab").click();
Thread.sleep(3000);
driver.findElementByName("email").sendKeys("selenium@gmail.com");
driver.findElementByName("mobileNo").sendKeys("7783842303");
driver.findElementByXPath("//*[@id=\"profile\"]/div/form/div[3]/button").click();
Thread.sleep(5000);
driver.findElementByXPath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[1]/td[2]/input").sendKeys("harry");
driver.findElementByXPath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[1]/td[3]/input").sendKeys("24");
WebElement genderel= driver.findElementByXPath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[1]/td[4]/select");
Select selgender = new Select(genderel);
selgender.selectByValue("Male");
driver.findElementByXPath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[2]/td[2]/input").sendKeys("kirat");
driver.findElementByXPath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[2]/td[3]/input").sendKeys("27");
WebElement genderel1 =driver.findElementByXPath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[2]/td[4]/select");
Select selgender1 = new Select(genderel1);
selgender1.selectByValue("Male");
WebElement gstel = driver.findElementByName("gstGet");
Select selgst= new Select(gstel);
selgst.selectByValue("Yes");
Thread.sleep(3000);
driver.findElementByName("gstNo").sendKeys("12345");
WebElement stateel = driver.findElementByName("state");
Select selstate = new Select(stateel);
selstate.selectByValue("WEST BENGAL");
driver.findElementByXPath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[4]/button[2]").click();
Thread.sleep(5000);







}








	}


