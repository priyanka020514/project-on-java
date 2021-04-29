package framework_testng.switch_command_alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pop_up_window {

	public static void main(String[] args) throws Exception
	{
             System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
             WebDriver web=new ChromeDriver();
             web.manage().window().maximize();
             web.get("http://demo.automationtesting.in/Alerts.html");
             web.manage().window().maximize();
             
             
           WebElement alert_accept=web.findElement(By.xpath("//button[contains(@onclick,'alertbox()')]"));
            alert_accept.click();
            Thread.sleep(5000);
            
            Alert alert_text=web.switchTo().alert();
          String name=alert_text.getText();
          System.out.println(name);
          alert_text.accept();
          web.close();
	}

}
