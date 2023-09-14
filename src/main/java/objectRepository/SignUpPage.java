package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtilities.WebDriverUtility;

public class SignUpPage extends WebDriverUtility
{
@FindBy (xpath = "//input[@aria-label='First name']")
private WebElement firstNameTextfield;
@FindBy(name = "lastname")
private WebElement surNameTextfield;
@FindBy(name = "reg_email__")
private WebElement emailTextfield;
@FindBy(name = "reg_passwd__")
private WebElement passwordTextfield;
@FindBy(name = "birthday_day")
private WebElement birthDayDropDown;
@FindBy(id="month")
private WebElement birthMonthDropDown;
@FindBy(name = "birthday_year")
private WebElement birthYearDropDown;
@FindBy(xpath="(//input[@name='sex'])[2]")
private WebElement maleRadioButton;
@FindBy(xpath="(//input[@name='sex'])")
private WebElement femaleRadioButton;
@FindBy(name = "websubmit")
private WebElement signUpButton;

public SignUpPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public WebElement getFirstNameTextfield()
{
	return firstNameTextfield;
}

public WebElement getSurNameTextfield() 
{
	return surNameTextfield;
}

public WebElement getEmailTextfield() 
{
	return emailTextfield;
}

public WebElement getPasswordTextfield()
{
	return passwordTextfield;
}

public WebElement getBirthDayDropDown() {
	return birthDayDropDown;
}

public WebElement getBirthMonthDropDown() 
{
	return birthMonthDropDown;
}

public WebElement getBirthYearDropDown()
{
	return birthYearDropDown;
}

public WebElement getGenderRadioButton() 
{
	return maleRadioButton;
}


public WebElement getFemaleRadioButton()
{
	return femaleRadioButton;
}

public WebElement getSignUpButton() 
{
	return signUpButton;
}

/**
 * This method will signup to the application with male gender
 * @param firstName
 * @param lastName
 * @param email
 * @param password
 * @param value1
 * @param value2
 * @param value3
 */
public void signupToApplicationWithMaleGender(String firstName, String lastName, String phoneNumber,String password, String value1, String value2, String value3)
{
	firstNameTextfield.sendKeys(firstName);
	surNameTextfield.sendKeys(lastName);
	emailTextfield.sendKeys(phoneNumber);
	passwordTextfield.sendKeys(password);
	handleDropdown(birthDayDropDown, value1);
	handleDropdown(birthMonthDropDown, value2);
	handleDropdown(birthYearDropDown, value3);
	maleRadioButton.click();
	signUpButton.click();	
}

/**
 * This method will signup to the application with female gender
 * @param firstName
 * @param lastName
 * @param email
 * @param password
 * @param value1
 * @param value2
 * @param value3
 */
public void signupToApplicationWithFemaleGender(String firstName, String lastName, String phoneNumber, String password, String value1, String value2, String value3)
{
	firstNameTextfield.sendKeys(firstName);
	surNameTextfield.sendKeys(lastName);
	emailTextfield.sendKeys(phoneNumber);
	passwordTextfield.sendKeys(password);
	handleDropdown(birthDayDropDown, value1);
	handleDropdown(birthMonthDropDown, value2);
	handleDropdown(birthYearDropDown, value3);
	femaleRadioButton.click();
	signUpButton.click();	
}


	
}

