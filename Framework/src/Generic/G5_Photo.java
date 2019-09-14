package Generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class G5_Photo {
	
	public static void getphoto(WebDriver driver,String name)
	{
		TakesScreenshot t = (TakesScreenshot) driver;
		
		File src = t.getScreenshotAs(OutputType.FILE);
		
		//saving the screenshot by name of the method
		File dest = new File("./screenshot/"+name+".png");
		try
		{
		FileUtils.copyFile(src, dest);
	}
		catch (IOException e){
			{
				
			}
		}

}
}
