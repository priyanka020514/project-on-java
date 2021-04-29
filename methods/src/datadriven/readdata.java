package datadriven;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterClass;

public class readdata {
	XSSFWorkbook book;
	XSSFSheet sheet;
	
	
	
  @Test
  public void write_inside() {
	  
	  sheet.getRow(1).getCell(6).setCellValue("name");
	  sheet.createRow(3).createCell(0).setCellValue(new Date().toString());
  }
  @BeforeClass
  public void beforeClass() throws Exception {
	  FileInputStream file=new FileInputStream("excel workbook\\worksheet.xlsx");
	   book=new XSSFWorkbook(file);
	   sheet=book.getSheetAt(0);
	  
  }

  @AfterClass
  public void afterClass() throws Exception {
	  FileOutputStream file1=new FileOutputStream("excel workbook\\worksheet1.xlsx");
	  book.write(file1);
	  book.close();
	  
  }

}
