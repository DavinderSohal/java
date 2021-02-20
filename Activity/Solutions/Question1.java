import java.util.*;  

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Please enter a line of text:");  
        String inputString= sc.nextLine(); 
        String result = "";
        for(int i=0; i<inputString.length(); i++){
            char c = inputString.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i'){
                result += '*';
            }else{
                result += c;
            }
        }
        System.out.println(result);
    }
}