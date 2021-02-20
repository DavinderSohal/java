import java.util.Scanner;

public class Fibonacci_M {
    static int fibMemo[];

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any value");
        int num = sc.nextInt();
        int fibSeriesRec[] = fibByRec(num);

        for (int i = 0; i < fibSeriesRec.length; i++) {
            if(fibSeriesRec[i]%2==0)
            System.out.print(fibSeriesRec[i] + " ");
            else
                System.out.print(fibSeriesRec[i] + " ");
        }
    }

    public static int[] fibByRec(int num) {
        int fib[] = new int[num];

        for (int i = 0; i < num; i++) {
            fib[i] = fibRec(i);
        }

        return fib;
    }

    public static int fibRec(int num) {
        if (num == 0) {
            return 0;
        } else if (num == 1 || num == 2) {
            return 1;
        } else {
            return fibRec(num - 1) + fibRec(num - 2);
        }
    }

    public static int[] fib(int num) {
        int fibSum[] = new int[num];
        for (int i = 0; i < num; i++) {
            if (i == 0) {
                fibSum[i] = i;
                continue;
            }

            if (i == 1 || i == 2) {
                fibSum[i] = 1;
                continue;
            }

            fibSum[i] = fibSum[i - 1] + fibSum[i - 2];
        }
        return fibSum;
    }

}
