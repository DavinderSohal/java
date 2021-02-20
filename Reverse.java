// -----------------------------------------------------
// Activity 6
// Written by: Davinder Singh (2092836)
// this program reverse whole string
// -----------------------------------------------------

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //scanner object
        System.out.println("Enter line of string");
        String text = sc.nextLine();//read input
        String finalText = "";

        for(int i = 0; i < text.length(); i++) {
            String word = "";
            while(i < text.length() && text.charAt(i) != ' ') {
                word += text.charAt(i);
                i++;
            }
            finalText = word + " " + finalText;
        }
        System.out.println(finalText);
    }
}