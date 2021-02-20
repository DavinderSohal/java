public class SwapNumbers {
    public static void main(String[] args) {
        int num1 = 11;
        int num2 = 22;
        int num3 = 33;
        int temp;
        System.out.println("before swapping");
        System.out.println("num1 ="+num1);
        System.out.println("num2 ="+num2);
        System.out.println("num3 ="+num3);
        temp = num1;
        num1 = num2;
        num2 = num3;
        num3 = temp;
        System.out.println("After swapping");
        System.out.println("num1 ="+num1);
        System.out.println("num2 ="+num2);
        System.out.println("num3 ="+num3);
    }
}
