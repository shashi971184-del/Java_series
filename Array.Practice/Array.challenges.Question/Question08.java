//create a program to merge two sorted arrays into a single sorted array.
public class Question08 {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Merging\n");
        System.out.println("Please enter the first sorted array : ");
        int[] arr1 = ArrayUtility.inputArray();
        System.out.println("Please enter the second sorted array : ");
        int[] arr2 = ArrayUtility.inputArray();
        int[] mergedArray = mergeSortedArrays(arr1, arr2);
        System.out.println("The merged sorted array is : ");
        ArrayUtility.displayArray(mergedArray);
    }

    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }
        while (i < arr1.length) {
            mergedArray[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            mergedArray[k++] = arr2[j++];
        }
        return mergedArray;
    }
    
}
