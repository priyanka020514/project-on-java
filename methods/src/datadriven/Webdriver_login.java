package datadriven;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webdriver_login {

	public static void main(String[] args) throws Exception 
	{
         System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
         WebDriver driver=new FirefoxDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         
         //target file
         FileInputStream file=new FileInputStream("excel workbook\\worksheet.xlsx");
         System.out.println("file created");
         //target book
         XSSFWorkbook book=new XSSFWorkbook(file);
         
        //target sheet
        XSSFSheet sheet=book.getSheet("logindeatails");
        
        for (int i = 7; i <=sheet.getLastRowNum(); i++) 
        {
        	//read static data
			String url=sheet.getRow(0).getCell(1).getStringCellValue();
			String email=sheet.getRow(1).getCell(1).getStringCellValue();
			String pass=sheet.getRow(2).getCell(1).getStringCellValue();
			String login=sheet.getRow(3).getCell(1).getStringCellValue();
			String arrow=sheet.getRow(4).getCell(1).getStringCellValue();
			String logout=sheet.getRow(5).getCell(1).getStringCellValue();
			
			//read dynamic data
			String username=sheet.getRow(i).getCell(0).getStringCellValue();
			String password=sheet.getRow(i).getCell(1).getStringCellValue();
			String exp_data=sheet.getRow(i).getCell(2).getStringCellValue();
			
			//get url
			driver.get(url);
			//get elements
			driver.findElement(By.xpath(email)).sendKeys(username);
			driver.findElement(By.xpath(pass)).sendKeys(password);
			driver.findElement(By.xpath(login)).click();
			if(exp_data.equalsIgnoreCase("valid"))
			{
				Thread.sleep(3000);
				driver.findElement(By.xpath(arrow)).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath(logout)).click();
			}
			
		}
        driver.close();
         
         
	}

}
