// -----------------------------------------------------
// Assignment # 3 (Project)
// Question Two: Time Algorithm
// Written by: Davinder Singh (2092836), Navneet Kaur (2092453) and Simranjit Kaur (2092430)
// This program just simply prints the number of hours, minutes, and seconds that corresponds to 50391 total seconds
// -----------------------------------------------------

public class TimeAlgorithm
{
    public static void main(String[] args)
    {
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
