package genericUtilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class WebDriverUtility 
{
	/**
	 * This method will maximize browser window
	 * @param driver
	 */
public void maximizeBrowser(WebDriver driver)
{
	driver.manage().window().maximize();
}

/**
 * This method will wait for 10 sec for all the elements to load in GUI
 * @param driver
 */
public void implicitlyWait(WebDriver driver)
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}

/**
 * This method will handle dropdown using index
 * @param element
 * @param index
 */
public void handleDropdown(WebElement element, int index)
{
	Select s= new Select (element);
	s.selectByIndex(index);
}

/**
 * This method will handle dropdown using value
 * @param element
 * @param index
 */
public void handleDropdown(WebElement element, String value)
{
	Select s= new Select (element);
	s.selectByValue(value);
}

/**
 * This method will handle dropdown using visible text
 * @param element
 * @param index
 */
public void handleDropdown(String text, WebElement element)
{
	Select s= new Select (element);
	s.selectByVisibleText(text);
}
/**
 * This method will captuew screenshot and return to caller
 * @return 
 * @throws IOException 
 */
public String captureScreenshot(WebDriver driver, String screenshotName) throws IOException
{
	TakesScreenshot ts=(TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File destination= new File("\\Screenshots\\"+screenshotName+".png");
	Files.copy(src, destination);
	return destination.getAbsolutePath();
}
}
