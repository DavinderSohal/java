import java.util.Scanner;

class PatternM{
    public static void main(String[] args){
        System.out.println("\n----Welcome to My Assignment----");
        int i, j, space, choice, rows;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Which pattern do you want to print?");
            System.out.println("1)54321     2)    1     3)12345     4)  1   ");
            System.out.println("  5432           12        2345        123  ");
            System.out.println("  543           123         345       12345 ");
            System.out.println("  54           1234          45        123  ");
            System.out.println("  5           12345           5         1   ");
            System.out.print("Enter your choice (5 to Quit) : ");

            choice = sc.nextInt();

            if(choice < 1 || choice > 5){
                System.out.println("Incorrect value");
                System.out.print("enter a number between 1 and 5(inclusive)\n");
                continue;
            }else if(choice == 5){
                System.out.println("Hope ypu enjoyed.");
                sc.close();
                System.exit(0);
            }

            System.out.print("Please enter number of rows(between 0 to 10) : ");

            rows = sc.nextInt();

            while(rows < 1 || rows > 9){
                System.out.println("Incorrect value.Try again.\n");
                System.out.print("Please enter number of rows(between 0 to 10): ");
                rows = sc.nextInt();
            }

            switch(choice){
                case 1:{
                    for(i = 1; i <= rows; i++){
                        for(j = rows; j >= i; j--){
                            System.out.print(j);
                        }
                        System.out.println();
                    }
                }
                break;
                case 2:{
                    for(i = 1; i <= rows; i++){
                        for(int k = i; k <= rows - 1; k++){
                            System.out.print(" ");
                        }
                        for(j = 1; j <= i; j++){
                            System.out.print(j);
                        }
                        System.out.println(" ");
                    }
                }
                break;
                case 3:{
                    int num = 1;
                    for(i = rows; i >= 1; i--){
                        for(j = rows; j > i; j--){
                            System.out.print(" ");
                        }
                        for(int k = num; k <= rows; k++){
                            System.out.print(k);
                        }
                        num++;
                        System.out.println();
                    }
                }
                break;
                case 4:{
                    space = rows - 1;
                    if(rows % 2 == 0){
                        int q = 1;
                        for(j = 1; j <= rows / 2; j++){
                            for(int k = rows - 1; k > q; k -= 2){
                                System.out.print(" ");
                            }
                            q += 2;
//                                for (j = space; j > q; j--)
//                                {
//                                System.out.print("*");
//                                }
//                                q++;

                            for(i = 1; i <= 2 * j - 1; i++){
                                System.out.print(i);
                            }
                            System.out.println(" ");
                        }
                        space = rows - 1;
                        int y = rows - 1;
                        for(j = 1; j <= rows / 2; j++){
                            for(i = rows - 1; i > space; i--){
                                System.out.print(" ");
                            }
                            space--;
                            int x = 1;
                            for(i = 1; i <= y; i++){

                                System.out.print(x);
                                x++;
                            }
                            y -= 2;
                            System.out.println(" ");
                        }
                    }else{
                        int q = 1;
                        for(j = 1; j <= (rows + 1) / 2; j++){
                            for(int k = rows - 1; k > q; k -= 2){
                                System.out.print(" ");
                            }
                            q += 2;
//                                for (j = space; j > q; j--)
//                                {
//                                System.out.print(" ");
//                                }q++;

                            for(i = 1; i <= 2 * j - 1; i++){
                                System.out.print(i);
                            }
                            System.out.println(" ");
                        }
                        space = rows - 1;
                        int y = rows - 1;
                        for(j = 1; j <= rows / 2 + 1; j++){
                            for(i = rows; i > space; i--){
                                System.out.print(" ");
                            }
                            space--;
                            int x = 1;
                            for(i = 1; i < y; i++){
                                System.out.print(x);
                                x++;
                            }
                            y -= 2;
                            System.out.println(" ");
                        }
                    }

                }
                break;

            }

        }
    }
}