import java.util.Scanner;

public class ArrayLoops{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        int sum = 0;
        System.out.println();
        for(int i = 0; i < size; i++){
            System.out.print("enter element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
            if(array[i] % 2 == 0 && array[i] % 3 != 0){
                sum += array[i];
            }
        }
        System.out.println("Sum: " + sum);
    }
}
