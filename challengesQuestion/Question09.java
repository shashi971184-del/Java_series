// create a program to print Fibonacci series up to a certain number.
import java.util.Scanner;
public class Question09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the number of terms : ");
        int n = input.nextInt();
        printFibonacci(n);
    }
    public static void printFibonacci(int n) {
        int first = 0, second = 1;
        System.out.print("Fibonacci series : ");
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
