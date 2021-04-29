package method_parameters;

public class Run_with_reusable_keywords {

	public static void main(String[] args)
	{
         Reusable_keywords obj=new Reusable_keywords();
         obj.launch_browser("firefox");
         obj.create_webpage("https://www.facebook.com/r.php");
         obj.implicitly_wait(30);
         obj.Edit_box_text("//input[@name='firstname']", "Hasvith");
         obj.Edit_box_text("//input[@name='lastname']", "Kaushal");
         obj.Edit_box_text("//input[@name='reg_email__']", "hasvithkaushal@gmail.com");
         obj.Edit_box_text("//input[@name='reg_email_confirmation__']", "hasvithkaushal@gmail.com");
         obj.Edit_box_text("//input[@id='password_step_input']", "hassu@05");
         obj.Select_dropdown("visibletext", "//select[@id='day']", "5");
         obj.Select_dropdown("value", "//select[@id='month']", "7");
         obj.Select_dropdown("index", "//select[@id='year']", "12");
         obj.click_elements("(//input[@name='sex'])[2]");
         obj.click_elements("(//button[@type='submit'])[1]");
	}

}
