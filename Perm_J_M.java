import java.util.Scanner;

public class Perm_J_M
{
    public static void permutation(String word, String perm)
    {
        if(word.isEmpty()){
                System.out.print(perm + word+", ");
        }else{
            for(int i = 0; i < word.length(); i++){
                permutation((word.substring(0, i) + word.substring(i + 1)), (perm + word.charAt(i)));
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.next();
        System.out.print("Permutation: ");
        permutation(s, "");
    }
}
