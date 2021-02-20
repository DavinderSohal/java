import java.util.Scanner;

public class Activity_12_2
{
    public static void main(String[] args)
    {
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
