// Create a program using do-while to implement a number guessing game.

import java.util.Scanner;

public class _02Question {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 5, guess;
        System.out.println("welcome to the number guessing game");
        do { 
            System.out.print("Please guess the number between 0 and 10 : ");
            guess = input.nextInt();
        } while (num != guess);
        System.out.println("you have successfully guessed the number");
    }
}
