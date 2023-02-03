import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumhomework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.ftr.irctc.co.in/ftr/");
driver.findElementByXPath("//*[@id=\"planner\"]/table/tbody/tr[4]/td[2]/div/a[2]").click();
driver.findElementById("userId").sendKeys("selenium07");
driver.findElementById("password").sendKeys("Java9038");
driver.findElementById("cnfPassword").sendKeys("Java9038");
WebElement Securityel=  driver.findElementById("secQstn");
Select Selsecurity = new Select(Securityel);
Selsecurity.selectByValue("5");
driver.findElementById("secAnswer").sendKeys("singh");
driver.findElementById("dateOfBirth").sendKeys("05121993");
driver.findElementByName("gender").click();
driver.findElementByName("maritalStatus").click();
driver.findElementById("email").sendKeys("selenium@gmail.com");
WebElement occupationel =driver.findElementById("occupation");
Select Seloccupation= new Select(occupationel);
Seloccupation.selectByValue("Student");
driver.findElementById("fname").sendKeys("gurkirrat");
driver.findElementById("mname").sendKeys("singh");
driver.findElementById("lname").sendKeys("malhi");
driver.findElementById("natinality").click();
driver.findElementById("flatNo").sendKeys("2");
driver.findElementById("street").sendKeys("76");
driver.findElementById("area").sendKeys("surrey");
driver.findElementById("country").click();
driver.findElementById("mobile").sendKeys("123");
driver.findElementById("pincode").sendKeys("9038");


		






		

	
	}

}
