/*Assignment No :1
    This program is about printing the different types of patterns*/
import java.util.*;
public class Patterns {
    public static void main(String[] args) {
        int i, j, value, rows, choice = 1, k = 4;//variables declaration
        System.out.println("----Welcome to Gaming of Patterns by Simranjit Kaur----");
        System.out.println("Which pattern do you want to print?");
        System.out.println("1) 54321\t\t2) 1\t\t3) 12345\t\t4)   1");
        System.out.println("   5432\t\t\t   12\t\t\t2345\t\t    123");
        System.out.println("   543\t\t\t   123\t\t\t 345\t\t   12345");
        System.out.println("   54\t\t\t   1234\t\t\t  45\t\t    123");
        System.out.println("   5\t\t\t   12345\t\t   5\t\t     1");
        Scanner ab = new Scanner(System.in);
//Choice variable is used to enter the choice from the user
        while (choice >= 1 || choice <= 4) {//while loop is used for looping the program
            System.out.println("Enter your choice(5 to quit):");
            choice = ab.nextInt();
            //if and else if used for checking the value entered by the user
            if (choice == 5) {
                System.exit(0);
            } else if (choice > 5 || choice < 1) {
                System.out.println("You entered wrong choice.Please entered the correct one (1-4)");
                continue;
            }


//rows variable is used for entering the rows from the user
            System.out.println("Enter the number of rows you want to print");
            rows = ab.nextInt();
            if (rows < 1 || rows > 9) {//if used to checking the value of rows
                System.out.println("The number of rows must be between (0-9).");
                continue;
            }
            //switch is used for selecting the pattern number which user want to print
            //For loop is used for the printing of patterns
            switch (choice) {
                case 1:
                    System.out.print("1.");
                    for (i = 1; i <= rows; i++) {// loop (i) variable is used for rows
                        System.out.print("\t");
                        for (j = rows; j >= i; j--) {//for columns

                            System.out.print(+j);
                        }
                        System.out.println(" ");

                    }
                    break;
                case 2:
                    System.out.print("2.");
                    for (i = 1; i <= rows; i++) {
                        System.out.print("\t");
                        for (j = 1; j <= i; j++)
                            System.out.print(+j);
                        System.out.println(" ");
                    }
                    break;
                case 3:
                    System.out.print("3.");
                    for (i = 1; i <= rows; i++) {
                        System.out.print("\t");
                        for (k = 1; k < i; k++)// K variable is used for space
                        {
                            System.out.print(" ");
                        }
                        for (j = i; j <= rows; j++) {
                            System.out.print(+j);
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.print("4.");

                    if (rows % 2 == 0) {
                        for (i = 1; i <= rows; i += 2) {
                            System.out.print("\t");//k variable for spaces and value for processing the loop
                            for (value = 1; value < k; value++)
                                System.out.print(" ");
                            k--;

                            for (j = 1; j <= i; j++)
                                System.out.print(j);

                            System.out.println(" ");
                        }
                        k = rows;
                        for (i = rows; i >= 1; i = i - 2) {//for down printing of pattern of number 4
                           // System.out.print("\t");
                            {
                             //   for (value=1; value<k; value++)
                               //     System.out.print(" ");k--;
                               // for (k = 1; k < i; k++)// K variable is used for space
                                //{//
                                   // System.out.print(" ");
                                //}
                                for(value=1;value<k;value++)
                                    System.out.print(" ");
                                    k--;

                                for( j=1;j<=rows-1;j++)

                                {
                                    System.out.print(" ");
                                }
                                for (j = 1; j < i; j++)
                                    System.out.print(j);

                                System.out.println(" ");
                            }
                        }
                    } else {
                        for (i = 1; i <= rows; i += 2) {
                            System.out.println(" ");
                            for (value =1; value <= k; value++)
                                System.out.print(" ");
                            k--;
                            for (j = 1; j <= i; j++)
                                System.out.print(+j);

                        }
                        k=rows;
                       for(i=rows;i>=1;i-=2)
                       {
                           System.out.println( );
                            for (value =1; value <k; value++)
                                System.out.print(" ");
                            k++;
                            for(j=1;j<=i-2;j++)
                                System.out.print(+j);
                        }
                    }
            }
        }
ab.close();
    }
}



