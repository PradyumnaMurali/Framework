package Generic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class G8_Popup {

	public void accept(WebDriver driver)
	{
		Alert a = driver.switchTo().alert();
		a.accept();
	}
}
