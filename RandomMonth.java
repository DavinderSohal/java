public class RandomMonth{
    public static void main(String[] args){
        String month_name;
        int days;
        int random_month = (int)(Math.random() * 12 + 1);
        switch(random_month){
            case 1:{
                month_name = "January";
            }
            break;
            case 2:{
                month_name = "February";
            }
            break;
            case 3:{
                month_name = "March";
            }
            break;
            case 4:{
                month_name = "April";
            }
            break;
            case 5:{
                month_name = "May";
            }
            break;
            case 6:{
                month_name = "June";
            }
            break;
            case 7:{
                month_name = "July";
            }
            break;
            case 8:{
                month_name = "August";
            }
            break;
            case 9:{
                month_name = "September";
            }
            break;
            case 10:{
                month_name = "October";
            }
            break;
            case 11:{
                month_name = "November";
            }
            break;
            case 12:{
                month_name = "December";
            }
            break;
            default:{
                throw new IllegalStateException("Unexpected value");
            }
        }
        System.out.println();
        if(random_month != 2){
            if(random_month == 4 || random_month == 6 || random_month == 9 || random_month == 11){
                days = 30;
            }else{
                days = 31;
            }
            System.out.println("Month: " + month_name);
            System.out.println("Number of days in month " + month_name + ": " + days + " days");
        }else{
            days = 28;
            System.out.println("Month: " + month_name);
            System.out.println("Number of days in month " + month_name + ": " + days + " days" + " or " + (days + 1) + " days");
        }
    }
}
