package variable;

import org.openqa.selenium.By;

public class Reusable_method 
{  
	public static By login_email=By.xpath("//input[@id='identifierId']");
	public static By next_button=By.xpath("//div[contains(@class,'VfPpkd-RLmnJb')]");
	public static By login_password=By.xpath("//input[contains(@autocomplete,'current-password')]");
	public static By next_password=By.xpath("(//div[@class='VfPpkd-RLmnJb'])[1]");

}
