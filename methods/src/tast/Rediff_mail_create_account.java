package tast;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediff_mail_create_account {

	public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
      WebDriver web=new ChromeDriver();
      web.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
      web.manage().window().maximize();
      web.get("https://mypage.rediff.com/login/dologin");
      web.findElement(By.linkText("Create a Rediffmail account")).click();
      web.findElement(By.xpath("//input[contains(@maxlength,'61')]")).sendKeys("Hasvith Kaushal");
      web.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")).sendKeys("Hasvith_Kaushal05");
      web.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]")).click();
      web.findElement(By.xpath("(//input[contains(@maxlength,'14')])[1]")).sendKeys("kushith14");
      web.findElement(By.xpath("(//input[contains(@maxlength,'14')])[2]")).sendKeys("kushith14");
      web.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input")).click();
      new  Select(web.findElement(By.xpath("//*[@id=\"div_hintQS\"]/table/tbody/tr[2]/td[3]/select"))).selectByVisibleText("What is your favourite pass-time?");
      web.findElement(By.xpath("//*[@id=\"div_hintQS\"]/table/tbody/tr[4]/td[3]/input")).sendKeys("Playing Games");
      web.findElement(By.xpath("//*[@id=\"div_hintQS\"]/table/tbody/tr[6]/td[3]/input")).sendKeys("Priyanka");
      web.findElement(By.xpath("//*[@id=\"mobno\"]")).sendKeys("9866126917");
       new Select(web.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"))).selectByVisibleText("05");
       new Select(web.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"))).selectByValue("07");
       new Select(web.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"))).selectByIndex(14);
       web.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]")).click();
       new Select(web.findElement(By.xpath("//*[@id=\"country\"]"))).selectByVisibleText("India");
       new Select(web.findElement(By.xpath("//*[@id=\"div_city\"]/table/tbody/tr[1]/td[3]/select"))).selectByValue("Hyderabad");
      
      
	}

}
