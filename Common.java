import java.util.Scanner;

public class Common
{
    public static void commonSubstring(String[] words, String temp, int index, int number)
    {
        if (temp.equals(""))
        {
            temp = words[index];
        }
        int m = temp.length();
        int n = words[index + 1].length();

        int max = 0;

        int[][] dp = new int[m][n];
        int endIndex = -1;
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (temp.charAt(i) == words[index + 1].charAt(j))
                {
                    if (i == 0 || j == 0)
                    {
                        dp[i][j] = 1;
                    } else
                    {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    }
                    if (max < dp[i][j])
                    {
                        max = dp[i][j];
                        endIndex = i;
                    }
                }
            }
        }

        temp = temp.substring(endIndex - max + 1, endIndex + 1);
        number--;
        if (number == 1 || temp.equals(""))
        {
            if (temp.equals(""))
            {
                temp = "No common substring found";
            }
            System.out.println("Longest common subString is: " + temp);
        } else
        {
            commonSubstring(words, temp, index + 1, number);
        }
    }

    public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("How many words do you want to compare: ");
            int no_of_words = sc.nextInt();
            String[] words = new String[no_of_words];
            sc.nextLine();
            for (int i = 0; i < no_of_words; i++)
            {
                System.out.print("word: ");
                words[i] = sc.nextLine();
            }
            commonSubstring(words, "", 0, no_of_words);
    }
}
