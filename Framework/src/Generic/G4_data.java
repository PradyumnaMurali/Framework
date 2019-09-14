package Generic;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class G4_data {
   public static String getdata(String path,String shno,int row,int column) 
   {
	   String data = null;
	   
	 //always use try catch to handle exception
	   try
	   {
	   FileInputStream f1 = new FileInputStream(path);
	    Workbook book = WorkbookFactory.create(f1); 
	    data = book.getSheet(shno).getRow(row).getCell(column).getStringCellValue();
	   }
	   catch (Throwable e)
	   {
	   }
	   
	   /*String data is declared inside the method outside the try block because to avoid writing multiple return statements
	   one in try block and other in catch block*/
	   
	    return data;
   }
}
