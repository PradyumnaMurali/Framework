package Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class G2_BaseTest implements G1_AutoConstant {
	
	//declaring driver variable outside the block
	public WebDriver driver;
	
	//static block gets executed first in a program
	static
	{
		System.setProperty(chromekey,chromevalue);
		System.setProperty(geckokey,geckovalue);
	}

	@BeforeMethod
	public void precondition()
	{
		//initialization happens here for driver variable
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//we will we testing only one application so this will be common for all the scripts
		driver.get("https://demo.actitime.com/login.do"); 
	}
	
	@AfterMethod
	public void postcondition(ITestResult r)
	{
		String name = r.getMethod().getMethodName();
		int status = r.getStatus();
		if(status == 2)
		{
			System.out.println("taking screenshot");
			G5_Photo.getphoto(driver, name);
		}
		driver.close();
	}
}
	
