// Create a program to calculate the absolute value of a given integer.
import java.util.Scanner;
public class _03Question {
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to finding absolute value\n");
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int result = num >= 0 ? num : -num; //ternary operator to find the absolute value   
        System.out.println("The absolute value is: " + result);
    }
}
