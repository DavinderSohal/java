/*
Two-dimensional Arrays. ... A 2D array has a type such as int[][] or String[][], with two pairs of square brackets.
The elements of a 2D array are arranged in rows and columns, and the new operator for 2D arrays specifies both the
number of rows and the number of columns. For example, int[][] A; A = new int[3][4];
Create the following java program:
	This program will display a mark table to the user, depending on its input.
	The columns represents the subjects.
	The rows represents the students.
	Algorithm to input data from the user:
o	Ask the user how many subjects (columns) he wants.
o	Ask the user how many students (rows) he wants.
o	For each student, loop and ask a mark for each subject
	The final output needs to respects the following:
How the program will display the final output:

Marks for the 3 students

|-----|-----|-----|
|  75 |  80 |  75 |
|-----|-----|-----|
|  80 |  85 |  80 |
|-----|-----|-----|
|  85 |  90 |  85 |
|-----|-----|-----|
*/

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
