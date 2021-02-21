// -----------------------------------------------------
// Activity 6
// this program reverse whole string
// Write a program to reverse the words of a given line of text. You can assume the words are separated by one space
// character. Make the program: (2 points):
//
// - Using a while or for loop (choose one only)
//
// For example, if the user entered “My name is Jane”, your program should display, “Jane is name My”. You must
// include one of each type (using a for loop and using a while loop). You may not use StringBuilder in your solution.
// -----------------------------------------------------

import java.util.Scanner;

public class Reverse{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in); //scanner object
        System.out.println("Enter line of string");
        String text = sc.nextLine();//read input
        String finalText = "";

        for(int i = 0; i < text.length(); i++){
            String word = "";
            while(i < text.length() && text.charAt(i) != ' '){
                word += text.charAt(i);
                i++;
            }
            finalText = word + " " + finalText;
        }
        System.out.println(finalText);
    }
}