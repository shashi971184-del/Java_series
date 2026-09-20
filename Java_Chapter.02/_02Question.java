// Create a program to find the given number is even or odd.
import java.util.Scanner;
public class _02Question {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to finding even or odd\n");
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        String result = num % 2 == 0 ? "Even" : "Odd"; //ternary operator to check if the number is even or odd
        System.out.println("The number is: " + result);
    }
    
}
