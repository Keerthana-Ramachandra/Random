package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.WebDriverUtility;

public class OracleCreateAccountPage extends WebDriverUtility
{

@FindBy(id="sView1:r1:0:email::content")
private WebElement emailTextfield;
@FindBy(id="sView1:r1:0:password::content")
private WebElement passwordTextfield;
@FindBy(id="sView1:r1:0:retypePassword::content")

private WebElement retypepasswordTextfield;
@FindBy(id="sView1:r1:0:country::content")
private WebElement countryDropdown;
@FindBy(id="sView1:r1:0:firstName::content")
private WebElement firstnameTextfield;
@FindBy(id="sView1:r1:0:lastName::content")
private WebElement lastnameTextfield;
@FindBy(id="sView1:r1:0:jobTitle::content")
private WebElement jobTextfield;
@FindBy(id="sView1:r1:0:workPhone::content")
private WebElement phoneNumberTextfield;
@FindBy(id="sView1:r1:0:companyName::content")
private WebElement companyNameTextfield;
@FindBy(id="sView1:r1:0:address1::content")
private WebElement addressTextfield;
@FindBy(id="sView1:r1:0:city::content")
private WebElement cityTextfield;
@FindBy(id="sView1:r1:0:state::content")
private WebElement stateDropdown;
@FindBy(id="sView1:r1:0:postalCode::content")
private WebElement postalcodeTextfield;
@FindBy(xpath="//span[text()='Create Account']")
private WebElement createAccountButton;

public OracleCreateAccountPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public WebElement getEmailTextfield() 
{
	return emailTextfield;
}

public WebElement getPasswordTextfield() 
{
	return passwordTextfield;
}

public WebElement getRetypepasswordTextfield()
{
	return retypepasswordTextfield;
}

public WebElement getCountryDropdown()
{
	return countryDropdown;
}

public WebElement getFirstnameTextfield()
{
	return firstnameTextfield;
}

public WebElement getLastnameTextfield() 
{
	return lastnameTextfield;
}

public WebElement getJobTextfield() 
{
	return jobTextfield;
}

public WebElement getPhoneNumberTextfield()
{
	return phoneNumberTextfield;
}

public WebElement getCompanyNameTextfield()
{
	return companyNameTextfield;
}

public WebElement getAddressTextfield() 
{
	return addressTextfield;
}

public WebElement getCityTextfield()
{
	return cityTextfield;
}

public WebElement getStateDropdown()
{
	return stateDropdown;
}

public WebElement getPostalcodeTextfield()
{
	return postalcodeTextfield;
}

public WebElement getCreateAccountButton()
{
	return createAccountButton;
}
/**
 * This method will create account
 */
public void creaateAccount(String emailAddress, String password, String retypePassword, String visibleText, String firstName, String lastName, String job, String phoneNumber, String companyName, String address, String city, int index, String postalCode )
{
	emailTextfield.sendKeys(emailAddress);
	passwordTextfield.sendKeys(password);
	retypepasswordTextfield.sendKeys(retypePassword);
    handleDropdown(visibleText, countryDropdown);
    firstnameTextfield.sendKeys(firstName);
    lastnameTextfield.sendKeys(lastName);
    jobTextfield.sendKeys(job);
    phoneNumberTextfield.sendKeys(phoneNumber);
    companyNameTextfield.sendKeys(companyName);
    addressTextfield.sendKeys(address);
    cityTextfield.sendKeys(city);
    handleDropdown(stateDropdown, index);
    postalcodeTextfield.sendKeys(postalCode);
    createAccountButton.click();
    
}
}
