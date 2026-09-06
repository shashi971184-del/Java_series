// create a program that computes the sum of the digits of an integer.
import java.util.Scanner;
public class Question04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to sum of digits");
        System.out.print("please enter your number: ");
        int num = input.nextInt();
        int sum = sumOfDigits(num);
        System.out.println("Sum of digits is :" + sum);
    }
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
