/*
1.	Read 2 numbers and multiply them together and display them
2.	Read one number and tell the use if the number equals to 5 or not
3.	Read a number.  If number is between 1 and 10, display blue, if between 10 and 20, display green, and otherwise
display incorrect value.
*/

import java.util.Scanner;

public class Activity_12_1{
    public static void main(String[] args){
        Scanner dc = new Scanner(System.in);
        System.out.println("Enter 2 number");
        int num1 = dc.nextInt();
        int num2 = dc.nextInt();
        System.out.println("multiplication: " + num1 * num2);
        System.out.println("Enter another number");
        int num3 = dc.nextInt();
        boolean s = false;
        if(num3 == 5){
            s = true;
        }
        System.out.println("Is " + num3 + " equal to 5? " + s);
        System.out.println("enter another #");
        int num4 = dc.nextInt();
        if(num4 > 1 && num4 < 10){
            System.out.println("blue");
        }else if(num4 > 10 && num4 < 20){
            System.out.println("green");
        }else{
            System.out.println("incorrect value");
        }
    }
}
