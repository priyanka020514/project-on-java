package webdriver.links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Partial_link {

	public static void main(String[] args) throws Exception {
		// setting environment
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.linkText("Flights")).click();
		Thread.sleep(4000);
		new Select(driver.findElement(By.id("Adults"))).selectByVisibleText("5");
		new Select(driver.findElement(By.id("Childrens"))).selectByValue("3");
		new Select(driver.findElement(By.id("Infants"))).selectByIndex(1);
		driver.findElement(By.partialLinkText("More options:")).click();
		driver.close();

	}

}
