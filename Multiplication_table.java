import java.util.Scanner;

public class Multiplication_table{
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the value of n: ");
        n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.print("\t\t" + i);
        }

        System.out.println();
        for(int i = 0; i < n * 8.3; i++){
            System.out.print("-");
        }
        System.out.println();
        for(int i = 1; i <= n; i++){
            System.out.print(i + "|");

            for(int j = 1; j <= n; j++){
                System.out.print("\t");

                if(j == i){
                    System.out.print("\t" + "*");
                }else{
                    System.out.print("\t" + i * j);
                }

            }
            System.out.println();
        }
    }


}
