package tast;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Make_my_trip {

	public static void main(String[] args) throws Exception {
            System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
            WebDriver driver=new ChromeDriver();
             driver.manage().window().maximize();
             driver.get("https://www.makemytrip.com/");
             Thread.sleep(5000);
             driver.findElement(By.linkText("Flights")).click();
             Thread.sleep(6000);
             driver.findElement(By.xpath("//li[@data-cy='roundTrip'][contains(.,'Round Trip')]")).click();
             Thread.sleep(5000);
             driver.findElement(By.xpath("//span[contains(.,'From')]")).click();
             Thread.sleep(3000);
             driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("HYD");
             Thread.sleep(4000);
             driver.findElement(By.xpath("//div[@class='calc60'][contains(.,'Hyderabad, India Rajiv Gandhi Intl Airport')]")).click();
             Thread.sleep(3000);
             driver.findElement(By.xpath("//span[contains(.,'To')]")).click();
             Thread.sleep(4000);
             driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("BOM");
             Thread.sleep(3000);
             driver.findElement(By.xpath("//div[@class='calc60'][contains(.,'Mumbai, India Chhatrapati Shivaji International Airport')]")).click();
             Thread.sleep(3000);
             driver.findElement(By.xpath("//span[contains(.,'DEPARTURE')]")).click();
             Thread.sleep(2000);
             driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[6]/div[1]/div/p[1]")).click();
             Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[3]/div[1]/div/p[1]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//span[contains(.,'Travellers & CLASS')]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//li[@data-cy='adults-4']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//li[@data-cy='children-2']")).click();  
            Thread.sleep(2000);
            driver.findElement(By.xpath("//li[@data-cy='infants-0']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//li[@data-cy='travelClass-1'][contains(.,'Premium Economy')]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//button[contains(@class,'primaryBtn btnApply pushRight ')]")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//li[@class='font12 blackText latoBold activeItem '][contains(.,'Regular Fare')]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn '][contains(.,'Search')]")).click();
            driver.close();

	}


}