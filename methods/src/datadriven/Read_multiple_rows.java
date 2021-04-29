package datadriven;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_multiple_rows {

	public static void main(String[] args) throws Exception 
	{
           FileInputStream file=new FileInputStream("excel workbook\\worksheet.xlsx");
           System.out.println("filecreated");
           XSSFWorkbook book=new XSSFWorkbook(file);
           XSSFSheet sheet=book.getSheetAt(1);
           for (int i = 1; i <=sheet.getLastRowNum(); i++)
           {
			 String username=sheet.getRow(i).getCell(0).getStringCellValue();
			 String password=sheet.getRow(i).getCell(1).getStringCellValue();
			 
			 System.out.println(username+"  "+password);
		}
           
           
	}

}
