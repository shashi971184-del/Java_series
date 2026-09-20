// Using switch statement print the days

import java.util.Scanner;

public class _01Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to Day of the week detector\n");
        System.out.print("Enter your day in number: ");
        int day = input.nextInt();
        
        switch (day) {
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            case 7:
            System.out.println("Sunday");
            break;
            default:
             System.out.println("Invalid day");
             break;
              

        }
        
    }

}