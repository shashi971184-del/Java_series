//Using do while loop to validate user input for age
import java.util.Scanner;
public class _03Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int age;
        do {
            System.out.print("Enter your age: ");
            age = input.nextInt();
        } while (age < 0 || age > 120);
        System.out.println("your age is: " + age);
    }

    
}
 