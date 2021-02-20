// *******************************************************************
// Recursion1.java By: Aiman Hanna (C) 1993 - 2016
// This program introduces the subject of recursion.  
// 
// Key Points:
// 1) Recursion & Recursive Methods.
// *******************************************************************

import java.util.Scanner;



public class Recursion1{
	
	// A recursive method that takes an integer and displays 
	// all previous numbers from 1 to that number
	public static void displayNumbers(int n)
	{
		if(n <= 0)
		{
			System.out.println("You must enter an integer larger than 0." +
					" Method will return.");
			return;
		}
		
		// Simple Case (Basic Step)
		if(n == 1 )
		{
			System.out.print(" " + n + " ");
		}
		else
		{
			// Call myself (that same method) to display the numbers up to n-1
			displayNumbers(n-1);
			// Then display n
			System.out.print(" " + n + " ");
		}
	}
  
	
	public static void main(String[] args)
  {
    	 
    	 Scanner kb = new Scanner (System.in);
    	 int i;
    	 
    	 System.out.print("Please enter an integer > 0 to display all integers from 1 to that number: ");
    	 i = kb.nextInt();
    	 
    	 // Call the recursive method to display the numbers 
    	 displayNumbers(i);
    	 
         System.out.println("\nThanks for using our recursive method. ");
         kb.close();
 }
}

/* The Output 
Please enter an integer > 0 to display all integers from 1 to that number: 12
 1  2  3  4  5  6  7  8  9  10  11  12 
Thanks for using our recursive method. 

*/

/* Run Again 
Please enter an integer > 0 to display all integers from 1 to that number: -9
You must enter an integer larger than 0. Method will return.

Thanks for using our recursive method. 

*/
