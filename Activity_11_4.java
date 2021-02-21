/*
Write a program that incorporates a function/method(s) to compute the Fibonacci sequence.
The sequence can be explained by adding the two previous numbers together to derive the next number in the sequence.
Write a program that takes a number from the user that then goes through a function which computes and displays the
sequence of the sequence to the number taken from the user (do so without using a recursive function).
*/

import java.util.Scanner;

public class Activity_11_4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a #: ");
        int number = sc.nextInt();
        int first = 1;
        int second = 1;
        System.out.print(first + ", " + second);
        for(int i = 2; i < number; i++){
            int next = first + second;
            first = second;
            second = next;
            System.out.print(", " + next);
        }
        System.out.println();
    }
}