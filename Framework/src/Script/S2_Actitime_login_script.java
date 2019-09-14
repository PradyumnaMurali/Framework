package Script;

import org.testng.annotations.Test;

import Generic.G2_BaseTest;
import POM.P1_Actitime_LoginPage;

public class S2_Actitime_login_script extends G2_BaseTest {

	@Test
	     public void login()
	     {
	     P1_Actitime_LoginPage ob = new P1_Actitime_LoginPage(driver);
	   
	     ob.setusername("admin");
	   
	     ob.setpassword("manager");
	   
	     ob.loginbutton();
	}
}
