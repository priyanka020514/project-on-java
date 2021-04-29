package training.metod;

public class String_methods {

	public static void main(String[] args)
	{
		String Real_result="Validation";
		String Exp_results="Validation";
		boolean flag=Real_result.equals(Exp_results);
		System.out.println("Check the validation-->"+flag);
		
		String R_result="Validation";
		String E_results="validation";
		boolean flag2=R_result.equalsIgnoreCase(E_results);
		System.out.println("Check the case-sensitive--->"+flag2);
		
		String name="Hasvith Kaushal Perumala";
		boolean flag3=name.contains("Kaushal");
		System.out.println("Print name----"+flag3);
		
		String Code="886699774411235";
		String sub=Code.substring(5, 9);
		System.out.println("middle digit-----"+sub);
		String sub1=Code.substring(6);
		System.out.println("digits---"+sub1);
		
		String Raman_Pincode="Ram50000369845";
		boolean flag4=Raman_Pincode.startsWith("Ram");
		System.out.println("Text starts with---"+flag4);
		
		String Rama_Pincode="Ram500000369845";
		boolean flag5=Rama_Pincode.endsWith("45");
		System.out.println("Last digit from the text----"+flag5);
		
		String Landlineno="04023304967";
	      int digi=Landlineno.length();
	      System.out.println("display the size--"+digi);
	      
	    String Phone_no="         04023300126       ";
	    System.out.println("Phone number before trim---"+Phone_no.length());
	    String new_phone=Phone_no.trim();
	    System.out.println("Phone number after trim----"+new_phone.length());
	    
	    String Bank="andhra bank";
	    System.out.println(Bank.toUpperCase());
	     
	    String Office="WIPRO.INFOTECH";
	    System.out.println(Office.toLowerCase());
	    
	    String sname="kushith";
	    String Sname="";
	    System.out.println("Print the name with the status--"+sname.isEmpty());
	    System.out.println("Print the Sname with the status----"+Sname.isEmpty());
	    
		
	}

}
