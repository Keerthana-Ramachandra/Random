package otherFramework;

import java.io.IOException;

import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import objectRepository.OracleCreateAccountPage;

public class OracleAccount extends BaseClass
{
@Test
public void oracleAccount() throws IOException, InterruptedException
{
	
	OracleCreateAccountPage ocap= new OracleCreateAccountPage(driver);
	Thread.sleep(1000);
	ocap.creaateAccount("bhagya@gmail.com", "Nammamma", "Nammamma", "India", "Nandini", "Kadamba", "priest", "7894561230", "Chamundeshwari temple", "Kembathalli", "Bangalore", 17, "560702");
}
}
