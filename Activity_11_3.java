/*
Write a program that incorporates a function/method that will compute the future returns of an investment with an
initial deposit (some amount for initial investment i.e. $1000), an annual percentage of return for each year and the
 amount of years the investment is locked up for. Calculate the amount to be compounded each year and return the
 total amount to the user
*/

public class Activity_11_3{
    public static void compoundInterest(int p, int t, double interest, int r){
        double interest_rate = interest / 100;
        double amount = p * Math.pow(1 + (interest_rate / t), t * r);
        double compound_interest = amount - p;
        System.out.println("Compound Interest after " + r + " years: " + compound_interest);
        System.out.println("Amount after " + t + " years: " + amount);
    }

    public static void main(String[] args){
        compoundInterest(1000, 12, 5, 1);
    }
}
