/*Activity # 8
Written by: Davinder Singh (2092836)
This program is made for understanding the concept of Arrays in Java.
Write one program that will use all of the six array algorithms above. Your program should implement a menu with a
choice of options for the user to choose from. For each menu item ask the user to input either the size of array
and/or to populate an array with numbers. This will vary for each menu field, for instance when your program loads it
 should look similar to the below example but does not have to be identical to it:
            1. Create Random Array
            2. Print Array
            3. Find Maximum Number in Array
            4. Compute the Average of an Array
            5. Reverse the values of an Array
            6. Copy one array to another
            7. Exit Program

Your program should loop until the user to decides to quit the program. When entering one of the choices the program
should prompt the user for either an array size, array values or an additional array to be copied to another (option
six).

In option six ask the user for a number and create two arrays of the same size, then ask the user to input values and
 implement a check to see if the values are the same as the other array. If the values are the same, do not accept
 them and continue to prompt the user until the inputs are of different numbers. If the numbers are not the same then
  the program should copy the values of the first array to the second one.
*/

import java.util.Scanner;

public class Activity_8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for(; ; ){
            System.out.println("\n----------------------------------------------------------------------------------");
            System.out.println("\t\tArray Menu\n");
            System.out.println("1. Create Random Array");
            System.out.println("2. Print Array");
            System.out.println("3. Find Maximum Number in Array");
            System.out.println("4. Compute the Average of an Array");
            System.out.println("5. Reverse the values of an Array");
            System.out.println("6. Copy one array to another");
            System.out.println("7. Exit Program");
            System.out.print("\nEnter your choice: ");
            int choice = sc.nextInt();
            if(choice < 1 || choice > 7){
                System.out.println("ERROR: Invalid input. Please enter value from 1 to 7 only.");
                System.out.print("\n\nPress Enter to continue..... ");
                sc.nextLine();
                sc.nextLine();
                continue;
            }else if(choice == 7){
                System.out.println("Bye!!");
                sc.close();
                System.exit(0);
            }
            double[] array;
            switch(choice){
                case 1:{
                    System.out.print("Enter the size of Array: ");
                    int size = sc.nextInt();
                    array = new double[size];
                    System.out.println("\nYour Random Array: \n");
                    for(int i = 0; i < size; i++){
                        array[i] = Math.random();
                        System.out.println(array[i]);
                    }
                }
                break;
                case 2:{
                    System.out.print("Enter the size of Array: ");
                    int size = sc.nextInt();
                    array = new double[size];
                    System.out.println("\nEnter Array Values: ");
                    for(int i = 0; i < size; i++){
                        System.out.print("Element " + i + ": ");
                        array[i] = sc.nextDouble();
                    }
                    System.out.println("\nYour Array: ");
                    for(int i = 0; i < size; i++){
                        System.out.println(array[i]);
                    }
                }
                break;
                case 3:{
                    System.out.print("Enter the size of Array: ");
                    int size = sc.nextInt();
                    array = new double[size];
                    double max = Double.NEGATIVE_INFINITY;
                    System.out.println("\nEnter Array Values: ");
                    for(int i = 0; i < size; i++){
                        System.out.print("Element " + i + ": ");
                        array[i] = sc.nextDouble();
                        if(array[i] > max){
                            max = array[i];
                        }
                    }
                    System.out.println("\nMaximum number in array: " + max);
                }
                break;
                case 4:{
                    System.out.print("Enter the size of Array: ");
                    int size = sc.nextInt();
                    array = new double[size];
                    double sum = 0.0;
                    System.out.println("\nEnter Array Values: ");
                    for(int i = 0; i < size; i++){
                        System.out.print("Element " + i + ": ");
                        array[i] = sc.nextDouble();
                        sum += array[i];
                    }
                    double average = sum / size;
                    System.out.println("\nAverage of the Array: " + average);
                }
                break;
                case 5:{
                    System.out.print("Enter the size of Array: ");
                    int size = sc.nextInt();
                    array = new double[size];
                    System.out.println("\nEnter Array Values: ");
                    for(int i = 0; i < size; i++){
                        System.out.print("Element " + i + ": ");
                        array[i] = sc.nextDouble();
                    }
                    System.out.println("\nOriginal Array: ");
                    for(int i = 0; i < size; i++){
                        System.out.println(array[i]);
                    }
                    for(int i = 0; i < size / 2; i++){
                        double temp = array[i];
                        array[i] = array[size - 1 - i];
                        array[size - 1 - i] = temp;
                    }
                    System.out.println("\nReversed Array: ");
                    for(int i = 0; i < size; i++){
                        System.out.println(array[i]);
                    }
                }
                break;
                case 6:{
                    System.out.print("Enter the size of Array: ");
                    int size = sc.nextInt();
                    array = new double[size];
                    double[] array2 = new double[size];
                    System.out.println("\nEnter Values for 1st Array: ");
                    for(int i = 0; i < size; i++){
                        System.out.print("Element " + i + ": ");
                        array[i] = sc.nextDouble();
                    }
                    System.out.println("\nEnter Values for 2nd Array(different from 1st array): ");
                    for(int i = 0; i < size; i++){
                        System.out.print("Element " + i + ": ");
                        array2[i] = sc.nextDouble();
                        while(array2[i] == array[i]){
                            System.out.println("Enter value different from 1st Array");
                            System.out.print("Element " + i + ": ");
                            array2[i] = sc.nextDouble();
                        }
                    }
                    System.out.println("\n1st Array: ");
                    for(int i = 0; i < size; i++){
                        System.out.println(array[i]);
                    }
                    System.out.println("\n2nd Array(Before copying): ");
                    for(int i = 0; i < size; i++){
                        System.out.println(array2[i]);
                    }
                    for(int i = 0; i < size; i++){
                        array2[i] = array[i];
                    }
                    System.out.println("\n2nd Array(After copying): ");
                    for(int i = 0; i < size; i++){
                        System.out.println(array2[i]);
                    }
                }
                break;
            }
            System.out.print("\n\nPress Enter to continue..... ");
            sc.nextLine();
            sc.nextLine();
        }
    }
}
