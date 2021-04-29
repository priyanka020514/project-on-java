package opps_inheritance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Page_cleartrip_trains {
	
	WebDriver driver;

	public Page_cleartrip_trains(WebDriver driver) 
	{
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="from_station")public WebElement from_station;
	@FindBy(id="to_station") public WebElement to_station;
	@FindBy(id="trainClass") public WebElement Select_class;
	@FindBy(xpath="(//a[@href='javascript: void(0);'])[16]") public WebElement Date_picker;
	@FindBy(id="train_adults") public WebElement Select_adult;
	@FindBy(id="train_children") public WebElement Select_children;
	@FindBy(id="train_male_seniors") public WebElement Select_msenior;
	@FindBy(id="train_female_seniors") public WebElement Select_wsenior;
	@FindBy(id="trainFormButton") public WebElement Search_button;
	
	//creating method
	public void search_trains() throws Exception
	{
		
		from_station.sendKeys("Secunderabad");
		Thread.sleep(3000);
		from_station.click();
		to_station.sendKeys("Vijayawada");
		Thread.sleep(2000);
		to_station.click();
		new Select(Select_class).selectByIndex(1);
		Thread.sleep(2000);
	    Date_picker.click();
	    Thread.sleep(2000);
		new Select(Select_adult).selectByIndex(2);
		Thread.sleep(2000);
		new Select(Select_children).selectByIndex(2);
		Thread.sleep(2000);
		new Select(Select_msenior).selectByIndex(1);
		Thread.sleep(2000);
		new Select(Select_wsenior).selectByIndex(0);
		Thread.sleep(5000);
		Search_button.click();
		
		
		
	}
	   public void verify_title()
	{
		System.out.println(driver.getTitle());
	}
	

}
