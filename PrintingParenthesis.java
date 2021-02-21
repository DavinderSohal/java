// -----------------------------------------------------
// Assignment # 3 (Project)
// Question Seven: Printing Parenthesis
// This program ask the user to enter a number and then prints all its valid combinations
// -----------------------------------------------------

/*
Write a program that uses a recursive algorithm to print all the valid (properly closed and open brackets)
combinations of a number of parentheses taken from the user.
*/

import java.util.Scanner;

public class PrintingParenthesis{
    static void parenthesis(char[] ch, int index, int no_of_parenthesis, int open_count, int close_count){
        //termination condition
        if(close_count == no_of_parenthesis){
            for(char c : ch){
                System.out.print(c);
            }
            System.out.print(", ");
        }else{
            //condition to get closing bracket
            if(open_count > close_count){
                ch[index] = ')';

                //recursion call
                parenthesis(ch, index + 1, no_of_parenthesis, open_count, close_count + 1);
            }
            if(open_count < no_of_parenthesis){
                //condition to get opening bracket
                ch[index] = '(';

                //recursion call
                parenthesis(ch, index + 1, no_of_parenthesis, open_count + 1, close_count);
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter number of Parenthesis: ");
        int no_of_parenthesis = sc.nextInt();

        //array ch will store the parenthesis combinations
        char[] ch = new char[no_of_parenthesis * 2];
        if(no_of_parenthesis > 0){
            //calling function
            parenthesis(ch, 0, no_of_parenthesis, 0, 0);
            System.out.println();
        }
    }
}

// last modified January 8,2021
