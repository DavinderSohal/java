public class Time_J_M{
    public static void main(String[] args){
        for(int i = 0; i < 24; i++){
            for(int j = 0; j < 60; j++){
                for(int k = 0; k < 60; k++){
                    int check = (i * 3600) + (j * 60) + k;
                    if(check == 50391){
                        System.out.println("Hours, minutes, and seconds that corresponds to 50391 total seconds " +
                                "are: " + i + " hours, " + j + " minutes, and " + k + " seconds");
                    }
                }
            }
        }
    }
}
