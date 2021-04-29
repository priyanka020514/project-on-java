package pagefactory;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Run_flight_reusable_keys {

	public static void main(String[] args) throws Exception
	{
        System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        driver.navigate().to("https://www.cleartrip.com/flights");
         Reusable_keywords_webelement obj=new Reusable_keywords_webelement(driver);
         Page_cleartrip_flight obj1=new Page_cleartrip_flight(driver);
         obj.implicitly_wait(30);
         obj.explicitly_wait(30);
         Thread.sleep(4000);
         obj.Edit_box(obj1.From_location, "Delhi");
         Thread.sleep(3000);
         obj.click(obj1.From_select_loc);
         Thread.sleep(3000);
         obj.Edit_box(obj1.To_location, "Pune");
         Thread.sleep(2000);
         obj.click(obj1.To_select_loc);
         Thread.sleep(2000);
         obj.click_element(obj1.Date_picker);
         Thread.sleep(2000);
         obj.Select_dropdown("visibletext", obj1.Select_adluts, "4");
         obj.Select_dropdown("value", obj1.Select_chlidren, "3");
         obj.Select_dropdown("index", obj1.Select_infant, "1");
         obj.click_element(obj1.Click_moreoption);
         obj.Select_dropdown("visibletext", obj1.Select_class, "Premium Economy");
         obj.Edit_box(obj1.Select_Prefairline, "air");
         Thread.sleep(2000);
         obj.click(obj1.Click_airlines);
         Thread.sleep(3000);
         obj.click_element(obj1.Search_btn);
         driver.close();
	}

}
