package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Page_cleartrip_hotel {

	WebDriver driver=null;
	public Page_cleartrip_hotel(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
  	}
	
	@FindBy(id="Tags") WebElement where_location;
	@FindBy(xpath="(//a[@href='javascript:void(0);'])[25]") WebElement Check_in_date;
	@FindBy(xpath="(//a[@href='javascript:void(0);'])[43]") WebElement Check_out_date;
	@FindBy(id="travellersOnhome") WebElement Travellers;
	@FindBy(id="SearchHotelsButton") WebElement Search_btn;

}
