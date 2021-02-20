
import java.util.Scanner;
import java.util.Random;

public class Random_numbers
{
    public static void main(String[] args)
    {
        Scanner ab = new Scanner(System.in);
        Random k = new Random();

        int n, i, j, a;
        System.out.println("*********************************************");
        System.out.println("%-------S I M R A N J I T-----K A U R-------%");
        System.out.println("%                                           %");
        System.out.println("%  How good is the Random Number Generator  %");
        System.out.println("%                                           %");
        System.out.println("%-----------------2 0 9 2 8-----------------%");
        System.out.print("\nHow many number of sides that you want in your dice ");
        n = ab.nextInt();

        while(true)
        {
            System.out.print("How many times you want to roll the dice ");
            int dice = ab.nextInt();

            int[][] numbers = new int[n + 1][n + 1];
            int[][] random = new int[2][dice];
            int[][] maths_random = new int[2][dice];
            int[] count_random = new int[dice];
            int[] sum_random = new int[dice];
            double[] pro = new double[(n * 2) - 1];

            for(i = 1; i < numbers.length; i++)
            {
                for(j = 1; j < numbers[i].length; j++)
                {
                    int sum = i + j;
                    numbers[i - 1][j - 1] = sum;
                }
            }
            int sum = 2;
            int num = 0;
            int count = 0;
            for(i = 0; i <= ((numbers.length - 1) * 2 - 1) * (numbers.length - 1); i++)
            {
                for(j = 0; j < numbers[num].length - 1; j++)
                {
                    if(numbers[num][j] == sum)
                    {
                        count++;
                    }
                }
                if(j == numbers[num].length - 1)
                {
                    num++;
                }
                if(i != 0)
                {
                    if(i % (numbers.length - 1) == 0)
                    {
                        double add = (double) (count) * 100;
                        pro[sum - 2] = (add / (n * n));
                        num = 0;
                        sum++;
                        count = 0;
                    }
                }
            }
            for(i = 0; i < random.length; i++)
            {
                for(j = 0; j < random[i].length; j++)
                {
                    random[i][j] = k.nextInt(n) + 1;
                    maths_random[i][j] = (int) (Math.random() * n + 1);
                }
            }
            for(a = 0; a < dice; a++)
            {
                count_random[a] = random[0][a] + random[1][a];
                sum_random[a] = maths_random[0][a] + maths_random[1][a];
            }
            int s = 2;
            int random_count = 0;
            int math_count = 0;
            double[] frequency = new double[n * 2 - 1];
            double[] maths_frequency = new double[n * 2 - 1];
            System.out.println("\n   Sum    |      Should Occur      |       % Occurred       |       % Occurred");
            System.out.println("          |                        |     (util.Random)      |     (Math.Random)");
            System.out.println("----------|------------------------|------------------------|--------------------");

            num = 1;
            for(a = 0; a < n * 2 - 1; a++)
            {
                for(int l = 0; l < dice; l++)
                {
                    if(count_random[l] == s)
                    {
                        random_count++;
                    }
                    if(sum_random[l] == s)
                    {
                        math_count++;
                    }
                }
                s++;
                frequency[a] = (double) (random_count * 100) / dice;
                maths_frequency[a] = (double) (math_count * 100) / dice;
                System.out.printf("  %3d     |    (%4d)%6.2f%%       |   (%7d)%6.2f%%     |   (%7d)%6.2f%% \n", a + 2,
                        num, pro[a], random_count, frequency[a], math_count, maths_frequency[a]);
                if(a < n - 1)
                {
                    num++;
                } else
                {
                    num--;
                }
                random_count = 0;
                math_count = 0;
            }
            ab.nextLine();
            System.out.print("\nDo you want to repeat with different number of rolls?(any character by y to quit) ");
            String input = ab.nextLine();
            if(!input.equals("y"))
            {
                System.out.println("\nThank you for using the Random Generator Tester application");
                ab.close();
                System.exit(0);
            }
        }
    }
}