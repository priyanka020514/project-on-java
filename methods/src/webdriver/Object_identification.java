package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Object_identification {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","Drivers\\geckodriver.exe");
		
        WebDriver web=new FirefoxDriver();
        web.get("https://accounts.google.com/signup");
        
        web.manage().window().maximize();
        web.findElement(By.id("firstName")).sendKeys("kushith");
        web.findElement(By.id("lastName")).sendKeys("viyan");
        web.findElement(By.id("username")).sendKeys("kushithviyan@gmail.com");
        web.findElement(By.name("Passwd")).sendKeys("kushu@14");
        web.findElement(By.name("ConfirmPasswd")).sendKeys("kushu@14");
        
        web.close();
        
	}

}
