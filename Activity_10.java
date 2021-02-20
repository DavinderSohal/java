import java.util.Scanner;

public class Activity_10{
    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("\nEnter number of Students: ");
            int no_of_students = sc.nextInt();
            System.out.print("Enter number of Subjects: ");
            int no_of_subject = sc.nextInt();
            int[][] marks = new int[no_of_students][no_of_subject];
            System.out.println();
            for(int i = 0; i < no_of_students; i++){
                for(int j = 0; j < no_of_subject; j++){
                    System.out.printf("Enter marks of Student %d in Subject %d: ", i + 1, j + 1);
                    marks[i][j] = sc.nextInt();
                }
            }
            System.out.println("\nMarks for the " + no_of_students + " student(s)\n");
            System.out.print("             ");
            for(int k = 1; k <= no_of_subject; k++){
                System.out.printf("Sub %2d   ", k);
            }
            System.out.println();
            for(int i = 0; i <= no_of_students; i++){
                System.out.print("           ");
                for(int k = 0; k < no_of_subject; k++){
                    if(k == no_of_subject - 1){
                        System.out.print("|--------|");
                    }else{
                        System.out.print("|--------");
                    }
                }
                System.out.println();
                if(i == no_of_students){
                    break;
                }
                System.out.printf("Student %2d ", (i + 1));
                for(int j = 0; j < no_of_subject; j++){
                    if(j == no_of_subject - 1){
                        System.out.printf("|  %3d   |", marks[i][j]);
                    }else{
                        System.out.printf("|  %3d   ", marks[i][j]);
                    }
                }
                System.out.println();
            }
        }catch(Exception e){
            System.out.println("\n***** ERROR: Invalid Input *****");
            main(args);
        }
    }
}
