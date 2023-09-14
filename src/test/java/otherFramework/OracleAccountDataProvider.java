package otherFramework;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import objectRepository.OracleCreateAccountPage;

public class OracleAccountDataProvider extends BaseClass
{
@Test (dataProvider="getdata")
public void oracleAccount(String emailAddress, String password, String retypePassword, String visibleText, String firstName, String lastName, String job, String phoneNumber, String companyName, String address, String city, int index, String postalCode ) throws IOException, InterruptedException
{
	
	OracleCreateAccountPage ocap= new OracleCreateAccountPage(driver);
	Thread.sleep(1000);
	ocap.creaateAccount(emailAddress, password, retypePassword, visibleText, firstName, lastName, job, phoneNumber, companyName, address, city, index, postalCode);
}

@DataProvider
public Object[][] getdata()
{
	
	Object[][] data= new Object[3][13];
	data[0][0]="bhagya@gmil.com";
	data[0][1]="Nammamma";
	data[0][2]="Namamma";
	data[0][3]="India";
	data[0][4]="Nnhini";
	data[0][5]="Kadamba";
	data[0][6]="Priest";
	data[0][7]="7894561230";
	data[0][8]="Chamundeshwari temple";
	data[0][9]="Kembathalli";
	data[0][10]= "Bangalore";
	data[0][11]=17;
	data[0][12]= "560702";
	
	
	data[1][0]="bhaya@gmil.com";
	data[1][1]="Namo";
	data[1][2]="Namo";
	data[1][3]="India";
	data[1][4]="Paramananda";
	data[1][5]="Shiva";
	data[1][6]="Poet";
	data[1][7]="7894561240";
	data[1][8]="Chanrayana publications";
	data[1][9]="Mysore Tech Park";
	data[1][10]= "Raichur";
	data[1][11]=18;
	data[1][12]= "560894";
	
	data[2][0]="vatahma@gmil.com";
	data[2][1]="Ambrutha";
	data[2][2]="Ambrutha";
	data[2][3]="India";
	data[2][4]="Mohana";
	data[2][5]="Anand";
	data[2][6]="doctor";
	data[2][7]="7894556123";
	data[2][8]="Apallo";
	data[2][9]="Bannergatta";
	data[2][10]= "Tarikere";
	data[2][11]=18;
	data[2][12]= "512307";
			
			
	return data;
	
}
}
