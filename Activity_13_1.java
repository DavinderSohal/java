import java.util.Scanner;

public class Activity_13_1
{
    public static void main(String[] args)
    {
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
