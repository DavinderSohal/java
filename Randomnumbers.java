import java.util.Scanner;

public class Randomnumbers{
    public static void main(String[] args){
        int n, i, j;

        Scanner ab = new Scanner(System.in);
        while(true){
            System.out.println("\nHow many number of sides that you want in your dice");
            n = ab.nextInt();
            int[][] numbers = new int[n + 1][n + 1];
            System.out.println("How many times you want to roll the dice");
            int dice = ab.nextInt();
            int max, min = 2;
            int random;
            for(i = 1; i < numbers.length; i++){
                for(j = 1; j < numbers[i].length; j++){

                    int sum = i + j;
                    numbers[i - 1][j - 1] = sum;
                    System.out.print(numbers[i - 1][j - 1]);

                }
                System.out.println(" ");
            }
            int sum = 2;
            int num = 0;
            int count = 0;
            for(i = 0; i <= ((numbers.length - 1) * 2 - 1) * (numbers.length - 1); i++){
                for(j = 0; j < numbers[num].length - 1; j++){
                    if(numbers[num][j] == sum){
                        count++;
                    }
                }
                if(j == numbers[num].length - 1){
                    num++;
                }
                if(i != 0){
                    if(i % (numbers.length - 1) == 0){
                        System.out.println("##########");
                        System.out.println("ss>>>>>>>>" + sum);
                        System.out.println("count ===============>>" + count);
                        num = 0;
                        sum++;
                        count = 0;
                    }
                }
            }
            //  for(i=1;i<=dice;i++)
            //{

            //random=(int) (Math.random()*((n*2)-min));
            //         System.out.println(random);
            //   }
        }
    }
}
