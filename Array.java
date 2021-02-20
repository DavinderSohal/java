import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many marks for this student? ");
        int number_of_marks = sc.nextInt();
        double[] marks = new double[number_of_marks];
        for(int i = 1; i <= number_of_marks; i++) {
            System.out.printf("Marks %d: ", i);
            marks[i - 1] = sc.nextDouble();
        }
        double sum = 0;
        for(double element : marks) {
            sum += element;
        }
        String str = "";
        for(int i = 1; i <= marks.length; i++) {
            if(i != marks.length) {
                str += marks[i - 1] + ", ";
            }else {
                str += marks[i - 1];
            }
        }
        System.out.println("The marks are " + str);
        double average = sum / marks.length;
        System.out.println("The average is: " + String.format("%.2f", average) + "%");
    }
}
