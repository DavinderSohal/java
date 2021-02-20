public class Factorial
{
    public static int factorial(int i){
        if(i ==0|| i==1){
            return 1;
        }else
        return i*factorial(i-1);
    }
    public static void main(String[] args)
    {
        System.out.println();
        for(int i = 0; i<=10;i++){
            System.out.println("The factorial of "+ i +" is: "+ factorial(i));
        }
    }
}
