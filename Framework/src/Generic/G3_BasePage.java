package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

//TO VALIDATE SCRIPT
public class G3_BasePage {
	WebDriver driver;
	
   public G3_BasePage(WebDriver driver2) {
		this.driver=driver2;
	}
   
public void titlewait(String excpected_title)
   {
	   WebDriverWait wait = new WebDriverWait(driver, 10);
	  try
	  {
      //if title doesn't match we get exception.
      //since there is a chance of getting exception we enclose this in try block and define catch block to handle exception
	  wait.until(ExpectedConditions.titleIs(excpected_title));
	  
	  //this is going to print the statement in the console and also log it in the report
	  Reporter.log("pass:title is matching", true);
	  }
      catch(Exception e)
	  {
    	  //control comes to catch block only when the condition has failed.
    	  Reporter.log("fail : Title is not matching", true);
    	  
    	  //the script has failed
    	  Assert.fail();
	  }
	}


public void visibleelement(WebElement element)
{
	WebDriverWait wait = new WebDriverWait(driver, 10);
	try
	{
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	catch(Exception e)
	{
		Reporter.log("fail:element is not visible", true);
		Assert.fail();
	}
  }
}
