public class New
{
    public static void compoundInterest(int p, int t, double interest, int r)
    {
        double interest_rate = interest / 100;
        double amount = p * Math.pow(1 + (interest_rate / t), t * r);
        double compound_interest = amount - p;
        System.out.println("Compound Interest after " + r + " years: " + compound_interest);
        System.out.println("Amount after " + t + " years: " + amount);
    }

    public static void main(String[] args)
    {
        compoundInterest(1000, 12, 5, 1);
    }
}
