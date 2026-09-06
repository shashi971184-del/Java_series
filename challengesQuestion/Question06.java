// create a program to find the greatest common Divisor(GCD) of two integers.
import java.util.Scanner;
public class Question06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to GCD");
        System.out.print("please enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("please enter the second number: ");
        int num2 = input.nextInt();
        int gcd = findGCD(num1, num2);
        System.out.println("GCD is :" + gcd);
    }

    public static int findGCD(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}
