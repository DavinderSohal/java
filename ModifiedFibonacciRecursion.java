// -----------------------------------------------------
// Assignment # 3 (Project)
// Question Six: Modified Fibonacci Recursion\
// This program ask the user to enter a number and then prints a fibonacci series as per the input
// -----------------------------------------------------

/*
Using recursion, write a program that takes an input ‘n’ (a number) from a user to calculate and print out the
Fibonacci using the following modified definition:

F(N) = 1                                                    if n = 1 or n = 2
         = F((n+1)/2)2 + F((n-1/2)2            if n is odd
         = F(n/2 + 1)2 – F(n/2 – 1)2           if n is even
*/

import java.util.Scanner;

public class ModifiedFibonacciRecursion{
    static int fibonacci(int n){
        //defining the conditions for the series
        if(n <= 2){
            return 1;
        }else if((n % 2) == 0){
            return ((int)Math.pow(fibonacci(n / 2 + 1), 2) - (int)Math.pow(fibonacci(n / 2 - 1), 2));
        }else{
            return ((int)Math.pow(fibonacci((n + 1) / 2), 2) + (int)Math.pow(fibonacci((n - 1) / 2), 2));
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter value: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            //calling and printing the fibonacci function
            if(i == n){
                System.out.print(fibonacci(i));
            }else{
                System.out.print(fibonacci(i) + ", ");
            }
        }
        System.out.println();
    }
}

// last modified January 8,2021
