package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class G6_Act {
	
	public static void doubleClick(WebDriver driver,WebElement target)
	{
		Actions a = new Actions(driver);
		a.doubleClick(target).perform();
	}
	
	public static void rightclick(WebDriver driver,WebElement target)
	{
		Actions a = new Actions(driver);
		a.contextClick(target).perform();
	}

}
