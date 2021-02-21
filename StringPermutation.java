// -----------------------------------------------------
// Assignment # 3 (Project)
// Question Five: String Permutation
// This program ask the user to enter a string and then displays all its possible permutations
// -----------------------------------------------------

import java.util.Scanner;

public class StringPermutation
{
    public static void permutation(String word, String perm, int num)
    {
        //termination condition
        if(word.isEmpty()){
            if(num == 0){
                System.out.print(perm + word);
            }else{
                System.out.print(", " + perm + word);
            }
        }else{
            for(int i = 0; i < word.length(); i++){
                if(i == 1){
                    num = 1;
                }
                //recursive call
                permutation((word.substring(0, i) + word.substring(i + 1)), (perm + word.charAt(i)), num);
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a String");
        System.out.print("Your input is: ");
        String s = sc.next();
        System.out.printf("Permutation for %s: ", s);

        //calling permutation method
        permutation(s, "", 0);
        System.out.println();
    }
}

// last modified January 8,2021


