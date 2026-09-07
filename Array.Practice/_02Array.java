import java.util.Scanner;
public class _02Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 13 , 25, 45, 67, 89};
        System.out.println("welcome to Array Searching program");
        System.out.println("Please enter your number which you want to search:");
        int num = input.nextInt();
        boolean isFound = isFound(arr, num);
        if (isFound) {
            System.out.println("your number is found in the array");
        } else {
            System.out.println("your number is not found in the array");
        }
    }
    public static boolean isFound(int[] arr, int num) {
        for (int index = 0; index < arr.length; index++) {
              if (arr[index] == num) {
                    return true;
                }
            
           
        }
        return false;
   
    }
}
