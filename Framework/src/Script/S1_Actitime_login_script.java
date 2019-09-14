package Script;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Generic.G2_BaseTest;

public class S1_Actitime_login_script extends G2_BaseTest{
	
	@Test
	public void  loginscript()
	{
	 driver.findElement(By.id("username")).sendKeys("admin");
	 
	 driver.findElement(By.name("pwd")).sendKeys("manager");
	 
	 driver.findElement(By.id("loginButton")).click();
	}

}
