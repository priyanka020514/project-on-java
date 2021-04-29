package array;

public class Dynamic_array {

	public static void main(String[] args) 
	{
		//single dynamic
		String single[]= {"Robot","skiluli","webdriver"};
		System.out.println("Print skiluli-->"+single[1]);
		
		//double dimension
		String name[][]= {
			            {"Hasvith","age-05"},
			            {"Kushith","age-04"},
			            {"venkatesh","age-32"}
		};
		//Print Hasvith record
		System.out.println("Print first record--"+name[0][0]+" "+name[0][1]);
		for (int i = 0; i < name.length; i++)
		{
			System.err.println("--"+name[i][0]+""+name[i][1]);
			
		}
		

	}

}
