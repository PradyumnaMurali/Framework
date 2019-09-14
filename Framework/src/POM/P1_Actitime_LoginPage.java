package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.G3_BasePage;

public class P1_Actitime_LoginPage extends G3_BasePage
{

	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(name="pwd")
	private WebElement password;
	
	@FindBy(id="loginButton")
	private WebElement loginbutton;
	
	public P1_Actitime_LoginPage(WebDriver Driver)
	{
		super(Driver);
		//this is used to save the present page element address to variable 'Driver'
		PageFactory.initElements(Driver, this);
	}
	public void setusername(String un)
	{
		this.username.sendKeys(un);
	}
	
	public void setpassword(String pw)
	{
		this.password.sendKeys(pw);
	}
    
	public void loginbutton()
	{
		this.loginbutton.click();
	}
	}
