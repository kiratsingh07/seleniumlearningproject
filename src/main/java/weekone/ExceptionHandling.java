package weekone;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		try {
			driver.findElementById("Guru").click();
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			System.err.println("The Element Locator Might Have CHanged so unable to find and click");
		}
		driver.findElementById("singh").click();
	
		
		
	}

	// Selenium Exceptions are Below
	// 1. NoSuchElementEception - TextBoxes, Buttons, DropDownes, Frames, CheckBoes
	// 2. NoSuchrameException - Frames
	// 3. NoSuchWIndowException - Windows
	// 4. NoAlertPresentException - Alerts
	// 5. ELementNotVisibleException - TextBoxes, Buttons, DropDownes, Frames, CheckBoes
	// 6. ElementNotInteractableException- TextBoxes, Buttons, DropDownes, Frames, CheckBoes
	// 7. ElementClickInterceptiedException - Buttons and CheckBoxes
	// 8. ElementNotSelectableException - Dopdowns
	// 9. StaleElementReferenceException - TextBoxes, Buttons, DropDownes, Frames, CheckBoes
	// 10. WebDriverException - TextBoxes, Buttons, DropDownes, Frames, CheckBoes, Frames, Alerts and Windows
	
	
	
	
}
