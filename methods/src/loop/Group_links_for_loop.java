package loop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Group_links_for_loop {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.hdfcbank.com/");
          String links[]= {"Personal","NRI","SME","Wholesale","Agri"};
          for (int i = 0; i < links.length; i++)
          {
			driver.findElement(By.linkText(links[i])).click();
			Thread.sleep(5000);
			System.out.println("Get the title---"+links[i]+""+driver.getTitle());
		}
	}

}
