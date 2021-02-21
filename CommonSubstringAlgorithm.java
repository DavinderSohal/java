// -----------------------------------------------------
// Assignment # 3 (Project)
// Question Four: Common Substring Algorithm
// This program ask the user to enter some strings(more than 2) and then finds the common substring among them
// -----------------------------------------|------------

/*
Write a program that will find the longest common substring from a series of two to many words given to you by the
user. For example, your program will ask the user how many words he/she wants to compare, with two being the minimum
input. The longest common substring of the strings “QWERTY”, “TEWERU”, “YWERQT” is WER. Your algorithm should work
for any number of inputs (words), if there is no match of common substrings, indicate to the user with a message. A
common algorithm to follow when making this program is first to prompt the user for how many words he/she wants to
compare (check for valid input of a number 2 to ‘n’) and then prompt the user for the strings (words) and following
this return the common substring if one is present.
*/

import java.util.Scanner;

public class CommonSubstringAlgorithm{
    //created function named commonSubstring
    public static void commonSubstring(String[] words, String common, int index, int number){
        if(common.equals("")){
            common = words[index];
        }
        int m = common.length();
        int n = words[index + 1].length();

        int max = 0;

        //array dp will store the number of common characters
        //endIndex will have the value of position of last common character
        int[][] dp = new int[m][n];
        int endIndex = -1;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(common.charAt(i) == words[index + 1].charAt(j)){
                    if(i == 0 || j == 0){
                        dp[i][j] = 1;
                    }else{
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    }
                    if(max < dp[i][j]){
                        max = dp[i][j];
                        endIndex = i;
                    }
                }
            }
        }

        //extracting the common substring from the provided strings
        common = common.substring(endIndex - max + 1, endIndex + 1);
        number--;
        if(number == 1 || common.equals("")){
            if(common.equals("")){
                common = "\"No common substring found :(\"";
            }
            System.out.println("Longest common subString is: " + common);
        }else{
            //recursive call the the function to compare the next set of strings
            commonSubstring(words, common, index + 1, number);
        }
    }

    public static void main(String[] args){
        //try and catch to handle exceptions
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("\nHow many words do you want to compare?(at least 2) ");
            int no_of_words = sc.nextInt();
            while(no_of_words < 2){
                System.out.println("*** Invalid Input: enter value more than 2 ***");
                System.out.print("\nHow many words do you want to compare?(at least 2) ");
                no_of_words = sc.nextInt();
            }
            String[] words = new String[no_of_words];
            sc.nextLine();
            for(int i = 0; i < no_of_words; i++){
                System.out.print("word " + (i + 1) + ": ");
                words[i] = sc.nextLine();
            }
            //making call to commonSubstring function
            commonSubstring(words, "", 0, no_of_words);
        }catch(Exception e){
            System.out.println("*** ERROR: Invalid Input (enter only integer values) ***");
            main(args);
        }
    }
}

// last modified January 8,2021
