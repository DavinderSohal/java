/*
The number of stars for each mark depends on how many students received this marks.

output should be like:
0:****
1:****
2:*
3:**
4:
5:****
6:*
7:*
8:*
9:**

*/

import java.util.Random;

public class Activity_9{
    public static void main(String[] args){
        Random rn = new Random();
        int[] marks = new int[20];
        for(int i = 0; i < 20; i++){
            marks[i] = rn.nextInt(10);
        }
        System.out.println();
        for(int j = 0; j < 10; j++){
            StringBuilder count = new StringBuilder();
            for(int k = 0; k < 20; k++){
                if(marks[k] == j){
                    count.append("*");
                }
            }
            System.out.println(j + ":" + count);
        }
    }
}
