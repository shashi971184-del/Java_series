//create a program to create a simple calculator that uses a switch statement to  perform basic arithmetic operations (addition, subtraction, multiplication, division).
import java.util.Scanner;
public class _06Question {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Simple Calculator");
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();
        System.out.print("Enter operation (+, -, *, /): ");
        String operator = input.next();

        double result = switch (operator) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> -1; // Invalid operation
        };
        System.out.println("Result: " + result);
    }
}
