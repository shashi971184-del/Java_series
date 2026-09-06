// create a program to reverse the digits of a number.
import java.util.Scanner;
public class Question08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your number : ");
        int num = input.nextInt();
        int reversed = reverseDigits(num);
        System.out.println("the reversed number is : " + reversed);
    }
    public static int reverseDigits(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }
        return reversed;
    }
}
