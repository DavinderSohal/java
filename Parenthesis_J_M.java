import java.util.Scanner;

public class Parenthesis_J_M{

    public static void Validparentheses(int openP, int closeP, String string){
        if(openP == 0 && closeP == 0) // mean all opening and closing in
        {
            System.out.print(string + ',');
        }
        if(openP > closeP) // means closing parentheses is more than open ones
        {
            return;
        }
        if(openP > 0){
            Validparentheses(openP - 1, closeP, string + "("); // put ( and
        }
        if(closeP > 0){
            Validparentheses(openP, closeP - 1, string + ")"); // put ) and
        }
    }

    public static void printParentheses(int n){
        Validparentheses(2 * n / 2, 2 * n / 2, "");
    }

    public static void main(String[] args){
        // TODO Auto-generated method stub
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the value of n: ");
        n = sc.nextInt();
        // char[] str = new char[2 * n];
        printParentheses(n);
    }
}