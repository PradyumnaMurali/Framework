package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.G3_BasePage;

import org.openqa.selenium.Alert;


public class P4_Actitime_DelUser extends G3_BasePage{

	@FindBy(xpath="//div[@class='deleteButton actionButton']")
	private WebElement deluser;
	
	public P4_Actitime_DelUser(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void del()
	{
		this.visibleelement(deluser);
		this.deluser.click();
	}
	
//	public void popup(WebDriver driver)
//	{
//		 Alert a = driver.switchTo().alert();
//		a.accept();
//		
//	}
}