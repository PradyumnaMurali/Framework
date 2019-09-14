package Script;


import org.testng.annotations.Test;
import Generic.G2_BaseTest;
import Generic.G4_data;
import Generic.G8_Popup;
import POM.P1_Actitime_LoginPage;
import POM.P2_Actitime_HomePage;
import POM.P3_Actitime_AddUser;
import POM.P4_Actitime_DelUser;

public class S8_Deluser extends G2_BaseTest {
	
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
        
        ob2.clicknewuser();
        
       
        P3_Actitime_AddUser ob3 = new P3_Actitime_AddUser(driver);
        
       try
       {
    		Thread.sleep(10000);
       }
        catch (InterruptedException e) {
        	
	}
       
        ob3.enterfirstname("user");
        ob3.enterlastname("pc");
        ob3.enteremail("user_pc_2019@outlook.com");
        ob3.username("user");
        ob3.password("123India@1");
        ob3.retypepass("123India@1");
        ob3.selectdept();
        ob3.production();
        ob3.create();
        
        ob2.createduser();
        
        try
        {
     		Thread.sleep(10000);
        }
         catch (InterruptedException e) {
         	
 	}
        
        P4_Actitime_DelUser ob4 = new P4_Actitime_DelUser(driver);
        
        ob4.del();
        
        G8_Popup a = new G8_Popup();
        a.accept(driver);     
}

}
