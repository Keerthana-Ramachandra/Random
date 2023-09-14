package genericUtilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass
{
	public WebDriver driver= null;
	public PropertyFileUtility putil= new PropertyFileUtility();
	public WebDriverUtility wutil= new WebDriverUtility();
	public ExcelFileUtility eutil= new ExcelFileUtility();
	public static WebDriver sdriver;
	
@BeforeSuite (alwaysRun = true)
public void bsconfiguration()
{
	System.out.println("Database connected");
}

@BeforeClass (alwaysRun = true)
public void bcConfiguration() throws IOException
{
	String BROWSER = putil.readDataFromPropertyFile("Browser");
	String URL = putil.readDataFromPropertyFile("url2");
	
	if(BROWSER.equalsIgnoreCase("Chrome"))
	{
		driver= new ChromeDriver();
	}
	else if(BROWSER.equalsIgnoreCase("Edge"))
	{
		driver= new EdgeDriver();
	}
	else if(BROWSER.equalsIgnoreCase("Firefox"))
	{
		driver= new FirefoxDriver();
	}
	else
	{
		System.out.println("Invalid browser");
	}
	
	wutil.implicitlyWait(driver);
	wutil.maximizeBrowser(driver);
	driver.get(URL);
	
	
}

@BeforeMethod (alwaysRun = true)
public void bmConfiguration()
{
	System.out.println("login to applicaion with help of pom class and creating object of that page in baseclass in this method");
}

@AfterMethod (alwaysRun = true)
public void amConfiguration()
{
	System.out.println("logout from applicaion with help of pom class and creating object of that page in baseclass in this method");	
}

@AfterClass (alwaysRun = true)
public void acConfiguration()
{
	driver.quit();
}

@AfterSuite (alwaysRun = true)
public void asConfiguration()
{
	System.out.println("Database disconnected");
}
}
