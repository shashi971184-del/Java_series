//create a program to do sum  and average of all the elements in a 2-D array.
public class Question10 {
    public static void main(String[] args) {
        System.out.println("Welcome to 2-D Array Sum and Average\n");
        int[][] numArr = ArrayUtility.input2DArray();
        long sum = sum(numArr);
        double average = average(numArr);
        System.out.println("The sum of all the elements in the array is : " + sum);
        System.out.println("The average of all the elements in the array is : " + average);
    }

    public static double average(int[][] numArr) {
        if(numArr.length == 0) {
            return 0;
        }
        int rows = numArr.length;
        int columns = numArr[0].length;
        double size = rows * columns;
        return sum(numArr) / size;
    }

    public static long sum(int[][] numArr) {
        long sum = 0;
        int i = 0;
        while (i < numArr.length) {
            int j = 0;
            while (j < numArr[i].length) {
                sum += numArr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }
    
}
