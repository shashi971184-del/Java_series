// Write a function that calculates the factorial of a given number.
import java.util.Scanner;
public class Question03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to Factorial");
        System.out.print("please enter your number: ");
        int num = input.nextInt();
        long fact = factorial(num);
        System.out.println("Factorial is :" + fact);
    }
    public static long factorial(int num){
        if (num < 2) {
            return 1;
        }
        long fact = 1;
        int i = 2;
        while (i <= num) {
        fact *= i;
        i++;
        }
        return fact;
    }

}

