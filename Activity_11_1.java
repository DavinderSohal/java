import java.util.Scanner;

public class Activity_11_1
{
    public static void getSmallLargeAverage(int no_1, int no_2, int no_3)
    {
        double average = (double)(no_1 + no_2 + no_3) / 3;
        int smallest = Math.min(Math.min(no_1, no_2), no_3);
        int largest = Math.max(Math.max(no_1, no_2), no_3);
        System.out.println("Smallest number: " + smallest);
        System.out.println("largest number: " + largest);
        System.out.printf("Average: %.2f", average);
    }

    public static void main(String[] args)
    {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter # 1: ");
            int no_1 = sc.nextInt();
            System.out.print("Enter # 2: ");
            int no_2 = sc.nextInt();
            System.out.print("Enter # 3: ");
            int no_3 = sc.nextInt();
            getSmallLargeAverage(no_1, no_2, no_3);
        }catch(Exception e){
            System.out.println("**** ERROR: Invalid value ****");
            main(args);
        }
    }
}
