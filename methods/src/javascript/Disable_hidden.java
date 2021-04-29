package javascript;

import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Disable_hidden {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://v1.hdfcbank.com/branch-atm-locator");
        Thread.sleep(5000);
        JavascriptExecutor java=((JavascriptExecutor)driver);
        Robot rob=new Robot();
        rob.mouseMove(310, 165);
        rob.mousePress(InputEvent.BUTTON1_MASK);
        rob.mouseRelease(InputEvent.BUTTON1_MASK);
        Thread.sleep(5000);
        WebElement state=driver.findElement(By.id("customState"));
        Thread.sleep(5000);
        java.executeScript("arguments[0].disabled=true",state);
        Thread.sleep(5000);
        java.executeScript("arguments[0].disabled=false", state);
        Thread.sleep(5000);
        java.executeScript("arguments[0].style.visibility='hidden'", state);
        Thread.sleep(5000);
        java.executeScript("arguments[0].style.visibility='visible'", state);
        
	}

}
