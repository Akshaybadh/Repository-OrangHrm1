package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheetClass
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		String path ="C:\\Users\\dell\\Desktop\\Excel Sheet\\ExcelString111.xlsx";
		
		FileInputStream file = new FileInputStream(path);
		
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");

		for (int r=0; r<=9; r++)
		{
			for (int c=0; c<=9; c++)
			{
				String value1 = sheet.getRow(r).getCell(c).getStringCellValue();
				System.out.println(value1);
			}
			
		}
				
		
	}
}
