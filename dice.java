//--------------------------------------------------------------------------------------------
// Assignment # 2
// Written by: Maria Joseph Kumar Nagothu (2093014)
// This coding is done with 2d arrays to calculate the probability of occurrences of when two dice are rolled. The sum
// of the values gets stored in the matrix and later a table of probabilities is displayed
//------------------------------------------------------------------------------------------------

import java.util.Random;
import java.util.Scanner;

public class dice{
    public static void main(String[] args){
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("%-0-1-2-3-4-5-6-7-8-9-0-1-2-3-4-5-6-7-8-9-0-%");
        System.out.println("%                                           %");
        System.out.println("%   Welcome to the Random Number Generator  %");
        System.out.println("%                                           %");
        System.out.println("%-0-1-2-3-4-5-6-7-8-9-0-1-2-3-4-5-6-7-8-9-0-%");
        System.out.print("\n" + "What is the number of sides of each die? ");
        int noOfSides = sc.nextInt();
        int min = 1;
        int range = noOfSides - min + 1;
        int[][] frequency = new int[2 * noOfSides + 1][2];  //Two-Dimensional array to store frequencies of occurrence.
        String s;
        do{
            System.out.print("How many times do you want to roll dice? ");
            int noOfTimes = sc.nextInt();
            for(int i = 0; i < 2 * noOfSides + 1; i++){
                for(int j = 0; j < 2; j++){
                    frequency[i][j] = 0;
                }
            }
            for(int i = 0; i < noOfTimes; i++){

                //getting random values for the dice
                int dice1_math = (int)(Math.random() * range) + min;
                int dice2_math = (int)(Math.random() * range) + min;
                int dice1_util = (int)(ran.nextDouble() * range) + min;
                int dice2_util = (int)(ran.nextDouble() * range) + min;
                frequency[dice1_util + dice2_util][0]++;
                frequency[dice1_math + dice2_math][1]++;
            }
            System.out.println();
            System.out.println("Sum" + "\t\t\t" + "Should Occur" + "\t\t\t" + "%Occurred" + "\t\t\t" + "%Occurred");
            System.out.println("\t\t\t\t\t\t\t\t\t" + "(Util.Random)" + "\t\t" + "(Math.Random)");
            System.out.println("-----------------------------------------------------------------------------");

            for(int i = 2; i < 2 * noOfSides + 1; i++){

                //calculating probabilities
                double probForUtilRandom = frequency[i][0] * 100f / noOfTimes;
                double probForMathRandom = frequency[i][1] * 100f / noOfTimes;

                int freq = 0;
                if(i > noOfSides){
                    freq = 2 * noOfSides - i + 1;
                }else{
                    freq = i - 1;
                }
                double probForOccurrence = freq * 100f / (noOfSides * noOfSides);
                System.out.print(i + "\t\t\t");
                System.out.printf("(%5d) %5s", freq, Math.round(probForOccurrence * 100.0) / 100.0 + "%" + "\t\t\t");
                System.out.printf("(%5d) %5s", frequency[i][0], Math.round(probForUtilRandom * 100.0) / 100.0 + "%" +
                        "\t\t");
                System.out.println("(" + frequency[i][1] + ")" + Math.round(probForMathRandom * 100.0) / 100.0 + "%");
            }
            System.out.print("\nDo you want to repeat with different number of rolls? (any character by y to quit) ");
            s = sc.next();
        }while(s.equalsIgnoreCase("Y"));
        System.out.println("\n" + "Thank you for using the Random Number Generator Tester Application.");
    }
}
