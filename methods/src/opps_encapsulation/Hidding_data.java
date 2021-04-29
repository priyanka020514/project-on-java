package opps_encapsulation;

public class Hidding_data {
	//All variables declared as private so that in other classes it won't be visible
	private String name;
	private String desgination;
	private String salary;
	private String copname;
	public String id;
	
	//Set method to initialise private variables by using parameters
	public void Set_name(String Enter_name)
	{
		name=Enter_name;
	}
	//Set method to initialise private variables by using parameters
		public void Set_desgi(String Enter_desgi)
		{
			desgination=Enter_desgi;
		}
		//Set method to initialise private variables by using parameters
		public void Set_sal(String Enter_salary)
		{
			salary=Enter_salary;
		}
		//Set method to initialise private variables by using parameters
		public void Set_copname(String Enter_copname)
		{
		    copname=Enter_copname;
		}
		//method by using return type
		public String get_name()
		{
			return name;
		}
		public String get_desgination()
		{
			return desgination;
		}
		public String get_salary()
		{
			return salary;
			
		}
		public String get_copname() 
		{
			return copname;
			
		}
}
