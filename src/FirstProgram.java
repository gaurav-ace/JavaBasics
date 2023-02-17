import java.util.*;

public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   System.out.println("testing print");
		   
		   StringBuilder sb = new StringBuilder("h");
		   
		   // inserting 
		   sb.insert(0, 'o');
		   
		   //append
		   sb.append(" my god");
		   
		   System.out.println(sb);
		   
		   
		   //Taking input from the terminal : 
			Scanner sc = new Scanner(System.in);
			System.out.print("enter your text below : \n");
			String st = sc.nextLine();
			
			//System.out.println(st);
			
			int a = 10;
			int b = 0;
			
			b = --a;
			System.out.println(b);
			System.out.println(a);
			
			
		   
	}

}
