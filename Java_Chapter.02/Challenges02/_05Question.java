
import java.util.Scanner;

// Create a program using for each to find the maximum value in an integer array.
public class _05Question {
    public static void main(String[] args) {
        System.out.println("Welcome to finding the  maximum\n ");
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of elements : ");
        int size = input.nextInt();
        int[] nums = new int [size];
        int i = 0;
        while (i < size){
            System.out.print("please enter element no : " + (i+1) + ": ");
            nums[i] = input.nextInt();
            i++;
        } 
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("The maximum value in the array is: " + max);
    }
}