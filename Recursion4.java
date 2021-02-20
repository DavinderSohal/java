// Key Points:
// 1) Recursive Methods Return Type.
// *******************************************************************

import java.util.Scanner;



public class Recursion4{
	
	// A recursive method that takes an integer and returns the summation  
	// of all numbers from 1 to that number.
	// For example, if the number is 8, then the method would calculate 
	// and return 36, which is (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8). 
	public static int sumNumbers(int n)
	{
		if(n <= 0)
		{
			System.out.println("You must enter an integer larger than 0." +
					" Method will return \"0\" as an indication of no calculations.");
			return 0;
		}
		
		int total = 0;
		// Simple Case (Basic Step)
		if(n == 1 )				
		{						
			total += 1;
			return total;
		}
		else
		{
			// Call myself (that same method) to calculate the total for up to n-1 then add n
			total = n + sumNumbers(n-1);
			return total;
		}
	}
  
	
	public static void main(String[] args)
  {
    	 
    	 Scanner kb = new Scanner (System.in);
    	 int i, result;
    	 
    	 System.out.print("Please enter an integer > 0 to display all integers from 1 to that number: ");
    	 i = kb.nextInt();
    	 
    	 // Call the recursive method to calculate the summation of the numbers 
    	 result = sumNumbers(i);
    	 
    	 if (result != 0)	// Calculations were made
    		 System.out.println("\nThe summation of all numbers from 1 to " + i + " is: " + result);
         kb.close();
 }
}

/* The Output 
Please enter an integer > 0 to display all integers from 1 to that number: 8

The summation of all numbers from 1 to 8 is: 36
*/


/* Run Again
Please enter an integer > 0 to display all integers from 1 to that number: 100

The summation of all numbers from 1 to 100 is: 5050
*/



/* Run Again 
Please enter an integer > 0 to display all integers from 1 to that number: 2

The summation of all numbers from 1 to 2 is: 3
*/



/* Run Again 
Please enter an integer > 0 to display all integers from 1 to that number: 1

The summation of all numbers from 1 to 1 is: 1
*/


/* Run Again 
Please enter an integer > 0 to display all integers from 1 to that number: -9
You must enter an integer larger than 0. Method will return "0" as an indication of no calculations.
*/

