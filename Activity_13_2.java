/*
	The software must ask 4 numbers to the user
	The software must say which number is the highest
	You are not allowed to use AND / OR in your decision elements in the flowchart
o	Each decision element must represent only one condition
How the program should interact with the user:

Enter Number 1        __
Enter Number 2        __
Enter Number 3        __
Enter Number 4	      __

The biggest number is __
*/

import java.util.Scanner;

public class Activity_13_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int biggest = 0;
        for(int x = 1; x <= 7; x++){
            System.out.print("Enter # " + x + " ");
            int num = sc.nextInt();
            if(num > biggest){
                biggest = num;
            }
        }
        System.out.println("The biggest number is " + biggest);
    }
}
