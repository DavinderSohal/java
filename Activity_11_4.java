import java.util.Scanner;

public class Activity_11_4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a #: ");
        int number = sc.nextInt();
        int first = 1;
        int second = 1;
        System.out.print(first + ", " + second);
        for(int i = 2; i < number; i++){
            int next = first + second;
            first = second;
            second = next;
            System.out.print(", " + next);
        }
        System.out.println();
    }
}