//create a program to search an element in a 2-D Array.
import java.util.Scanner;
public class Question09 {
    public static void main(String[] args) {
        System.out.println("Welcome to 2-D Array Searching\n");
        int[][] numArray = ArrayUtility.input2DArray();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number you want to search : ");
        int num = input.nextInt();
        boolean found = searchElement(numArray, num);
        if (found) {
            System.out.println("Your element was found in the array");
        } else {
            System.out.println("Your element was not found in the array");
        }
    }

    public static boolean searchElement(int[][] numArray, int num) {
        int i = 0;
        while (i < numArray.length) {
            int j = 0;
            while (j < numArray[i].length) {
                if (numArray[i][j] == num) {
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
