
// *******************************************************************
// MethodParameters1.java By: Aiman Hanna (C) 1993 - 2016
// This program illustrates the concept of Call-By-Value for 
// parameter passing.
//
// Key Points: 
// 	1) Call-By-Value
// *******************************************************************

public class  MethodParameters1 {

	
	public static void main(String[] args) {
		
		// This program attempt to swap two variables using the swap function
		// which is defined below
		
		int val1 = 30, val2 = 80;
		System.out.println("Before calling the swap function , val1 is is: " + val1); 
		System.out.println("Before calling the swap function , val2 is is: " + val2);
		
		// Call the swap function to swap the values of val1 & val2
		// Will this work? Why?
		
		swap(val1, val2);
	
		System.out.println("\nAfter calling the swap function , val1 is is: " + val1); 
		System.out.println("After calling the swap function , val2 is is: " + val2);

	}
	
	public static void swap(int x, int y)
	{
		System.out.println("\nInside Swap function. Before swapping, x is: " + x); 
		System.out.println("Inside Swap function. Before swapping, y is: " + y); 
		
		int temp = x;
		x = y;
		y = temp;
		
		System.out.println("Inside Swap function. After swapping, x is: " + x); 
		System.out.println("Inside Swap function. After swapping, y is: " + y); 
	}
	
	
}

/* The Output
Before calling the swap function , val1 is is: 30
Before calling the swap function , val2 is is: 80

Inside Swap function. Before swapping, x is: 30
Inside Swap function. Before swapping, y is: 80
Inside Swap function. After swapping, x is: 80
Inside Swap function. After swapping, y is: 30

After calling the swap function , val1 is is: 30
After calling the swap function , val2 is is: 80
*/

