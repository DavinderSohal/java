/*
This is the Java assignment where user can print different patters by inputting the numbers, this will display the welcome message
Then after it will ask user that which type pattern users want to print.
After inputting the number the code will print the pattern, it will print the pattern on the basis of the even odd numbers, if user will put the wrong number in the input, it will show the error and ask users to put the number.
With putting the default int for the exit, it will exit the program.
*/


import java.util.Scanner;

class MamtaJaskaranAssignment     // Main Class
{
    public static void main(String[] args)  //Declaration of the main function
    {
        System.out.println("\n----Welcome to My Assignment----");  // Print the Message
        int i,j, space,choice,rows;     // Defining the Integers value
        Scanner sc = new Scanner(System.in);
        while (true)  // Implementation of while loop
        {
            System.out.println("Which pattern do you want to print?");  // taking input from the users
            System.out.println("1)54321     2)    1     3)12345     4)  1   ");
            System.out.println("  5432           12        2345        123  ");
            System.out.println("  543           123         345       12345 ");
            System.out.println("  54           1234          45        123  ");
            System.out.println("  5           12345           5         1   ");
            System.out.print("Enter your choice (5 to Quit) : ");

            choice = sc.nextInt();

            if (choice < 1 || choice > 5)  // Integration of the If- Else Loop
            {
                System.out.println("Incorrect value");
                System.out.print("enter a number between 1 and 5(inclusive)\n");
                continue;
            }
            else if (choice == 5)   // If user will put the incorrect value, if else loop will run, if user put the right input it will run otherwise it will display message and exit the program
            {
                System.out.println("Hope you enjoyed.");
                sc.close();
                System.exit(0);
            }

            System.out.print("Please enter number of rows(between 0 to 10) : ");   //Taking input from the Users for printing the rows

            rows = sc.nextInt();

            while (rows < 1 || rows > 9)
            {
                System.out.println("Incorrect value.Try again.\n");
                System.out.print("Please enter number of rows(between 0 to 10): ");
                rows = sc.nextInt();
            }

            switch (choice) {     // Implementation of switch function
                case 1 -> {           // Printing the number 1 pattern
                    for (i = 1; i <= rows; i++) {
                        for (j = rows; j >= i; j--) {
                            System.out.print(j);
                        }
                        System.out.println();
                    }
                }
                case 2 -> {       //Printing the number 2 pattern
                    for (i = 1; i <= rows; i++) {
                        for (int k = i; k <= rows - 1; k++) {
                            System.out.print(" ");
                        }
                        for (j = 1; j <= i; j++) {
                            System.out.print(j);
                        }
                        System.out.println(" ");
                    }
                }
                case 3 -> {      //Printing the number 3 pattern
                    int num = 1;
                    for (i = rows; i >= 1; i--) {
                        for (j = rows; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int k = num; k <= rows; k++) {
                            System.out.print(k);
                        }
                        num++;
                        System.out.println(" ");
                    }
                }
                case 4 -> {       //Printing the number 2 pattern
                    int q = 1;
                    if (rows % 2 == 0) {
                        for (j = 1; j <= rows / 2; j++) {
                            for (int k = rows - 1; k > q; k -= 2) {
                                System.out.print(" ");
                            }
                            q += 2;

                            for (i = 1; i <= 2 * j - 1; i++) {
                                System.out.print(i);
                            }
                            System.out.println(" ");
                        }
                        space = rows - 1;
                        int y = rows - 1;
                        for (j = 1; j <= rows / 2; j++) {
                            for (i = rows - 1; i > space; i--) {
                                System.out.print(" ");
                            }
                            space--;
                            int x = 1;
                            for (i = 1; i <= y; i++) {

                                System.out.print(x);
                                x++;
                            }
                            y -= 2;
                            System.out.println(" ");
                        }
                    } else {
                        for (j = 1; j <= (rows + 1) / 2; j++) {
                            for (int k = rows - 1; k > q; k -= 2) {
                                System.out.print(" ");
                            }
                            q += 2;

                            for (i = 1; i <= 2 * j - 1; i++) {
                                System.out.print(i);
                            }
                            System.out.println(" ");
                        }
                        space = rows - 1;
                        int y = rows - 1;
                        for (j = 1; j <= rows / 2 + 1; j++) {
                            for (i = rows; i > space; i--) {
                                System.out.print(" ");
                            }
                            space--;
                            int x = 1;
                            for (i = 1; i < y; i++) {
                                System.out.print(x);
                                x++;
                            }
                            y -= 2;
                            System.out.println(" ");
                        }
                    }

                }
            }

        }
    }
}
