import java.util.Scanner;

public class MusicStore {
    public static void main(String[] args) {
        int amount, balance, apps, songs, balance1;
        Scanner sc = new Scanner(System.in);
        System.out.print("How much money do you wish to prepay?");
        amount = sc.nextInt();
        apps = amount / 3;
        balance = amount % 3;
        System.out.println("With this amount, you will be able to purchase " + apps + " app(s). You will then have " + balance +
                "$ credit on your account. ");
        songs = amount / 7;
        balance = amount % 7;
        apps = balance / 3;
        balance1 = balance % 3;
        System.out.print("Alternatively, for this amount, you will be able to purchase " + songs + " song(s) and " + apps + " app(s). " +
                "You will then have " + balance1 + "$ left as a credit on your account. ");

    }
}
