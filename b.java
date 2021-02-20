//side of die is 4
import java.util.Random;
import java.util.Scanner;

public class b
{
    public static void main(String args[])
    {
            int i,j,util;
            Random random = new Random();
            System.out.print("How many times do you want to roll dice ? ");
            Scanner sc=new Scanner(System.in);
            int time = sc.nextInt();
            int[] a=new int[time];
            int[] b=new int[time];
            for (i = 0; i < time; i++)
            {
                a[i] = random.nextInt(6);
                b[i] = random.nextInt(6);
            }
            System.out.println("Sum      utilrandom");
            for (i = 2; i < 9; i++)
            {
                util=0;
                for (j = 0; j < time; j++)
                {
                    if (a[j] + b[j] == i) {
                        util = util + 1;
                    }
                }
                System.out.println(i+"          ( "+util+")");
            }
    }
}
