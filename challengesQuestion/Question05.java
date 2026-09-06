//create a program to find the least common multiple(LCM) of two numbers.
import java.util.Scanner;
public class Question05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to LCM");
        System.out.print("please enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("please enter the second number: ");
        int num2 = input.nextInt();
        int lcm = findLCM(num1, num2);
        System.out.println("LCM is :" + lcm);
    }

    public static int findLCM(int num1, int num2) {
        int i = 1;
        while (i <= num2){
            int factor = num1 * i;
            if (factor % num2 == 0) {
                return factor;
            }
            i++;
        }
        return 0; //unreachable
    }
}
