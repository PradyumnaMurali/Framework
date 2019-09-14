package Script;

import org.testng.annotations.Test;

import Generic.G2_BaseTest;
import Generic.G4_data;
import POM.P1_Actitime_LoginPage;
import POM.P2_Actitime_HomePage;

public class S6_Actitime_Logout extends G2_BaseTest {
	
	@Test
	public void clickusers()
	{  
		P1_Actitime_LoginPage ob1 = new P1_Actitime_LoginPage(driver);
        ob1.setusername(G4_data.getdata(excelpath, "sheet1", 0, 0));
        ob1.setpassword(G4_data.getdata(excelpath, "sheet1", 1, 0));
        ob1.loginbutton();
        ob1.titlewait("actiTIME - Enter Time-Track");
    
        P2_Actitime_HomePage ob2 = new P2_Actitime_HomePage(driver);
        
        ob2.clickusers();
        
        ob2.clicklogout();
        
        ob2.titlewait("aciTime - Login");

	}

}
