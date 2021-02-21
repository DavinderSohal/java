/*
	We need to create a calculator for a ticket system (music show)
	Children and adults are invited to this show
	We want to system to calculate the total amount that must be paid for each family.
	Ticket prices
o	For an adult:	30$
o	For a children:	15$
	There are sales taxes that needs to be calculated for this sale
o	GST (Goods and services tax):	5%
o	QST (Quebec sales tax):	9.975%

How the program should interact with the user:

How many adults? 	__ 		 user inputs the number of adults
How many kids?	   	__		 user inputs the number of kids
Total:		   ________		 Software outputs total before tax
GST:		   ________		 Software outputs the GST total
QST:		   ________		 Software outputs the QST total
Please pay:
*/

import java.util.Scanner;

public class Activity_12_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many adults? ");
        int adults = sc.nextInt();
        System.out.print("How many kids? ");
        int kids = sc.nextInt();
        int total = (adults * 30) + (kids * 15);
        double gst = (double)total / 20;
        double qst = (total * 9.975) / 100;
        System.out.print("Total: " + total);
        System.out.printf("\nGST: %.2f", gst);
        System.out.printf("\nQST: %.2f", qst);
        System.out.printf("\nPlease pay: %.2f", total + gst + qst);
    }
}
