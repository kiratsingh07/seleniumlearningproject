package wrappers;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.CommonReporter;

public class GenericWrappers extends CommonReporter implements Wrappers{
	
	
	public static ChromeDriver driver;
	
	public void logStatus(String status, String desc) {
		long number = takeSnap();
		if(status.equalsIgnoreCase("pass")){
		test.log(LogStatus.PASS, desc+test.addScreenCapture("./../images/image"+number+".jpg"));	
		}else if(status.equalsIgnoreCase("fail")) {
			test.log(LogStatus.FAIL, desc+test.addScreenCapture("./../images/image"+number+".jpg"));	
		}
	}

	@Override
	public void invokeApp(String browser, String url) {
		// TODO Auto-generated method stub
		
		try {
			if(browser.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.get(url);
				driver.manage().window().maximize();
				System.out.println("Browser Launched Successfully and loaded url as - "+url);
				logStatus("pass", "Browser Launched Successfully and loaded url as - "+url);
			}
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("Browser was unable to launch due to unknown error");
			logStatus("fail", "");
		}
		
	}

	public void enterById(String idValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementById(idValue).sendKeys(data);
			logStatus("pass", "");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			logStatus("fail", "Unable to Enter the Text due to locator is not identified ");
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			logStatus("fail","unable to enter the text due to locator is not visible");
		}catch(ElementNotInteractableException e) {
		logStatus("fail","unable to enter the text due to locator not interactable");	
		}catch(StaleElementReferenceException e) {
		System.err.println("unable to enter the text due to the locator being stale");	
		}catch (WebDriverException e) {
			logStatus("fail","unable to enter text due to a different webdriver");
			// TODO: handle exception
		}
	}

	@Override
	public void enterByName(String nameValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByName(nameValue).sendKeys(data);
			logStatus("pass","");
		} catch (NoSuchElementException e) {
			logStatus("fail","unable to enter the text due to locator is not identified");
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ElementNotVisibleException e) {
			logStatus("fail","unable to enter the text due to locator not visible");
			// TODO: handle exception
	} catch (ElementNotInteractableException e) {
		logStatus("fail","unable to enter the text due to locator not interacatble");
		// TODO: handle exception
	} catch (StaleElementReferenceException e) {
		logStatus("fail","unable to enter the text due to locator bring stale");
		// TODO: handle exception
	}catch (WebDriverException e) {
		logStatus("fail", "unable to enter the text due to different driver");
		// TODO: handle exception
	}
	}

	@Override
	public void enterByXpath(String xpathValue, String data) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathValue).sendKeys(data);
			logStatus("pass","");
		} catch (NoSuchElementException e) {
			logStatus("fail","unable to enter the text due to locator is not identified");
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ElementNotVisibleException e) {
			logStatus("fail","unable to enter the text due to locator is not visible");
			
			// TODO: handle exception
		} catch (ElementNotInteractableException e) {
		logStatus("fail","unable to enter the text due to locator not interactable");
		
			// TODO: handle exception
		}catch (StaleElementReferenceException e) {
			logStatus("fail","unable to enter the text due to locator being stale");
			// TODO: handle exception
		}catch (WebDriverException e) {
			logStatus("fail","unable to enter the text due to different driver");
			// TODO: handle exception
		}
	}

	@Override
	public void verifyTitle(String title) {
		// TODO Auto-generated method stub
		try {
			String acttitle = driver.getTitle();
			if (acttitle.equals(title)) {
				logStatus("pass",acttitle+" is matched with"+title);
			}else {
				logStatus("fail",acttitle + "is not matched with"+title);
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			logStatus("fail","unable to get title since the locator is not identified");
			e.printStackTrace();
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			logStatus("fail","unable to get tiitle since the locator is not visible");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			logStatus("fail","unable to get title since the locator is not interactable");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			logStatus("fail","unable to get title since the locator is stale");
		}catch (WebDriverException e) {
			// TODO: handle exception
			logStatus("fail","unable to get title since the driver is disconnected");
		}
		
	}

	@Override
	public void verifyTextById(String id, String text) {
		// TODO Auto-generated method stub
		try {
			String actText = driver.findElementById(id).getText();
			if(actText.equals(text)) {
				logStatus("pass",actText+" is matched with "+text);
			}else {
				logStatus("fail",actText+" is not matched with "+text);
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			logStatus("fail","unable to verify text since the locator is not identified");
			e.printStackTrace();
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			logStatus("fail","unable to verify text since the locator is not visible");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			logStatus("fail","unable to verify text since the locator is not interactable");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			logStatus("fail","unable to verify text since the locator is stale");
		}catch (WebDriverException e) {
			// TODO: handle exception
			logStatus("fail","unable to verify text since driver is disconnected");
		}
	}

	@Override
	public void verifyTextByXpath(String xpath, String text) {
		try {
			String acttext1=driver.findElementByXPath(xpath).getText();
			if( acttext1.equals(text)) {
				logStatus("pass",acttext1+"is matched"+text);
			}else {
				logStatus("fail",acttext1+" is not matched"+text);
			}
			// TODO Auto-generated method stub
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			logStatus("fail","unable to verify text since the locator is not identified");
			e.printStackTrace();
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			logStatus("fail","unable to verify text since the locator is not visible");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			logStatus("fail","unable to verify text since the locator is not interactable");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			logStatus("fail","unable to verify text since the locator is stale  ");
		}catch (WebDriverException e) {
			// TODO: handle exception
			logStatus("fail","unable to verify text since the locator is disconnected");
		}
		
	}

	@Override
	public void verifyTextContainsByXpath(String xpath, String text) {
		// TODO Auto-generated method stub
		try {
			String acttext2 = driver.findElementByXPath(xpath).getText();
			if (acttext2.contains(text)) {
				logStatus("pass",acttext2+" contains"+ text);
			}else { logStatus("fail",acttext2+ " doesnt contain"+text);
			}
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			logStatus("fail","unable to verify text since the locator is not identified" );
			e.printStackTrace();
		}catch (ElementNotVisibleException e) {
			logStatus("fail","unable to verify text since the locator is not visible");
		
			// TODO: handle exception
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			logStatus("fail","unable to verify text since the locator is not stale");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
			logStatus("fail","unable to verify text since the locator is not interactable ");
		}catch (WebDriverException e) {
			// TODO: handle exception
		logStatus("fail","unable to verify text since the locator is not distanced");
		}
	}
	public void verifytextbyName(String name , String text) {
		 try {
			String acttext = driver.findElementByName(name).getText();
			 if(acttext.equals(text)) {
				 logStatus("pass",acttext+ "is matched"+ text);
			 }else { logStatus("fail",acttext+"is not matched" +text);
			 
			 }
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			logStatus("fail","unable to verify text since the locator is not identified");
			e.printStackTrace();
		}catch (ElementNotVisibleException e) {
			logStatus("fail","unable to verify text since the locator not visible");
			
			// TODO: handle exception
		}catch (ElementNotInteractableException e) {
			logStatus("fail","unable to verify since the locator is not interctable");
			
			// TODO: handle exception
		}catch (StaleElementReferenceException e) {
			logStatus("fail","unable to verify since the locator is stale");
			// TODO: handle exception
		}catch(WebDriverException e) {
		 logStatus("fail", "unable to enter the text due to different driver");
		}
		 
	}
		
	

	@Override
	public void clickById(String id) {
		// TODO Auto-generated method stub
		
		 try {
			driver.findElementById(id).click();
			logStatus("pass","");
		} catch (NoSuchElementException e) {
			logStatus("fail","unaable to get text since the locator is not identified");
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ElementNotVisibleException e) {
			logStatus("fail","unable to get text since the locator is not visible");
			// TODO: handle exception
		} catch (StaleElementReferenceException e) {
			logStatus("fail","unable to get text since the locator is stale");
			
			// TODO: handle exception
		}catch (ElementNotInteractableException e) {
			logStatus("fail","unable to get text since the locator is not interactable");
			// TODO: handle exception
		}catch(WebDriverException e) {
			 logStatus("fail", "unable to enter the text due to different driver");
			}
	}

	@Override
	public void clickByClassName(String classVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByClassName(classVal).click();
			logStatus("pass","");
		} catch (NoSuchElementException e) {
			logStatus("fail","unable to get text since the locator is not identified");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ElementNotVisibleException e) {
			logStatus("fail","unable to get text since the locator is not visible");
		
			// TODO: handle exception
		}catch (ElementNotInteractableException e) {
			logStatus("fail","unable to get text since the locator is not interctable");
			// TODO: handle exception
		}catch (StaleElementReferenceException e) {
			logStatus("fail","unable to get text since the locator is stale");
			// TODO: handle exception
		}catch(WebDriverException e) {
			 logStatus("fail", "unable to enter the text due to different driver");
			}
		
		
	}

	@Override
	public void clickByName(String name) {
		// TODO Auto-generated method stub
		try {
			 driver.findElementByName(name).click();
			 logStatus("pass","");
		} catch (NoSuchElementException e) {
			logStatus("fail","unable to click since the locator is not identifed");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ElementNotVisibleException e) {
			logStatus("fail","unable to click since the locator not visible");
			// TODO: handle exception
		}catch (ElementNotInteractableException e) {
			logStatus("fail","unable to click since locator not interactable");
			// TODO: handle exception
		}	catch (StaleElementReferenceException e) {
			logStatus("fail","unable to click since locator is stale");
			// TODO: handle exception
		} catch (WebDriverException e) {
			logStatus("fail","unable to click since locator is distanced");
			// TODO: handle exception
		}
	}

	@Override
	public void clickByLink(String name) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByLinkText(name).click();
			logStatus("pass","");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			logStatus("fail","unable to click since the locator is not identified");
			e.printStackTrace();
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			logStatus("fail","unable to click since the locator is not visible ");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			logStatus("fail","unable to click since the locator is not stale");
		}catch (ElementNotInteractableException e) {
			logStatus("fail","unable to click since the locator is not interacatable ");
			// TODO: handle exception
		}catch (WebDriverException e) {
			logStatus("fail","unable to click since the locator is distanced");
			// TODO: handle exception
		}
		
	}

	@Override
	public void clickByLinkNoSnap(String name) {
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			 driver.findElementByXPath(xpathVal).click();
			 logStatus("pass","");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			logStatus("fail","unable to click since teh locator is not identified");
			e.printStackTrace();
		}catch (ElementNotVisibleException e) {
			// TODO: handle exception
			logStatus("fail","unable to click since the locator is not visible");
		}catch (ElementNotInteractableException e) {
			// TODO: handle exception
		logStatus("fail","unable to click since the locator is not interactable");
		}catch (StaleElementReferenceException e) {
			// TODO: handle exception
			logStatus("fail","unable to click since the locator is stale");
		}catch (WebDriverException e) {
			logStatus("fail","unable to click since the driver is distanced");
			// TODO: handle exception
		}
	}

	@Override
	public void clickByXpathNoSnap(String xpathVal) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getTextById(String idVal) {
		// TODO Auto-generated method stub
		try {
			String text = driver.findElementById(idVal).getText();
			logStatus("pass","");
		} catch (NoSuchElementException e) {
			logStatus("fail","unable to get text since the locator is not identiufied");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ElementNotVisibleException e) {
			logStatus("fail","unable to get text since the locator is not visible");
			// TODO: handle exception
		}catch (ElementNotInteractableException e) {
			logStatus("fail","unable to get text since the locator is not interacatable");
			// TODO: handle exception
		}catch (StaleElementReferenceException e) {
			logStatus("fail","unable to get text since the locator is stale");
			// TODO: handle exception
		}catch (WebDriverException e) {
			logStatus("fail","unable to get text since the driver was unable to locate");
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public String getTextByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			String text1 = driver.findElementByXPath(xpathVal).getText();
			logStatus("pass","");
		} catch (NoSuchElementException e) {
			logStatus("fail","unable to get text since the locator is not identified");
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ElementNotVisibleException e) {
			logStatus("fail","unable to get text since the locator is not visible");
			// TODO: handle exception
		}catch (StaleElementReferenceException e) {
			logStatus("fail","unable to get text since the locator is stale");
			
			// TODO: handle exception
		}catch (ElementNotInteractableException e) {
			logStatus("fail","unable to get text since the locator is not interctable");
			
			// TODO: handle exception
		}catch(WebDriverException e) {
			 logStatus("fail", "unable to enter the text due to different driver");
			}
		return null;
	}
	@Override
	public void selectVisibileTextById(String id, String value) {
		// TODO Auto-generated method stub
		WebElement idel = driver.findElementById(id);
		Select selid = new Select(idel);
		try {
			selid.selectByVisibleText(value);
			logStatus("pass","");
		} catch (ElementNotSelectableException e) {
			logStatus("fail","unable to get text because  the locator is not selectable");
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchElementException e) {
			logStatus("fail","unable to get text because the locator is not identified");
			// TODO: handle exception
		} catch (ElementNotVisibleException e) {
			logStatus("fail","unable to get text because the locator is not visible");
			
			// TODO: handle exception
		}catch (ElementNotInteractableException  e) {
			logStatus("fail","unable to get text because the locator is not interatable");
			
			// TODO: handle exception
		} catch (StaleElementReferenceException e) {
			logStatus("fail","unable to get text because the locator is stale");
			// TODO: handle exception
		}catch(WebDriverException e) {
			 logStatus("fail", "unable to enter the text due to different driver");
			}
	}public void selectbyvalue(String id,String value) {
		try {
			WebElement idel = driver.findElementById(id);
			Select selid = new Select (idel);
			selid.selectByValue(value);
			logStatus("pass","");
		} catch (NoSuchElementException e) {
			logStatus("fail","unable to get text because the locator is not identified");
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}catch (ElementNotSelectableException e) {
			logStatus("fail","unable to get text because the locator is not selectable");
			// TODO: handle exception
		}catch (ElementNotVisibleException e) {
			logStatus("fail","unable to get text because the locator is not visible");
			// TODO: handle exception
		}catch (StaleElementReferenceException e) {
			logStatus("fail","unable to get text because the locator is stale");
			
			// TODO: handle exception
		}catch (ElementNotInteractableException e) {
			logStatus("fail","unable to get text because the locator is not interactable");
			// TODO: handle exception
		}catch(WebDriverException e) {
			 logStatus("fail", "unable to enter the text due to different driver");
			}
	}
	
	public void scrollToTheElement(String type, String loc) {
		WebElement ele = null;
		if(type.equalsIgnoreCase("id")) {
			ele = driver.findElementById(loc);
		}else if(type.equalsIgnoreCase("name")) {
			ele = driver.findElementByName(loc);
		}else if(type.equalsIgnoreCase("xpath")) {
			ele = driver.findElementByXPath(loc);
		}
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", ele);
		
	}
	
	public void selectvaluebyname(String name, String value) {
		try {
			WebElement idel = driver.findElementByName(name);
			Select selid = new Select (idel);
			selid.selectByValue(value);
			logStatus("pass","");
		} catch (NoSuchElementException e) {
			logStatus("fail","unable to get text because the locator is not identified");
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}catch (ElementNotSelectableException e) {
			logStatus("fail","unable to get text because the locator is not selectable");
			// TODO: handle exception
		}catch (ElementNotVisibleException e) {
			logStatus("fail","unable to get text because the locator is not visible");
			// TODO: handle exception
		}catch (StaleElementReferenceException e) {
			logStatus("fail","unable to get text because the locator is stale");
			
			// TODO: handle exception
		}catch (ElementNotInteractableException e) {
			logStatus("fail","unable to get text because the locator is not interactable");
			// TODO: handle exception
		}catch(WebDriverException e) {
			 logStatus("fail", "unable to enter the text due to different driver");
			}
	}
	public void selectvaluebyxpath(String xpath,String value) {
		try {
			WebElement idel = driver.findElementByXPath(xpath);
			Select selid = new Select (idel);
			selid.selectByValue(value);
			logStatus("pass","");
		} catch (NoSuchElementException e) {
			logStatus("fail","unable to get text because the locator is not identified");
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}catch (ElementNotSelectableException e) {
			logStatus("fail","unable to get text because the locator is not selectable");
			// TODO: handle exception
		}catch (ElementNotVisibleException e) {
			logStatus("fail","unable to get text because the locator is not visible");
			// TODO: handle exception
		}catch (StaleElementReferenceException e) {
			logStatus("fail","unable to get text because the locator is stale");
			
			// TODO: handle exception
		}catch (ElementNotInteractableException e) {
			logStatus("fail","unable to get text because the locator is not interactable");
			// TODO: handle exception
		}catch(WebDriverException e) {
			 logStatus("fail", "unable to enter the text due to different driver");
			}
		
	}

	@Override
	public void selectIndexById(String id, int value) {
		// TODO Auto-generated method stub
	WebElement idel1 = driver.findElementById(id);
	Select selid1 = new Select(idel1);
	try {
		selid1.selectByIndex(value);
		logStatus("pass","");
	} catch (ElementNotSelectableException e) {
		logStatus("fail","unable to get text because the locator is not selectable");
		// TODO Auto-generated catch block
		e.printStackTrace();
	}catch (NoSuchElementException e) { 
		logStatus("fail","unable to get text because the locator is not identified");
		// TODO: handle exception
	} catch (ElementNotVisibleException e) {
		logStatus("fail","unable to get text because the locator is not visible");
		// TODO: handle exception
	} catch (ElementNotInteractableException e) {
		logStatus("fail","unable to get text because the locator is not interactable");
		// TODO: handle exception
	} catch (StaleElementReferenceException e) {
		logStatus("fail","unable to get text because the locator is stale");
		// TODO: handle exception
	}catch(WebDriverException e) {
		 logStatus("fail", "unable to enter the text due to different driver");
		}
	
	}
	
	
	
	
	

	@Override
	public void switchToParentWindow() {
		// TODO Auto-generated method stub
		
	Set<String> Windids= driver.getWindowHandles();
	try {
		for ( String Ids : Windids) {
			driver.switchTo().window(Ids);
		break;}
		logStatus("pass","");
		
	} catch (NoSuchWindowException e) {
		logStatus("fail","unable to get text because the locator is not identified");
		// TODO Auto-generated catch block
		e.printStackTrace();
	}catch (WebDriverException e) {
		logStatus("fail","unable to get text because the locator is not availaible");
		// TODO: handle exception
	}
	}
	
	
	

	@Override
	public void switchToLastWindow() {
		// TODO Auto-generated method stub
		Set<String> Windids= driver.getWindowHandles();
		try {
			for ( String Ids : Windids) {driver.switchTo().window(Ids);}
			logStatus("pass","window was succesfully switched");
		} catch (NoSuchWindowException e) {
			logStatus("fail","unable to click since the window is not identified");
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (WebDriverException e) {
			logStatus("fail","unable to click since the locator is not availaible");
			// TODO: handle exception
		}
	}

	@Override
	public void acceptAlert() {
		// TODO Auto-generated method stub
	
	try {
		driver.switchTo().alert().accept();
		logStatus("pass","");
	} catch (NoAlertPresentException e) {
		logStatus("fail","unable to get text since the locator is not availaible");
		// TODO Auto-generated catch block
		e.printStackTrace();}
		catch (WebDriverException e2) {
			logStatus("fail","unable to text since the locator is not identified");
			// TODO: handle exception
		}
	
	}

	@Override
	public void dismissAlert() {
		// TODO Auto-generated method stub
		
		try {
			driver.switchTo().alert().dismiss();
			logStatus("pass","");
		} catch (NoAlertPresentException e) {
			logStatus("fail","unable to get text since the locator is not present");
			// TODO Auto-generated catch block
			e.printStackTrace();}
			catch (WebDriverException e2) {
				logStatus("fail","unable to get text since the locator is not identified");
				// TODO: handle exception
			}
		
	}

	@Override
	public String getAlertText() {
		// TODO Auto-generated method stub
		try {
			driver.switchTo().alert().getText();
			logStatus("pass","");
		} catch (NoAlertPresentException e) {
			logStatus("fail","unable to click since there is no alert present");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public long takeSnap() {
		// TODO Auto-generated method stub
		long number = System.currentTimeMillis();
		try {
			File pic =  driver.getScreenshotAs(OutputType.FILE);
			File dest = new File("./images/image"+number+".jpg");
			FileUtils.copyFile(pic, dest);
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return number;
	}

	@Override
	public void closeBrowser() {
		// TODO Auto-generated method stub
		driver.close();
	}

	@Override
	public void closeAllBrowsers() {
		// TODO Auto-generated method stub
		driver.quit();
	}

	@Override
	public void clickByLinkText(String linkText) {
		try {
			driver.findElementByLinkText(linkText).click();
			logStatus("pass","");
		} catch (NoSuchElementException e) {
			logStatus("fail","unable to click since the locator is not identified");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ElementNotVisibleException e) {
			logStatus("fail","unable to click since the locator is not visible");
			// TODO: handle exception
		}catch (ElementNotInteractableException e) {
			logStatus("fail","unable to click since the locator is not interacatble");
			// TODO: handle exception
		}catch (StaleElementReferenceException e) {
		
			logStatus("fail","unable to click since locator is stale");
			// TODO: handle exception
		}catch (WebDriverException e) {
			logStatus("fail","unable to click since locator is disconnected");
			// TODO: handle exception
		}
		// TODO Auto-generated method stub
	
	
	}
	
	public void mouseHoverByXpath(String xpathValue)  {
		
			try {
				Actions act = new Actions(driver);
				WebElement hover = driver.findElementByXPath(xpathValue);
				act.moveToElement(hover).perform();
			} catch (NoSuchElementException e) {
				logStatus("fail","unable to click since locator is not identified");
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch (ElementNotVisibleException e) {
				logStatus("fail", "unable to click since locator is not visible ");
				// TODO: handle exception
			}catch (ElementNotSelectableException e) {
				logStatus("fail", "unable to click since locator is not selectable");
				// TODO: handle exception
			}catch (StaleElementReferenceException e) {
				logStatus("fail", "unable to click since locator is stale");
				// TODO: handle exception
			}catch (WebDriverException e) {
				logStatus("fail", "unable to click since locator is not present");
				// TODO: handle exception
			}
			
		}

	
			
		
	
	
	
public void selectvisiblebytext(String Id, int value) {
	
	
		try {
			WebElement idel= driver.findElementById(Id);
			Select selid = new Select(idel);
			selid.selectByVisibleText(Id);
			logStatus("pass","");
		} catch (NoSuchElementException e) {
			logStatus("fail", "unable to click since locator is not identified ");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ElementNotVisibleException e) {
			logStatus("fail","unable to click since locator is not visible ");
			// TODO: handle exception
		}catch (StaleElementReferenceException e) {
			logStatus("fail","unable to click since locator is stale");
			// TODO: handle exception
		}catch (WebDriverException e) {
			logStatus("fail", "unable to click since locator is not present");
			// TODO: handle exception
		}
	

}
}
