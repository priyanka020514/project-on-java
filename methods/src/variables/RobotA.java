package variables;

public class RobotA {

	public void walk()
	{
       System.out.println("Speed is 20"); 
	}
    public  void walk(int speed)
    {
    	System.out.println("walk speed is=>"+speed);
    	
    }
    public void walk(String name,int speed)
    {
           System.out.println(name+"walk speed is=>"+speed);
           
    }
    
	public static void main(String[] args) {
		
             new RobotA().walk();
             new RobotA().walk(10);
             new RobotA().walk("Hasvith", 30);
	}

}
