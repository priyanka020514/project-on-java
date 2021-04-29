package framework_testng.switch_command_alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cancel_alert {

	public static void main(String[] args) throws Exception 
	{
		 System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
         WebDriver web=new ChromeDriver();
         web.manage().window().maximize();
         web.get("http://demo.automationtesting.in/Alerts.html");
         web.manage().window().maximize();
         
         
       WebElement alert_accept=web.findElement(By.xpath("(//a[@class='analystic'])[2]"));
        alert_accept.click();
        Thread.sleep(5000);
       WebElement alert=web.findElement(By.xpath("//button[@onclick='confirmbox()']"));
       alert.click();
       Thread.sleep(2000);
       Alert alert_cancel=web.switchTo().alert();
       String alert_text=alert_cancel.getText();
       System.out.println(alert_text);
       alert_cancel.dismiss();
       
	}

}
