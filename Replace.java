// -----------------------------------------------------
// Activity 6
// Written by: Davinder Singh (2092836)
// this program take string input from user and replace all "a","e" and "i" with "*"
// -----------------------------------------------------

import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //create scanner object
        System.out.println("Enter a line of text"); // display a message
        String text = sc.nextLine(); // read user input
        String finalText = ""; // empty string
        for(int i = 0; i < text.length(); i++) //loop
        {
            String textSubstring = text.substring(i, i + 1); //using substring to check single char.
            if(textSubstring.equals("a") || textSubstring.equals("e") || textSubstring.equals("i")) //checking
            // whether string have a, e or i in it
            {
                finalText += "*"; //replace with *
            }else {
                finalText += textSubstring; // no change
            }
        }
        System.out.println(finalText); //print final string
        sc.close(); //terminate scanner object
    }
}
