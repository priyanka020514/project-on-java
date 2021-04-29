package datadriven;

import java.io.FileInputStream;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Reading_data {

	public static void main(String[] args) throws Exception
	{
         FileInputStream file=new FileInputStream("excel workbook\\worksheet.xlsx");
         System.out.println("file created");
         
         //target book
         XSSFWorkbook wb=new XSSFWorkbook(file);
         System.out.println("book created");
         //target sheet
         XSSFSheet sheet=wb.getSheetAt(0);
         //target row
         XSSFRow row=sheet.getRow(1);
         //target cell
         XSSFCell cell=row.getCell(0);
         //read data
         String Prod_name=cell.getStringCellValue();
         System.out.println(Prod_name);
         //before convert
        double Prod_id=row.getCell(1).getNumericCellValue();
        System.out.println(Prod_id);
        //after convert
        String new_id=NumberToTextConverter.toText(Prod_id);
        System.out.println(new_id);
        
        Double Prod_price=row.getCell(2).getNumericCellValue();
        System.out.println(Prod_price);
        
        Double Prod_quantity=row.getCell(3).getNumericCellValue();
        System.out.println(Prod_quantity);
        
        int quantity=Prod_quantity.intValue();
        System.out.println(quantity);
        
       Double Prod_mob=row.getCell(4).getNumericCellValue();
       System.out.println(Prod_mob);
       
       long mobile=Prod_mob.longValue();
       System.out.println(mobile);
       
       String email=row.getCell(5).getStringCellValue();
       System.out.println(email);
         
     

	}

}
