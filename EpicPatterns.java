/* -----------------------------------------------------
 Assignment # 1
 Written by: Davinder Singh (2092836) and Navneet Kaur (2092453)
 The program when executed will prompt the user to select one of the 4 patterns they want to print and after receiving
 valid input, user would have to enter the required number of rows for their pattern and the project will print that
 pattern.
 For this project we used while, if-else, switch and for loops and imported Scanner java package to take input from the
 user.If the input is incorrect or not in expected range, an error message will be displayed accordingly and would
 ask the individual to re-enter their values.To handle exceptions we used try and catch method.
 -----------------------------------------------------*/

import java.util.Scanner;

class EpicPatterns  /*created class named EpicPatterns*/
{
    public static void main(String[] args)
    {
        System.out.println("\n----Welcome to Davinder (2092836) and Navneet's (2092453) Pattern Generator Program----");

        Scanner sc = new Scanner(System.in);  /*created scanner object*/

        try /*using try and catch method to handle exceptions, like if a string value is entered instead of int or to
             deal with any other sort of error.*/
        {
            while (true) /*using while to create an infinite loop.*/
            {
                System.out.println(
                        "---------------------------------------------------------------------------------------");
                System.out.println("\nWhich pattern do you want to print?\n");/*show patterns for user to select from*/
                System.out.println("1) 5 4 3 2 1     2)         1     3) 1 2 3 4 5     4)     1     ");
                System.out.println("   5 4 3 2                1 2          2 3 4 5          1 2 3   ");
                System.out.println("   5 4 3                1 2 3            3 4 5        1 2 3 4 5 ");
                System.out.println("   5 4                1 2 3 4              4 5          1 2 3   ");
                System.out.println("   5                1 2 3 4 5                5            1     ");
                System.out.print("\nEnter your choice (5 to Quit) : "); /*requesting input from user*/

                int choice = sc.nextInt();  /*Read user input*/

                if (choice < 1 || choice > 5) /*checking whether option selected is within valid value frame.*/
                {
                    System.out.println("\nERROR: \"" + choice + "\" is an invalid entry."); /*display error message.*/
                    System.out.print("\t\tTry again and please enter a number between 1 and 5(inclusive) only.\n");
                    continue;   /*Skips the remaining code and re-run the while loop.*/
                } else if (choice == 5)  /*terminating the project if 5 is pressed.*/
                {
                    System.out.println("\nBye, have a nice day! ＼( ･_･) ");
                    sc.close(); /*closing Scanner object before terminating program.*/
                    System.exit(0);  /*exit program.*/
                }

                System.out.print("Please enter number of rows(between 0 to 10) you would like to print: ");
                /*asking user to enter number of rows*/
                int rows = sc.nextInt(); /*Reading input form user.*/

                while (rows < 1 || rows > 9) /*checking whether input is valid or not.If invalid, request for a correct
                                             value until received.*/
                {
                    System.out.println("\nERROR: \"" + rows + "\" is an invalid entry. Try again.\n"); /*Error message*/
                    System.out.print("Please enter number of rows(between 0 to 10) you would like to print: ");
                    rows = sc.nextInt(); /*Reading user input.*/
                }

                switch (choice) /*switch statement to create different patterns as per the value of choice which we
                                 took from the user.*/
                {
                    case 1:
                    {                      /*case 1 to print 1st pattern*/
                        System.out.printf("\nYou chose pattern number 1 with %d row(s).\n", rows);
                        System.out.println("Here is your pattern:\n");
                        for (int i = 1; i <= rows; i++)/*Using for loop to print rows and columns of desired pattern*/
                        {
                            int num = rows;
                            for (int j = rows; j >= i; j--)
                            {
                                System.out.print(num + " "); /*prints the pattern*/
                                num--; /*decrementing the value of variable num.*/
                            }
                            System.out.println(); /*to goto next line*/
                        }
                    }
                    break;   /*Skip the rest of cases and end switch*/
                    case 2:
                    {                     /*case 2 to print 2nd pattern*/
                        System.out.printf("\nYou chose pattern number 2 with %d row(s).\n", rows);
                        System.out.println("Here is your pattern:\n");
                        for (int i = 1; i <= rows; i++)
                        {
                            for (int j = rows - 1; j >= i; j--)
                            {
                                System.out.print("  ");  /*To print white space*/
                            }
                            int num = 1;
                            for (int k = 1; k <= i; k++)
                            {
                                System.out.print(num + " ");  /*prints the integer values of pattern*/
                                num++;  /*incrementing the value of variable num.*/
                            }
                            System.out.println(); /*next line*/
                        }
                    }
                    break;    /*Skip the rest of cases and end switch*/
                    case 3:
                    {                     /*case 3 to print 3rd pattern.*/
                        System.out.printf("\nYou chose pattern number 3 with %d row(s).\n", rows);
                        System.out.println("Here is your pattern:\n");
                        for (int i = 1; i <= rows; i++)
                        {
                            for (int j = 2; j <= i; j++)
                            {
                                System.out.print("  "); /*print white space.*/
                            }
                            for (int k = i; k <= rows; k++)
                            {
                                System.out.print(k + " "); /*print integer values.*/
                            }
                            System.out.println(); /*Move to next line*/
                        }
                    }
                    break;    /*Skip the rest of cases and end switch*/
                    case 4:
                    {                         /*case 4 to print 4th pattern.*/
                        System.out.printf("\nYou chose pattern number 4 with %d row(s).\n", rows);
                        System.out.println("Here is your pattern:\n");
                        for (int i = 1; i <= rows; i += 2)
                        {
                            for (int j = rows - 1; j >= i; j--)
                            {
                                System.out.print(" ");  /*print white space.*/
                            }
                            int num = 1;
                            for (int k = 1; k <= i; k++)
                            {
                                System.out.print(num + " "); /*print integer values.*/
                                num++; /*incrementing the value of variable num.*/
                            }
                            System.out.println();
                        }
                        if (rows % 2 == 0) /*Checking if number of rows entered are odd or even.*/
                        {
                            for (int i = rows - 1; i >= 1; i -= 2)  /*if even execute this block*/
                            {
                                for (int j = rows - 1; j >= i; j--)
                                {
                                    System.out.print(" "); /*print white space*/
                                }
                                int num = 1;
                                for (int k = 1; k <= i; k++)
                                {
                                    System.out.print(num + " "); /*print integer values for pattern*/
                                    num++; /*incrementing the value of variable num.*/
                                }
                                System.out.println();
                            }
                        } else
                        {
                            for (int i = rows - 2; i >= 1; i -= 2) /*if odd execute this block*/
                            {
                                for (int j = rows - 1; j >= i; j--)
                                {
                                    System.out.print(" "); /*print white space*/
                                }
                                int num = 1;
                                for (int k = 1; k <= i; k++)
                                {
                                    System.out.print(num + " "); /*print integer values for the pattern*/
                                    num++; /*incrementing the value of variable num.*/
                                }
                                System.out.println();
                            }
                        }
                    }
                    break;    /*Skip the rest of cases and end switch*/
                    default:
                        throw new IllegalStateException("Unexpected value: " + choice); /* throwing an error message
                                                                                             for an unexpected state*/
                }
                System.out.print("\nPress ENTER key to continue..... "); /*prompting user to press ENTER key*/
                sc.nextLine(); /* will end the nextInt() that was used before*/
                sc.nextLine(); /*read input*/
            }
        } catch (Exception e) /*catch to used to manage any error encountered and display an error message.*/
        {
            System.out.println("\nERROR: Unexpected value. Please enter only valid integer value (spaces or other " +
                    "String values are not allowed)");
            System.out.print("\nPress ENTER key to restart. ");
            sc.nextLine(); /*will end the nextInt() or nextLine() that was used before*/
            sc.nextLine();/*read input*/
            main(args); /*re-run the program by making recursive call to main method.*/
        }
    }
}


/* Last Modified on December 5th,2020 9:50PM IST.
   Thank you */
