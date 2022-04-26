import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		try 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the class name ");
			String sname=sc.next();
			Class c = Class.forName(sname);
			Game game=(Game) c.newInstance();  
	        game.play();    
    	} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (InstantiationException e) 
		{
			e.printStackTrace();
		} 
		catch (IllegalAccessException e) 
		{
			e.printStackTrace();
		}  
        
	}

}
