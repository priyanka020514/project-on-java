package opps_encapsulation;

public class Run_hidding {

	public static void main(String[] args) 
	{
          Hidding_data use=new Hidding_data();
          use.id="bach1203";
          System.out.println(use.id);
          use.Set_name("Hasvith");
          use.Set_desgi("Software Engg");
          use.Set_sal("200000");
          use.Set_copname("Wipro");
          //calling return value
          
          String calling_name=use.get_name();
          System.out.println(calling_name);
          String calling_desgi=use.get_desgination();
          System.out.println(calling_desgi);
          String calling_sal=use.get_salary();
          System.out.println(calling_sal);
          String calling_copname=use.get_copname();
          System.out.println(calling_copname);
          use.id="bach1205";
          System.out.println(use.id);
          use.Set_name("Kushith");
          use.Set_desgi("developer");
          use.Set_sal("300000");
          use.Set_copname("TCS");
          //calling return value
          
          String calling1_name=use.get_name();
          System.out.println(calling1_name);
          String calling1_desgi=use.get_desgination();
          System.out.println(calling1_desgi);
          String calling1_sal=use.get_salary();
          System.out.println(calling1_sal);
          String calling1_copname=use.get_copname();
          System.out.println(calling1_copname);
          
          
	}

}
