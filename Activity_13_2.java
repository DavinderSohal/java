import java.util.Scanner;

public class Activity_13_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int biggest = 0;
        for(int x = 1; x <= 7; x++){
            System.out.print("Enter # " + x + " ");
            int num = sc.nextInt();
            if(num > biggest){
                biggest = num;
            }
        }
        System.out.println("The biggest number is " + biggest);
    }
}
