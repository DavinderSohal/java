// -----------------------------------------------------
// Assignment # 3 (Project)
// Question Three: Password Checker
// This program prompts the user to enter a password and then checks if the password entered meets all the provided
// conditions
// -----------------------------------------------------

/*
Write a program that incorporates an algorithm with a function that will check whether or not a string is in a valid
password format with the following rules:

A password must have at least ten characters.
A password consists of only letters, digits and symbol(s).
A password must contain at least two digits.
A password must contain at least one uppercase letter
A password must contain at least one special symbol

Your program should continue to prompt the user until he/she enters a valid password.
*/

import java.util.Scanner;

class PasswordChecker{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //displaying conditions to the user
        System.out.println("\n1. A password must have at least ten characters.\n" +
                "2. A password consists of only letters, digits and symbol(s).\n" +
                "3. A password must contain at least two digits.\n" +
                "4. A password must contain at least one uppercase letter\n" +
                "5. A password must contain at least one special symbol\n");
        System.out.print("Please enter a password (should follow all the above mentioned conditions): ");
        String password = sc.nextLine();

        //created a regular expression for checking password
        //(?=.*[0-9].*[0-9]) => condition to check that password contain at least 2 digits
        //(?=.*[A-Z]) => condition to check that password contain at least one uppercase letter
        //(?=.*[@#$%^&+=]) => condition to check that password contain at least one special symbol
        //(?=\S+$) => condition to check that password do not contain any spaces in between
        //.{10,} => condition to check that password contain at least 10 characters
        // all these conditions combined also check that password contains only letters, digits and symbol(s)
        String regex = "(?=.*[0-9].*[0-9])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{10,}";

        //prompting the user to enter password again in case all conditions are not fulfilled
        while(!password.matches(regex)){
            System.out.println("***  Password entered does not meet all the requirements, please try again  ***");
            System.out.print("Please enter a password (should follow all the above mentioned conditions): ");
            password = sc.nextLine();
        }
        System.out.println("\nYour password has been set.Thanks");
    }
}

// last modified January 7,2021
