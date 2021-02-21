// -----------------------------------------------------
// Assignment # 3 (Project)
// Question One: Multiplication Table
// Program prints a multiplication matrix after taking input from user and main diagonal is replaced by "*".
// -----------------------------------------------------

/*
Write a program to display on the screen a multiplication table from 1 to n; where n is an integer entered by the
user. The main diagonal of the table must be filled with the character ‘*’.
*/

import java.util.Scanner;

class MultiplicationTable{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //try and catch to handle exceptions
        try{
            System.out.print("\nEnter the value of n: ");
            int n = sc.nextInt();

            //multiply_matrix will store the values
            String[][] multiply_matrix = new String[n][n];
            System.out.print("\t\t\t");
            for(int i = 1; i <= n; i++){
                System.out.print(i + "\t\t");
            }
            System.out.println();
            for(int i = 1; i <= n; i++){
                System.out.print("---------");
            }

            //looping through to store the values after multiplication in a matrix
            for(int i = 1; i <= n; i++){
                System.out.println();
                System.out.print("\t" + i + "|" + "\t");
                for(int j = 1; j <= n; j++){

                    //if it's a main diagonal, put "*" in it
                    //for any other position put value of multiplication,i.e., i*j
                    if(i == j){
                        multiply_matrix[i - 1][j - 1] = "*";
                    }else{
                        multiply_matrix[i - 1][j - 1] = String.valueOf(i * j);
                    }
                    System.out.print("\t" + multiply_matrix[i - 1][j - 1] + "\t");
                }
            }
            System.out.println();
        }catch(Exception e){
            System.out.println("ERROR: Invalid Input (enter only integer values)");

            //recursive call to main method
            main(args);
        }
    }
}

// last modified January 7,2021
