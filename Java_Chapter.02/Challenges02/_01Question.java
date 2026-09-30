// Create a program using do-while to find password checker until a valid password is entered.
import java.util.Scanner;
class _01Question{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to set your password\n");
        String password;
        do {
            System.out.print("please enter your password : ");
            password = input.next();

        } while (!isValidPassword(password));
         System.out.println("thanks for entering a valid password");

    }

    public static boolean isValidPassword(String password) {
        return password.length()  > 6;    
    }
}