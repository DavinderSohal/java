
/*import java.util.Scanner;
public class jasspash {

    public static void main(String[] args) {
        //      Creates a scanner
        Scanner sc = new Scanner(System.in);
        boolean valid = false;
        String password;

        do { // start a loop
            //      Asks user to enter password
            System.out.print("Please enter password and then hit enter:");
            password = sc.nextLine();

            //      Checks to see if password is at least 10 characters.
            if (password.length()<10)
            {
                valid = false;
                System.out.println("Password must have at least 10 characters");
                continue; // skip to next iteration
            }

            //      Checks each character to see if it is acceptable.
            for (int i = 0; i < password.length(); i++){
                char c = password.charAt(i);

                if (       ('a' <= c && c <= 'z') // Checks if it is a lower case letter
                        || ('A' <= c && c <= 'Z') //Checks if it is an upper case letter
                        || ('0' <= c && c <= '9') //Checks to see if it is a digit
                   )
                {

                    valid = true;
                }
                else
                {
                    // tells the user that only letters & digits are allowed
                    System.out.println("Only letter & digits and special characters are acceptable.");
                    valid = false;
                    break;
                }

            }
        } while(!valid); // verify if the password is valid, if not repeat the process

        // if the password is valid, tell the user it's accepted
        System.out.println("Password Accepted");
    }


}*/
import java.util.Random;

public class jasspash{
    public static void main(String[] args) {
        System.out.println(generatePassword(8));
    }

    private static char[] generatePassword(int length) {
        String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String specialCharacters = "!@#$";
        String numbers = "1234567890";
        String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
        Random random = new Random();
        char[] password = new char[length];

        password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
        password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
        password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
        password[3] = numbers.charAt(random.nextInt(numbers.length()));

        for(int i = 4; i< length ; i++) {
            password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
        }
        return password;
    }
}