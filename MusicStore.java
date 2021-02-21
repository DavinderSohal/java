/*
An online music and apps store offers all apps for 3$ each and all songs for 7$ each. The store requires members to
prepay any amount of money they wish, and then download as many apps or as many songs accordingly. You are required
to write a program that would ask the user for the amount that he/she will pay, then display two messages indicating:

-the maximum number of apps that can be downloaded, and how much funds will remain in the account after that, if any.
-the maximum number of songs that can be downloaded, the number of apps that can be downloaded after that if funds
allow, and how much funds will remain in the account after that, if any.
Notice the parenthesis in app(s) and song(s) in the output.

For this assignment, assume that the user will always enter a valid integer value that is >= 0, and within the limit
of the integer range.
*/

import java.util.Scanner;

public class MusicStore{
    public static void main(String[] args){
        int amount, balance, apps, songs, balance1;
        Scanner sc = new Scanner(System.in);
        System.out.print("How much money do you wish to prepay?");
        amount = sc.nextInt();
        apps = amount / 3;
        balance = amount % 3;
        System.out.println("With this amount, you will be able to purchase " + apps + " app(s). You will then have " + balance +
                "$ credit on your account. ");
        songs = amount / 7;
        balance = amount % 7;
        apps = balance / 3;
        balance1 = balance % 3;
        System.out.print("Alternatively, for this amount, you will be able to purchase " + songs + " song(s) and " + apps + " app(s). " +
                "You will then have " + balance1 + "$ left as a credit on your account. ");

    }
}
