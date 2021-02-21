/*
Create a separate class for the following program. Assume you have 3 integer variables num1, num2 and  num3 which
have been declared and initialized. Write the necessary statements to swap the content of num3 into num2, num1 into
num3 and num2 into num1. It should work no matter what values are stored in the three variables.
*/

public class SwapNumbers{
    public static void main(String[] args){
        int num1 = 11;
        int num2 = 22;
        int num3 = 33;
        int temp;
        System.out.println("before swapping");
        System.out.println("num1 =" + num1);
        System.out.println("num2 =" + num2);
        System.out.println("num3 =" + num3);
        temp = num1;
        num1 = num2;
        num2 = num3;
        num3 = temp;
        System.out.println("After swapping");
        System.out.println("num1 =" + num1);
        System.out.println("num2 =" + num2);
        System.out.println("num3 =" + num3);
    }
}
