import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcases {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		WebElement holidays = driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/a");
		act.moveToElement(holidays).perform();
		WebElement stays = driver.findElementByXPath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[7]/ul/li[3]/a/span[1]");
		act.moveToElement(stays).perform();
		Thread.sleep(3000);
		driver.findElementByXPath("//span[text()='Lounge']").click();
		Set<String>Winids2= driver.getWindowHandles();
		for( String id2: Winids2) {
			driver.switchTo().window(id2);}
		Thread.sleep(5000);
		WebElement stationel= driver.findElementByName("city");
		Select selstation= new Select(stationel);
		selstation.selectByValue("BSB");
		Thread.sleep(3000);	
		WebElement loungesel = driver.findElementByName("laungecity");
		Select sellounge = new Select(loungesel);
		sellounge.selectByVisibleText("IRCTC Executive Lounge Varanasi");
		WebElement personel = driver.findElementByName("selPassangers");
		Select selperson= new Select(personel);
		selperson.selectByValue("3");
		driver.findElementByName("acservicecheckindate").click();
		driver.findElementByXPath("/html/body/app-root/accommodation/div[2]/div[2]/div/form/div[4]/div/div/table/tbody/tr[5]/td[4]/span").click();
		Thread.sleep(3000);
		WebElement checkintimeel= driver.findElementByName("checkInTime");
		Select selcheckintime= new Select(checkintimeel);
		selcheckintime.selectByValue("08:00");
		WebElement durationel=driver.findElementByName("checkOutTime");
		Select selduration = new Select(durationel);
		selduration.selectByValue("06:00");
		Thread.sleep(3000);
		driver.findElementByXPath("/html/body/app-root/accommodation/div[2]/div[2]/div/form/div[11]/button[2]").click();
		Thread.sleep(5000);
		driver.findElementById("profile-tab").click();
		Thread.sleep(3000);
		driver.findElementByName("email").sendKeys("selenium@gmail.com");
		driver.findElementByName("mobileNo").sendKeys("7783842303");
		Thread.sleep(3000);
		driver.findElementByXPath("//*[@id=\"profile\"]/div/form/div[3]/button").click();
		Thread.sleep(5000);
		driver.findElementByXPath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[1]/td[2]/input").sendKeys("kirat");
		driver.findElementByXPath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[1]/td[3]/input").sendKeys("27");
		WebElement genderel =driver.findElementByXPath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[1]/td[4]/select");
		Select selgender = new Select(genderel);
		selgender.selectByValue("Male");
		driver.findElementByXPath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[2]/td[2]/input").sendKeys("harry");
		driver.findElementByXPath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[2]/td[3]/input").sendKeys("24");
		WebElement gender1el=driver.findElementByXPath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[2]/td[4]/select");
		Select selgender1 =new Select(gender1el);
		selgender1.selectByValue("Male");
		driver.findElementByXPath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[3]/td[2]/input").sendKeys("harshu");
		driver.findElementByXPath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[3]/td[3]/input").sendKeys("25");
		WebElement genderel2 =driver.findElementByXPath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[1]/div/table/tbody/tr[3]/td[4]/select");
		Select selgender2 =new Select(genderel2);
		selgender2.selectByValue("Male");
		WebElement stateel= driver.findElementByName("state");
		Select selstate = new  Select(stateel);
		selstate.selectByValue("WEST BENGAL");
		Thread.sleep(3000);
		driver.findElementByXPath("/html/body/app-root/acpassangers/div/form/div/div/div/div/div[4]/button[2]").click();
		Thread.sleep(5000);
		String text =driver.findElementByXPath("/html/body/app-root/acsummery/div/div[2]/div/div/div/div[3]/div[1]/div[3]/span").getText();
		System.out.println(text);
		driver.findElementByXPath("/html/body/app-root/acsummery/div/div[2]/div/div/div/div[3]/div[1]/div[5]/div/label/span").click();
		driver.findElementByXPath("/html/body/app-root/acsummery/div/div[2]/div/div/div/div[3]/div[2]/button").click();
		Thread.sleep(5000);
		
	
		
		
		
		
		
		
		
			
		}
		
		

	}


