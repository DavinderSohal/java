
import java.util.Random;
import java.util.Scanner;

// Defining a class
public class Mamta_Roll_A_Dice{
    // Starting of the main program
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        // Printing welcoming message
        System.out.println("Welcome to the Roll a dice Program");
        // Taking input from the users

        System.out.println("What is the number of sides of each dice: ");
        int sides = scan.nextInt();
        // Initialising while loop
        while(true){
            System.out.println("How many times do you want to roll a dice:");

            int roll = scan.nextInt();


            // Initializing of2 d array

            int[][] utildice = new int[2][roll];
            int[][] mathdice = new int[2][roll];
            for(int i = 0; i < 2; i++){
                for(int j = 0; j < roll; j++){

                    // Create instance of Random class
                    Random rand = new Random();

                    utildice[i][j] = rand.nextInt(sides) + 1;


                    // Math.random() to generate random numbers

                    mathdice[i][j] = (int)((Math.random() * sides) + 1);

                }
            }
            // Array for sum
            int[] utilsum = new int[roll];
            int[] mathsum = new int[roll];
            for(int i = 0; i < roll; i++){
                utilsum[i] = utildice[0][i] + utildice[1][i];
                mathsum[i] = mathdice[0][i] + mathdice[1][i];

            }

            System.out.println("Sum\t\t Should Occur\t\t % Occurred\t\t % Occurred");
            System.out.println("   \t\t             \t\t Util.Random\t Math.Random");

            int utilcount = 0;
            int mathcount = 0;
            int num = 1;
            for(int i = 0; i < sides * 2 - 1; i++){
                for(int j = 0; j < roll; j++){

                    if(utilsum[j] == (i + 2)){
                        utilcount++;
                    }
                    if(mathsum[j] == (i + 2)){
                        mathcount++;
                    }
                }
                // Counting the probability

                double souldoccur = (double)(num * 100) / (sides * sides);
                double probutil = (double)(utilcount * 100) / roll;
                double probmath = (double)(mathcount * 100) / roll;
                System.out.printf(" %d\t\t(%d)%5.2f       \t\t (%d) %5.2f \t\t (%d) %5.2f\n", (i + 2)
                        , num, souldoccur, utilcount, probutil, mathcount, probmath);
                utilcount = 0;
                mathcount = 0;
                if((i + 2) <= sides){
                    num++;
                }else{
                    num--;
                }
            }
            System.out.println("Do you want repeat?");
            String c = scan.next();
            if(!c.equals("y")){
                System.out.println("Thanks for using our program");
                System.exit(0);
            }
        }
    }
}
