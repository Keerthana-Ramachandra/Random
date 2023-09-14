package linearFramework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DirectLocators
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.edge.driver", "G:\\Selenium\\Software\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("victor");
		driver.findElement(By.name("lastname")).sendKeys("Desouza");
		driver.findElement(By.name("reg_email__")).sendKeys("4561230789");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Victo@789");
		WebElement birthdayDropdown = driver.findElement(By.name("birthday_day"));
		Select s= new Select(birthdayDropdown);
		s.selectByValue("23");
		WebElement birthmonthDropdown = driver.findElement(By.id("month"));
		Select s1= new Select(birthmonthDropdown);
		s1.selectByValue("9");
		WebElement birthyearDropdown = driver.findElement(By.name("birthday_year"));
		Select s2= new Select(birthyearDropdown);
		s2.selectByValue("1970");
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		driver.findElement(By.name("websubmit")).click();
		

	}

}
