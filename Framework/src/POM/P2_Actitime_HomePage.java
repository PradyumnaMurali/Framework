package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.G3_BasePage;

public class P2_Actitime_HomePage extends G3_BasePage {
	@FindBy(xpath="//a[@class='content tasks']")
	private WebElement tasks;
	
	@FindBy(xpath="//a[@class='content reports']")
	private WebElement reports;
	
	@FindBy(xpath="//a[@class='content users']")
	private WebElement users;
	
	@FindBy(id="logoutLink")
	private WebElement logout;
	
	@FindBy(xpath="//div[text()='  New User']")
	private WebElement newuser;
	
	@FindBy(xpath="//span[text()='pc, user']")
	private WebElement user;
	
	  public P2_Actitime_HomePage(WebDriver driver)
	  {
		  super(driver);
		  PageFactory.initElements(driver, this);
	  }
	
	public void clicktasks()
	{
		this.tasks.click();
	}
	
	public void clickeports()
	{
		this.reports.click();
	}
	
	public void clickusers()
	{
		this.visibleelement(users);
		this.users.click();
	}
	
	public void clicklogout()
	{
		this.logout.click();
	}
	
	public void clicknewuser()
	{
		this.visibleelement(newuser);
		this.newuser.click();
	}
	
	public void createduser()
	{
		this.visibleelement(user);
		this.user.click();
	}
}
