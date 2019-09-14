package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.G3_BasePage;

public class P3_Actitime_AddUser extends G3_BasePage {

	@FindBy(id="createUserPanel_firstNameField")
	private WebElement fn;
	
	@FindBy(id="createUserPanel_lastNameField")
	private WebElement ln;
	
	@FindBy(id="createUserPanel_emailField")
	private WebElement email;
	
	@FindBy(id="createUserPanel_usernameField")
	private WebElement usn;
	
	@FindBy(id="createUserPanel_passwordField")
	private WebElement pwd;
	
	@FindBy(id="createUserPanel_passwordCopyField")
	private WebElement rpwd;
	
	@FindBy(xpath="//div[@class='simpleListMenuButton components_userGroupSelectorMenu emptyList notEmpty']")
	private WebElement dept;
	
	@FindBy(xpath="//div[@class='item' and text()='Production']")
	private WebElement prod;
	
	@FindBy(xpath="//div[@class='components_button submitBtn']")
	private WebElement createuser;
	
	public P3_Actitime_AddUser(WebDriver driver)
	  {
		super(driver);
		  PageFactory.initElements(driver, this);
	  }
	
	public void enterfirstname(String f)
	{
		this.fn.sendKeys(f);
	}
	
	public void enterlastname(String l)
	{
		this.ln.sendKeys(l);
	}

	public void enteremail(String e)
	{
		this.email.sendKeys(e);
	}
	
	public void username(String u)
	{
		this.usn.sendKeys(u);
	}
	
	public void password(String p)
	{
		this.pwd.sendKeys(p);
	}
	
	public void retypepass(String rp)
	{
		this.rpwd.sendKeys(rp);
	}
	
	public void selectdept()
	{
		this.dept.click();
	}
	
	public void production()
	{
		this.prod.click();
	}
	
	public void create()
	{
		this.createuser.click();
	}
	
	
}