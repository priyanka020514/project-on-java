package array;

public class Static_array {

	public static void main(String[] args) 
	{
		//single dimension with static
        String name[]=new String[5];
        name[0]="venkakesh";
        name[1]="Hasvith";
        name[2]="kushith";
        name[3]="adavaitha";
        name[4]="avigna";
        
        System.out.println("Print second name--->" +name[2]);
        int count=name.length;
        System.out.println("count of the name--->"+count);
        
        //double dimension with static
        String product[][][]=new String[3][3][3];
        
        product[0][0][0]="ID";
        product[0][1][1]="name";
        product[0][2][2]="Desg";
       
        product[1][0][0]="05123";
        product[1][1][1]="Hasvith";
        product[1][2][2]="engg";
        
        product[2][0][0]="14258";
        product[2][1][1]="kushith";
        product[2][2][2]="doctor";
        
        int prod_count=product.length;
        System.out.println("Print the count--->"+prod_count);
        
        System.out.println("Print product three details--->"+product[2][0][0]);
        System.out.println("Print product three details--->"+product[2][1][1]);
        System.out.println("Print product three details--->"+product[2][2][2]);
       
       
        
	}

}
