package pagefactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_cleartrip_flight {
   
	WebDriver driver=null;
    
	public Page_cleartrip_flight(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="FromTag") public WebElement From_location;
	@FindBy(xpath="(//a[@tabindex='-1'])[3]") public WebElement From_select_loc;
	@FindBy(id="ToTag")  public WebElement To_location;
	@FindBy(xpath="(//a[contains(@tabindex,'-1')])[4]") public WebElement To_select_loc;
	@FindBy(xpath="(//a[@href='javascript:void(0);'])[27]") public WebElement Date_picker;
	@FindBy(id="Adults") public WebElement Select_adluts;
	@FindBy(id="Childrens")public WebElement Select_chlidren;
	@FindBy(id="Infants") public WebElement Select_infant;
	@FindBy(partialLinkText="More options:") public WebElement Click_moreoption;
	@FindBy(id="Class") public WebElement Select_class;
	@FindBy(id="AirlineAutocomplete") public WebElement Select_Prefairline;
	@FindBy(xpath="(//a[contains(@tabindex,'-1')])[6]") public WebElement Click_airlines;
	@FindBy(id="SearchBtn") public WebElement Search_btn;
	
	

}
