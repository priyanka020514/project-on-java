package variable;

public class Run_user1 {

	public static void main(String[] args) 
	{
		Reusable_program obj=new Reusable_program();
		obj.Driver_path="Drivers\\";
		obj.url="https://accounts.google.com/ServiceLogin/identifier?flowName=GlifWebSignIn&flowEntry=AddSession";
		obj.launch_chrome();
		 obj.username="askapriyanka@gmail.com";
		 obj.user_login();
         obj.password="priyavenkat";
		 obj.user_login();
        

	}

}
