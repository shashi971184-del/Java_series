// Create a program to Based on a student's score, categorize as "High", "Moderate", or "Low" 
//using the ternary operator(e.g., High for score >80, Moderate for 50-80,Low for <50).

import java.util.Scanner;

public class _04Question {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to Student Score\n");
        System.out.print("Enter the Marks: ");
        int marks = input.nextInt();

        String category = marks > 80 ? "High" : (marks >= 50 ? "Moderate" : "Low"); //ternary operator to categorize the score
        System.out.println("The score category is: " + category);
        
    }
    
}
