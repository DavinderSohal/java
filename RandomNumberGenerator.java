// -----------------------------------------------------
// Assignment # 2
// It is a program which calculates the probability of the sum that should occur and the probability that occurred when
// two dice are rolled using two different methods(util.Random and Math.random).
// -----------------------------------------------------

/*
Write a program to simulate the rolling of two dice. The program should use Math.Random and util.Random object to
roll the first and second die. Using a two dimensional array to tally the number of times each sum appears using the
random number generator methods.

Your program should:
1. Display a welcoming message
2. Ask the user how many sides each die has
3. Create the 2-d array to hold the frequency counter of each possible sums
4. Ask the user how many times they want the dice to be rolled using both methods
5. Print the expected frequencies and actual frequencies and percentages each sum appeared in both methods in a
tabular format.
6. Repeat steps 3 to 5 as long as the user wants.
7. End with a closing message
*/

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        System.out.println("\n%-----D A V I N D E R-----2 0 9 2 8 3 6-----%");
        System.out.println("%                                           %");
        System.out.println("%  How good is the Random Number Generator  %");
        System.out.println("%                                           %");
        System.out.println("%------N A V N E E T-----2 0 9 2 4 5 3------%");
        System.out.print("\nHow many sides each die has? ");

        //try and catch block to throw exceptions
        try{
            int no_of_sides = sc.nextInt();

            //2d-array named possible_sum that will hold the matrix for sum of all possible values of two dice
            int[][] possible_sum = new int[no_of_sides][no_of_sides];
            int[] possible_frequency = new int[((no_of_sides) * 2 - 1)];

            //looping through array to store the values of sum of two dice.
            for(int i = 0; i < no_of_sides; i++){
                for(int j = 0; j < no_of_sides; j++){
                    possible_sum[i][j] = i + j + 2;
                }
            }
            int sum = 2;
            int num = 0;
            int possible_count = 0;

            //using loop to count the occurrence of each sum in the matrix and storing that value in another array
            for(int l = 0; l < ((no_of_sides) * 2 - 1) * (no_of_sides); l++){
                for(int m = 0; m < no_of_sides; m++){
                    if(possible_sum[num][m] == sum){

                        //incrementing possible_count each time required value is encountered in array
                        possible_count++;
                    }
                    if(m == no_of_sides - 1){
                        num++;
                        if(num == no_of_sides){

                            //storing frequency of each sum in an array
                            possible_frequency[sum - 2] = possible_count;
                            num = 0;
                            sum++;
                            possible_count = 0;
                        }
                    }
                }
            }

            //infinite loop
            while(true){
                System.out.print("How many times do you want to roll the dice? ");
                int no_of_rolls = sc.nextInt();
                int[][] util_dice = new int[2][no_of_rolls];
                int[][] math_dice = new int[2][no_of_rolls];
                for(int i = 0; i < 2; i++){
                    for(int j = 0; j < no_of_rolls; j++){

                        //using two different methods to assign the values to rolled dice
                        util_dice[i][j] = rn.nextInt(no_of_sides) + 1;
                        math_dice[i][j] = (int)(Math.random() * no_of_sides + 1);
                    }
                }
                int[] sum_of_util_dice = new int[no_of_rolls];
                int[] sum_of_math_dice = new int[no_of_rolls];
                for(int k = 0; k < no_of_rolls; k++){

                    //calculating sum of digits on two different dice
                    sum_of_util_dice[k] = util_dice[0][k] + util_dice[1][k];
                    sum_of_math_dice[k] = math_dice[0][k] + math_dice[1][k];
                }
                System.out.println("\n   Sum    |      Should Occur      |       % Occurred       |       % Occurred");
                System.out.println("          |                        |     (util.Random)      |     (Math.Random)");
                System.out.println("----------|------------------------|------------------------|--------------------");

                //using loop to count the occurrence of each sum in array
                for(int i = 2; i <= no_of_sides * 2; i++){
                    int util_frequency = 0;
                    int math_frequency = 0;
                    for(int p = 0; p < no_of_rolls; p++){
                        if(sum_of_util_dice[p] == i){
                            util_frequency++;
                        }
                        if(sum_of_math_dice[p] == i){
                            math_frequency++;
                        }
                    }

                    //calculating the probabilities
                    Double should_occur = (double)possible_frequency[i - 2] * 100 / (no_of_sides * no_of_sides);
                    Double util_random_occurred = (double)util_frequency * 100 / no_of_rolls;
                    Double math_random_occurred = (double)math_frequency * 100 / no_of_rolls;

                    System.out.printf("  %3d     |    (%4d)%6.2f%%       |   (%7d)%6.2f%%     |   (%7d)%6.2f%% \n", i,
                            possible_frequency[i - 2], should_occur, util_frequency, util_random_occurred,
                            math_frequency, math_random_occurred);
                }

                sc.nextLine();
                System.out.println();
                System.out.print("Do you want to repeat with different number of rolls?(any character by y to quit) ");
                String input = sc.nextLine();
                if(!input.equals("y")){
                    System.out.println("\nBye, have a nice day! ＼( ･_･) ");
                    sc.close();
                    System.exit(0);
                }
            }
        }catch(Exception e){
            System.out.println("ERROR: Invalid Value, please try again.");
            System.out.print("\nPress Enter to Restart.");
            sc.nextLine();
            sc.nextLine();
            main(args);
        }
    }
}

//last modified December 20, 2020
