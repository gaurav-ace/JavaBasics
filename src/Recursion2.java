import java.util.*;


/*
 *  for this question we have three towers A, B, C
 *  for simplicity lets take the towers to be source, destination and helper.
 *  
 *  Our target is to move the stack of items from source to destination in exactly same order
 *  i.e. the order of items in source should be the order of items in the destination.
 * 
 */
public class Recursion2 {

	public static void solveTOH(int n, char src, char hlp, char dest)
	{
		//base case
		if(n==1)
		{
			System.out.println("Moved item from " + src + " to " + dest);
			return;
		}
		
		//work to do
		// 1) we need to move the first n-1 items to helper
		// 2) then we need to move nth item from src to dest
		// 3) then we need to move the n-1 items from helper to destination, where
		// src will act as helper.
		
		solveTOH(n-1, src, dest, hlp);
		System.out.println("Moved item from " + src + " to " + dest);
		solveTOH(n-1, hlp, src, dest);
		
	}
	public static void main(String [] args) {
		
		System.out.println("***Tower of Hanoi***");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the number of items : ");
		int num = sc.nextInt();
		
		//call the solve function which will use recursion to solve the problem
		solveTOH(num, 'S', 'H', 'D');
		
	}
}
