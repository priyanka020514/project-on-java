package variable;

public class Data_type {

	public static void main(String[] args) 
	{
		byte A=115;
		{
			System.out.println("Value for byte=>"+A);
		}
	int B=15000;
	int C=45000;
	int D=B+C;
	{
		System.out.println("Total value=>"+D);
		System.out.println("Total value=>"+(B+C));
		
	}
	boolean flag=true;
	{
		System.out.println("Flag value is =>"+flag);
	
	}
	boolean flag1=false;
	{
		System.out.println("Flag value is=>"+flag1);
	}
    double ver=5.7458;
    {
    	System.out.println("Decimal value=>"+ver);
    }
    double price=1700.50;
    {
    	System.out.println("Product price=>"+price);
    }
    float G=14050.5f;
    {
    	System.out.println("float value is=>"+G);
    	
    }
    char Fletter='K';
    char Sletter='U';
    {
    	System.out.println(Fletter+"\n"+Sletter);
    }
    String name="Hasvith";
    String Sname="Bachpan";
    {
    	System.out.println(name+""+Sname);
    	
    }
	}

}
