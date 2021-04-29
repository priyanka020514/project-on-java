package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_driver {

	public static void main(String[] args) {
       System.setProperty("webdriver.chrome.Driver","Drivers\\chromedriver.exe");
       WebDriver wd=new ChromeDriver();
       wd.get("http://gmail.com");
		System.out.println(wd.getTitle());
		wd.manage().window().fullscreen();
		wd.close();
		
		
		
		
		

        
	}

}
