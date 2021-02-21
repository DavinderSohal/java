import java.util.Scanner;

public class Multitable   //Declaration of class
{
    public static void main(String[] args)  //Function Declaration
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the value of n: "); //Printing the message to put the numbers
        n = sc.nextInt();    //scanner objects
        for(int i = 1; i <= n; i++)    // Initialisation of for loop
        {
            System.out.print("\t\t" + i);
        }

        System.out.println();
        for(int i = 0; i < n * 8.3; i++){
            System.out.print("-");
        }
        System.out.println();
        for(int i = 1; i <= n; i++){
            System.out.print(i + "|");

            for(int j = 1; j <= n; j++){
                System.out.print("\t");

                if(j == i)        // if else loop
                {
                    System.out.print("\t" + "*");
                }else{
                    System.out.print("\t" + i * j);
                }

            }
            System.out.println();
        }
    }
} // End of the program


