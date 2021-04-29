package verfication;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getcss_getsize {

	public static void main(String[] args) 
	{ 
		 System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.spicejet.com/");
         
         String run_time_title=driver.getTitle();
         System.out.println("Print the tile----"+run_time_title);
		  
         String run_time_url=driver.getCurrentUrl();
         System.out.println("Print the current url---"+run_time_url);
         
         WebElement select=driver.findElement(By.xpath("(//input[@value='OneWay'])[1]"));
        select.click();
       String back_color=select.getCssValue("background-color");
       System.out.println("Print the bgcolor of the text-->"+back_color);
      Point get_loc=select.getLocation();
     int obj_x=get_loc.getX();
     System.out.println("Print the x value--->"+obj_x);
     int obj_y=get_loc.getY();
     System.out.println("Print the y value-->"+obj_y);
     
     Dimension get_sze_text=select.getSize();
    int obj_height=get_sze_text.getHeight();
    System.out.println("Print the height---"+obj_height);
    int obj_width=get_sze_text.getWidth();
    System.out.println("Print the width---"+obj_width);
    driver.close();
     
      

	}

}
