// Create a program using for to display if a number is prime or not.
import java.util.Scanner;
public class _04Question {
    public static void main(String[] args) {
        System.out.println("Welcome to prime number checker");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number :");
        int num = input.nextInt();
        // boolean shashi = isPrime(num);
        // if (shashi) {
        //     System.out.println(" this is a prime number");
        
        // }
        // else{
        //     System.out.println("this is not a prime number");
        // }
        // we can also solve this by ternary operator
        System.out.println("your number is " + (isPrime(num) ? "Prime" : "Not Prime"));

    }

    public static boolean isPrime(int num) {
         for ( int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
            
         }
         return true;
    }
    

}
