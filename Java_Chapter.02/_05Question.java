//Create a program to print the month of the year based on a number (1-12) input by the user.
import java.util.Scanner;
public class _05Question {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to Month mapping\n");
        System.out.print("Please enter your month number : ");
        int monthNum = input.nextInt();
        String monthName = getMonthName(monthNum);
        System.out.println("The month is: " + monthName);


    }
    public static String getMonthName(int monthNum) {
        switch (monthNum) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Invalid month number. Please enter a number between 1 and 12.";
        }
    }
    
}
