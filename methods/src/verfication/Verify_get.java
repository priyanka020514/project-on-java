package verfication;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_get {

	public static void main(String[] args) 
	{
        System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/signup");
       
        String actual_title=driver.getTitle();
        System.out.println("Print the title--->"+actual_title);
        
        String actual_url=driver.getCurrentUrl();
        System.out.println("Print current url--->"+actual_url);
        
        String actual_pagesrc=driver.getPageSource();
        System.out.println(actual_pagesrc);
        
        String windowid=driver.getWindowHandle();
        System.out.println("Print window id"+windowid);
        
        driver.close();
        		
	}

}
