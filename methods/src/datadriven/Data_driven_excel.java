package datadriven;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Data_driven_excel {

	public static void main(String[] args) throws Exception
	{
        FileInputStream file=new FileInputStream("excel workbook\\Product details.xlsx");
        System.out.println("file created");
        //Target workbook 
        XSSFWorkbook book=new XSSFWorkbook(file);
        //Target sheet 
        XSSFSheet sheet=book.getSheet("Products");
        System.out.println("sheet created");
        //target row
        XSSFRow row=sheet.getRow(1);
        System.out.println("created row");
        //target cell
        XSSFCell cell=row.getCell(0);
        //read cell data
        String Product=cell.getStringCellValue();
        System.out.println(Product);
        
        
	}

}
