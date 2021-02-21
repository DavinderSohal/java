// Key Points:
// 1) Infinite Recursion.
// *******************************************************************

import java.util.Scanner;


public class Recursion2{

    // A recursive method that takes an integer and displays
    // all previous numbers from 1 to that number.
    // For example, if the number is 14, then the program should display
    // 1 2 3 4 5 6 7 8 9 10 11 12 13 14
    public static void displayNumbers(int n){
        // Simple Case (Basic Step)
        if(n == 1)                // Notice the problem here. Will this stopping
        {                        // condition always execute?
            System.out.print(" " + n + " ");
        }else{
            // Call myself (that same method) to display the numbers up to n-1
            displayNumbers(n - 1);
            // Then display n
            System.out.print(" " + n + " ");
        }
    }


    public static void main(String[] args){

        Scanner kb = new Scanner(System.in);
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
Please enter an integer > 0 to display all integers from 1 to that number: 21
 1  2  3  4  5  6  7  8  9  10  11  12  13  14  15  16  17  18  19  20  21 
Thanks for using our recursive method. 


*/

/* Run Again - The following is only a small part of the output. The error actually repeats MANY times
Please enter an integer > 0 to display all integers from 1 to that number: -4
Exception in thread "main" java.lang.StackOverflowError
	at Recursion2.displayNumbers(Recursion2.java:24)
	at Recursion2.displayNumbers(Recursion2.java:31)
	at Recursion2.displayNumbers(Recursion2.java:31)
	at Recursion2.displayNumbers(Recursion2.java:31)
	at Recursion2.displayNumbers(Recursion2.java:31)
	at Recursion2.displayNumbers(Recursion2.java:31)
	at Recursion2.displayNumbers(Recursion2.java:31)
	at Recursion2.displayNumbers(Recursion2.java:31)
	at Recursion2.displayNumbers(Recursion2.java:31)
	at Recursion2.displayNumbers(Recursion2.java:31)
	at Recursion2.displayNumbers(Recursion2.java:31)
	at Recursion2.displayNumbers(Recursion2.java:31)
	at Recursion2.displayNumbers(Recursion2.java:31)
	at Recursion2.displayNumbers(Recursion2.java:31)
	at Recursion2.displayNumbers(Recursion2.java:31)
	at Recursion2.displayNumbers(Recursion2.java:31)
	at Recursion2.displayNumbers(Recursion2.java:31)
	at Recursion2.displayNumbers(Recursion2.java:31)
	at Recursion2.displayNumbers(Recursion2.java:31)
	at Recursion2.displayNumbers(Recursion2.java:31)
	at Recursion2.displayNumbers(Recursion2.java:31)
	at Recursion2.displayNumbers(Recursion2.java:31)
	at Recursion2.displayNumbers(Recursion2.java:31)
	at Recursion2.displayNumbers(Recursion2.java:31)
	at Recursion2.displayNumbers(Recursion2.java:31)
	at Recursion2.displayNumbers(Recursion2.java:31)
	at Recursion2.displayNumbers(Recursion2.java:31)
	at Recursion2.displayNumbers(Recursion2.java:31)
	at Recursion2.displayNumbers(Recursion2.java:31)
	at Recursion2.displayNumbers(Recursion2.java:31)
	at Recursion2.displayNumbers(Recursion2.java:31)
	at Recursion2.displayNumbers(Recursion2.java:31)
	at Recursion2.displayNumbers(Recursion2.java:31)
	at Recursion2.displayNumbers(Recursion2.java:31)
	at Recursion2.displayNumbers(Recursion2.java:31)
	at Recursion2.displayNumbers(Recursion2.java:31)
	at Recursion2.displayNumbers(Recursion2.java:31)
	at Recursion2.displayNumbers(Recursion2.java:31)
	at Recursion2.displayNumbers(Recursion2.java:31)
	at Recursion2.displayNumbers(Recursion2.java:31)
	at Recursion2.displayNumbers(Recursion2.java:31)
	at Recursion2.displayNumbers(Recursion2.java:31)
	at Recursion2.displayNumbers(Recursion2.java:31)
	at Recursion2.displayNumbers(Recursion2.java:31)
	at Recursion2.displayNumbers(Recursion2.java:31)
	at Recursion2.displayNumbers(Recursion2.java:31)
	at Recursion2.displayNumbers(Recursion2.java:31)
	at Recursion2.displayNumbers(Recursion2.java:31)
	at Recursion2.displayNumbers(Recursion2.java:31)
	at Recursion2.displayNumbers(Recursion2.java:31)
	at Recursion2.displayNumbers(Recursion2.java:31)
	at Recursion2.displayNumbers(Recursion2.java:31)
	at Recursion2.displayNumbers(Recursion2.java:31)
	at Recursion2.displayNumbers(Recursion2.java:31)
	:
	:
	:
	:

*/
