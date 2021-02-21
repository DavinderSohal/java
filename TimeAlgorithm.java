// -----------------------------------------------------
// Assignment # 3 (Project)
// Question Two: Time Algorithm
// This program just simply prints the number of hours, minutes, and seconds that corresponds to 50391 total seconds
// -----------------------------------------------------

/*
Write a program that outputs and prints the number of hours, minutes, and seconds that corresponds to 50391 total
seconds. The output should be 13 hours, 59 minutes, and 51 seconds.
*/

public class TimeAlgorithm{
    public static void main(String[] args){
        //first loop for hours
        for(int i = 0; i < 24; i++){
            //second loop for minutes
            for(int j = 0; j < 60; j++){
                //third loop for seconds
                for(int k = 0; k < 60; k++){
                    //condition if sum of hours, minutes and seconds is 50391
                    if(((i * 3600) + (j * 60) + k) == 50391){
                        System.out.println("\nHours, minutes, and seconds that corresponds to 50391 total seconds " +
                                "are:\n" + i + " hours, " + j + " minutes, and " + k + " seconds");
                    }
                }
            }
        }
    }
}

// last modified January 7,2021
