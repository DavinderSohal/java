import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        int i, n;
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter the number of combination(number>1)");
        n = ab.nextInt();
        String[] a;
        String b = " ";
        a = new String[n];
        System.out.println("Enter the string you want to compare");
        for(i = 0; i < n; i++) {
            a[i] = ab.next();
        }
        for(i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length(); j++) {
                if(a[i].charAt(j) == a[i + 1].charAt(j)) {
                    b = Character.toString(a[i].charAt(j));
                    System.out.print(b);
                }

            }
        }


    }
}
