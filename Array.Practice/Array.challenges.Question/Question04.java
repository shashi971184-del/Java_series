// Create a program to check if the given array is sorted.
public class Question04 {
    public static void main(String[] args) {
        System.out.println("wlcome to array sorting check post\n");
        int[] numArray = ArrayUtility.inputArray();
        boolean isInc = isIncreasing(numArray);
        boolean isDec = isDecreasing(numArray);
        if (isInc || isDec) {
            System.out.println("the given array is sorted");
        } else {
            System.out.println("the given array is not sorted");
        }
    }
    public static boolean isDecreasing(int[] numArray) {
        return false;
    }

    public static boolean isIncreasing(int[] numArray) {
        int i = 0;
        while (i < numArray.length - 1) {
            if (numArray[i] > numArray[i + 1]) {
              return false;
            }
            i++;
        }
         return true;

    }
}