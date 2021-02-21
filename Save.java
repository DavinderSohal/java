import java.util.Scanner;

public class Save{
    public static void getLongestCommonSubstring(String[] words, String common, int index, int number){
        if(common.equals("")){
            common = words[index];
        }
        int m = common.length();
        int n = words[index + 1].length();

        int max = 0;

        int[][] dp = new int[m][n];
        int endIndex = -1;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(common.charAt(i) == words[index + 1].charAt(j)){
                    if(i == 0 || j == 0){
                        dp[i][j] = 1;
                    }else{
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    }
                    if(max < dp[i][j]){
                        max = dp[i][j];
                        endIndex = i;
                    }
                }
            }
        }
        common = common.substring(endIndex - max + 1, endIndex + 1);
        number--;
        if(number == 1 || common.equals("")){
            if(common.equals("")){
                common = "No common substring found";
            }
            System.out.println("Longest common subString is: " + common);
        }else{
            getLongestCommonSubstring(words, common, index + 1, number);
        }
    }

    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("How many words do you want to compare?(at least 2) ");
            int no_of_words = sc.nextInt();
            while(no_of_words < 2){
                System.out.println("Invalid Input");
                System.out.print("How many words do you want to compare?(at least 2) ");
                no_of_words = sc.nextInt();
            }
            String[] words = new String[no_of_words];
            sc.nextLine();
            for(int i = 0; i < no_of_words; i++){
                System.out.print("word " + (i + 1) + ": ");
                words[i] = sc.nextLine();
            }
            getLongestCommonSubstring(words, "", 0, no_of_words);
        }catch(Exception e){
            System.out.println("ERROR: Invalid Input (enter only integer values)");
            main(args);
        }
    }
}
 