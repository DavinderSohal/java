import java.util.Scanner;

public class NewTest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        for(int i = 1; i <= size; i++){
            System.out.printf("please enter number %d: ", i);
            numbers[i - 1] = sc.nextInt();
        }
        int sum = 0;
        for(double element : numbers){
            if(element % 2 == 0 && element % 3 != 0){
                sum += element;
            }
        }
        System.out.println("\nThe sum of numbers divisible by 2 but not by 3 is: " + sum);
    }
}
