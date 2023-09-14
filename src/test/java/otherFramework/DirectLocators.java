package otherFramework;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import objectRepository.LoginPage;
import objectRepository.SignUpPage;

public class DirectLocators extends BaseClass
{
	
@Test
public void signuptest() throws EncryptedDocumentException, IOException
{
	String FIRSTNAME= eutil.readDataFromExcelFileWithStringValue("SignUp", 1, 2);
	String LASTNAME= eutil.readDataFromExcelFileWithStringValue("SignUp", 1, 3);
	String PASSWORD= eutil.readDataFromExcelFileWithStringValue("SignUp", 1, 5);
	LoginPage lp= new LoginPage(driver);
	lp.clickOnCreateNewAccountButton();
	SignUpPage sup= new SignUpPage(driver);
	sup.signupToApplicationWithMaleGender(FIRSTNAME, LASTNAME, "4561230789", PASSWORD, "23", "9", "1970");
}
}
