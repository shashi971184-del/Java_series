//Create a program to return a new array deleting a specific element.
import java.util.Scanner;
public class Question05 {
    public static void main(String[] args) {
        System.out.println("Welcome to array element deletion post\n");
        int[] numArray = ArrayUtility.inputArray();
        System.out.print("Please enter the element to be deleted : ");
        Scanner input = new Scanner(System.in);
        int delElement = input.nextInt();
        int[] newArray = deleteElement(numArray, delElement);
        System.out.println("The new array after deleting the element " + delElement + " is : ");
        ArrayUtility.displayArray(newArray);
    }

    public static int[] deleteElement(int[] numArray, int delElement) {
        int count = 0;
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] == delElement) {
                count++;
            }
        }
        int[] newArray = new int[numArray.length - count];
        int j = 0;
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] != delElement) {
                newArray[j] = numArray[i];
                j++;
            }
        }
        return newArray;
    }
}