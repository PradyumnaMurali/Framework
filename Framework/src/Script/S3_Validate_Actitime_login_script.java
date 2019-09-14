package Script;

import org.testng.annotations.Test;
import Generic.G2_BaseTest;
import Generic.G4_data;
import POM.P1_Actitime_LoginPage;

public class S3_Validate_Actitime_login_script extends G2_BaseTest {

	@Test
	     public void login()
	     {
	     P1_Actitime_LoginPage ob = new P1_Actitime_LoginPage(driver);
	   
	     ob.setusername("admin");
	   
	     ob.setpassword("manager");
	   
	     ob.loginbutton();
	     
	     ob.titlewait("actiTIME - Enter Time-Track");
	     
	      
	}
}
