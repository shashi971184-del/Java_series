//Create a program to find the minimum of two numbers.
import java.util.Scanner;
public class _01Question {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to finding minimum\n");
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        int min = min(num1, num2);
        System.out.println("The minimum is: " + min);
    }
    public static int min(int num1, int num2) {
        return num1 < num2 ? num1 : num2;
        
    }
}
