package variables;

public class Get_details {

	public static void main(String[] args) {
          Global_variable obj=new Global_variable();
          String Sname=obj.name;
          System.out.println(Sname);
          int SAge=obj.Age;
          System.out.println(SAge);
          String SSchoolname=obj.Schoolname;
          
          System.out.println(SSchoolname);
          obj.Details_son();
          Global_variable.Hobbies_hassu();
	}

}
