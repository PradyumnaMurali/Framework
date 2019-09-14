package Script;

import org.testng.annotations.Test;
import Generic.G2_BaseTest;
import Generic.G4_data;
import POM.P1_Actitime_LoginPage;

public class S4_Validate_DataDriven_Actitime_login_script extends G2_BaseTest {

	@Test
	     public void login()
	     {
	     P1_Actitime_LoginPage ob = new P1_Actitime_LoginPage(driver);
	   
	     ob.setusername(G4_data.getdata(excelpath, "sheet1", 0, 0));
	   
	     ob.setpassword(G4_data.getdata(excelpath, "sheet1", 1, 0));
	   
	     ob.loginbutton();
	     
	     ob.titlewait("actiTIME - Enter Time-Track");
	
	}
}