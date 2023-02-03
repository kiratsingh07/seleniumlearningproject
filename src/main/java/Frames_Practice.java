import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames_Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		
		Thread.sleep(5000);
		
		// using id or name
		//driver.switchTo().frame("iframeResult");
		
		// using any locator
		WebElement ele = driver.findElementByXPath("/html/body/div[4]/div[4]/div/div/iframe");
		driver.switchTo().frame(ele);
		
		//driver.switchTo().frame(3);
		
		driver.findElementByXPath("/html/body/button").click();
		
		driver.switchTo().alert().sendKeys("Guru Kirit");
		
		driver.switchTo().alert().accept();
		
		
		// to come out of all frames
		driver.switchTo().defaultContent();
		
		
		// will shift your focus to parent frame
		//driver.switchTo().parentFrame();
		
		driver.findElementById("tryhome").click();
		
		
		
		String winId = driver.getWindowHandle();
		System.out.println(winId);
		
		Set<String> winIds = driver.getWindowHandles();
		System.out.println(winIds);
		
		for(String id: winIds) {
			driver.switchTo().window(id);
			String title = driver.getTitle();
			System.out.println(title);
			
			String url = driver.getCurrentUrl();
			System.out.println(url);
		}
		
		
		driver.findElementByXPath("//*[@id=\"main\"]/div[2]/div/div[2]/div/a").click();
		
		
		Set<String> winIds2 = driver.getWindowHandles();
		
		for(String id2: winIds2) {
			driver.switchTo().window(id2);
		}
		
		driver.findElementByXPath("/html/body/div[2]/div/a[4]").click();
		
		

	}

}
