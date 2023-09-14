package linearFramework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class OracleAccount
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.edge.driver", "G:\\Selenium\\Software\\msedgedriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		Thread.sleep(6000);
		driver.findElement(By.id("sView1:r1:0:email::content")).sendKeys("balachandra@gmail.com");
		driver.findElement(By.id("sView1:r1:0:password::content")).sendKeys("nidhi@20");
		driver.findElement(By.id("sView1:r1:0:retypePassword::content")).sendKeys("nidhi@20");
		WebElement countryDropdown = driver.findElement(By.id("sView1:r1:0:country::content"));
		Select s= new Select(countryDropdown);
		s.selectByVisibleText("India");
		driver.findElement(By.id("sView1:r1:0:firstName::content")).sendKeys("Neeraj");
		driver.findElement(By.id("sView1:r1:0:lastName::content")).sendKeys("jain");
		driver.findElement(By.id("sView1:r1:0:jobTitle::content")).sendKeys("Banker");
		driver.findElement(By.id("sView1:r1:0:workPhone::content")).sendKeys("3078945612");
		driver.findElement(By.id("sView1:r1:0:companyName::content")).sendKeys("Canara bank");
		driver.findElement(By.id("sView1:r1:0:address1::content")).sendKeys("Ashoknagar");
		driver.findElement(By.id("sView1:r1:0:city::content")).sendKeys("Shivamogga");
		WebElement stateDropdoen = driver.findElement(By.id("sView1:r1:0:state::content"));
		Thread.sleep(6000);
		Select s1= new Select(stateDropdoen);
		s.selectByIndex(17);
		Thread.sleep(6000);
		driver.findElement(By.id("sView1:r1:0:postalCode::content")).sendKeys("560070");
		driver.findElement(By.xpath("//span[text()='Create Account']")).click();

	}

}
