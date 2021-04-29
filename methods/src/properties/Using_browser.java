package properties;

import java.io.FileInputStream;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Using_browser {

	public static void main(String[] args) throws Exception {
		 FileInputStream file=new FileInputStream("src\\properties\\facebook.properties");
	      System.out.println("file created");
	      
	      Properties repository=new Properties();
	      repository.load(file);
	      
	     String url=repository.getProperty("URL");
	     System.out.println(url);
	      
	     String email=repository.getProperty("EMAIL");
	     System.out.println(email);
	     
	     String pass=repository.getProperty("PASSWORD");
	     System.out.println(pass);
	     
	     System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
	     WebDriver driver=new FirefoxDriver();
	     driver.get(url);
	     
	     driver.findElement(By.id("email")).clear();
	     driver.findElement(By.id("email")).sendKeys(email);
	     
	     driver.findElement(By.id("pass")).sendKeys(pass);
	     
	     Thread.sleep(3000);
	     driver.close();
	     
	     
	}

}
