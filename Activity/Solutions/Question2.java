import java.util.*;  

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); 
        String s= sc.nextLine(); 
        String result = "";
        int i = 0;
        for(i=0; i<s.length(); i++){
            String word = "";
            while(i<s.length() && s.charAt(i) != ' '){
                word += s.charAt(i);
                i++;
            }
            result = word + " " + result;
        }
        System.out.println(result);
    }
}