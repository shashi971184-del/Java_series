// Create a program using for-each to the occurrence of a specific element in an array.
import java.util.Scanner;
public class _06Question {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to finding the occurrence of a specific element in an array\n");
        System.out.print("Please enter the number of elements : ");
        int size = input.nextInt();
        int[] nums = new int [size];
        int i = 0;
        while (i < size){
            System.out.print("please enter element no : " + (i+1) + ": ");
            nums[i] = input.nextInt();
            i++;
        } 
        System.out.print("Please enter the element to find its occurrence: ");
        int element = input.nextInt();
        int occ = countOccurrence(nums, element);
        System.out.println("The occurrence of " + element + " in the array is: " + occ);
    }

    public static int countOccurrence(int[] nums, int element) {
        int count = 0;
        for (int num : nums) {
            if (num == element) {
                count++;
            }
        }
        return count;
    }
}
