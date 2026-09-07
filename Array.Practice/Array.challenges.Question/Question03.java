//Create a program to find the maximum and minimum element in an array.

public class Question03 {
    public static void main(String[] args) {
        System.out.println("welcome to Array Maximum and Minimum");
        int[] numArray = ArrayUtility.inputArray();
        int max = maximum(numArray);
        int min = minimum(numArray);
        System.out.println("Maximum element in the array is : " + max);
        System.out.println("Minimum element in the array is : " + min);

    }
    public static int maximum(int[] numArray) {
        int max = numArray[0];
        int i = 1;
        while (i < numArray.length) {
            if (numArray[i] > max) {
                max = numArray[i];
            }
            i++;
        }
        return max;
    }
    public static int minimum(int[] numArray) {
        int min = numArray[0];
        int i = 1;
        while (i < numArray.length) {
            if (numArray[i] < min) {
                min = numArray[i];
            }
            i++;
        }
        return min;
    }
}
