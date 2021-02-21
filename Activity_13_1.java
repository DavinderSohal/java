/*
	We want to calculate the perimeter of an irregular shape.
	The program must ask the length of each segment in cm.
	Then the program will give the total perimeter in cm for this shape.
	The program can have a maximum of 3 variables.
*/

import java.util.Scanner;

public class Activity_13_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int total = 0;
        for(int x = 1; x <= 4; x++){
            System.out.print("Length of segment " + x + "?");
            int length = sc.nextInt();
            total += length;
        }
        System.out.print("\nPerimeter (in cm) " + total);
    }
}
