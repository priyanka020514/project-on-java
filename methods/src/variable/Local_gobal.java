package variable;

public class Local_gobal {

	public static void main(String[] args)
	{
		int A=20;
		System.out.println("Print value="+A);
		
		int B=0;
		if(true)
		{
			B=30;
			System.out.println("Print value="+B);
		}
		B=25;
         System.out.println("Outside value="+B);
         int C=100;
         for(int i=0; i<=10; i++)
         {
       	    String name="Kushu";
       	    System.out.println("Print name="+name);
       	    C=C+i;
       	    
         }
       
         System.out.println("Total value="+C);
       
	}
       
}
