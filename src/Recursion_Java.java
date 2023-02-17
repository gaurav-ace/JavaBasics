import java.util.*;


/*
 * logic here is to finish the work on log(n) time for any n{ here n is the power}
 * t[x^n] = t[x^(n/2)] + t[x^(n/2)] and so on we have to keep breaking it.
 * 
 */

public class Recursion_Java {
	
	public static int findPow(int x, int n)
	{
		//base case
		if(x <= 1)
			return 1;
		if(n == 0)
			return 1;
		
		//work
		int powX = 0;
		if(n % 2 == 0)
			 powX = findPow(x,n/2) * findPow(x,n/2);
		else
			 powX = findPow(x,n/2) * findPow(x,n/2) * x;
		
		return powX;
	}
  
	public static void main(String args[]) {
	  System.out.print("********* Power of number in logn time *********");
	  Scanner sc = new Scanner(System.in);
	  
	  int x = sc.nextInt();
	  int n = sc.nextInt();
	  
	  System.out.print( "value of " + x + "^" + n + " is : " + findPow(x,n));
  }
}

