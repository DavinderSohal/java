import java.util.Scanner;

public class pppp{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //displaying conditions to the user
        System.out.println("\n1. A password must have at least ten characters.\n" +
                "2. A password consists of only letters and digits.\n" +
                "3. A password must contain at least two digits.\n");
        System.out.print("Please enter a password (should follow all the above mentioned conditions): ");
        String password = sc.nextLine();
        String symbol = "~!@#$%^&*()_+`=-|}{[];:',./<>?\"\\";
        String digits = "0123456789";
        int upper = 0;
        int space = 0;
        int special = 0;
        int number = 0;
        if(password.length() > 9){
            for(int i = 0; i < password.length(); i++){
                if(Character.isUpperCase(password.charAt(i))){
                    upper++;
                }
                if(password.charAt(i) == ' '){
                    space++;
                }
                for(int j = 0; j < symbol.length(); j++){
                    if(password.charAt(i) == symbol.charAt(j)){
                        special++;
                    }
                }
                for(int j = 0; j < digits.length(); j++){
                    if(password.charAt(i) == digits.charAt(j)){
                        number++;
                    }
                }
            }
        }
        while(upper == 0 || space > 0 || special > 0 || number < 2){
            System.out.println("***  Password entered does not meet all the requirements, please try again  ***\n");
            System.out.print("Please enter a password (should follow all the above mentioned conditions): ");
            password = sc.nextLine();
            upper = 0;
            space = 0;
            special = 0;
            number = 0;
            if(password.length() > 9){
                for(int i = 0; i < password.length(); i++){
                    if(Character.isUpperCase(password.charAt(i))){
                        upper++;
                    }
                    if(password.charAt(i) == ' '){
                        space++;
                    }
                    for(int j = 0; j < symbol.length(); j++){
                        if(password.charAt(i) == symbol.charAt(j)){
                            special++;
                        }
                    }
                    for(int j = 0; j < digits.length(); j++){
                        if(password.charAt(i) == digits.charAt(j)){
                            number++;
                        }
                    }
                }
            }
        }
        System.out.println("\nYour password is valid: " + password);
    }
}

