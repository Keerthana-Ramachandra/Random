package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
@FindBy (linkText = "Create new account")
private WebElement createNewAccountButton;

public LoginPage (WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public WebElement getCreateNewAccountButton()
{
	return createNewAccountButton;
}

/**
 * This method will click On Create New Account Button
 */
public void clickOnCreateNewAccountButton()
{
	createNewAccountButton.click();
}

}
