import java.util.Scanner;
// Develop a program that calculates the sum of all odd numbers up to a given number.
public class Question02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to odd sum:");
        System.out.print("please enter your number: ");
        int num = input.nextInt();
        int sum = oddSum(num);
        System.out.println("The sum of odd numbers up to " + num + " is: " + sum);
    }
    public static int oddSum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i += 2) {
            sum += i;
        }
        return sum;
    }
}
