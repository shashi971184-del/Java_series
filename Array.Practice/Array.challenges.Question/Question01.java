//create a program to find the sum and average of all the elements in an array.
public class Question01 {
     public static void main(String[] args){
        System.out.println("welcome to Array sum and Average");
        int[] numArray = ArrayUtility.inputArray();//file call kr rha hai
        long sum = sum(numArray);
        double avg = average(numArray);
        System.out.println("sum of the numbers is : " + sum);
        System.out.println("Average of the numbers is : " + avg);
    }

    public static long sum(int[] numArray) {
        long sum = 0;
        int i = 0;
        while (i < numArray.length) {
            sum += numArray[i];
            i++;
        }
        return sum;
    }

    public static double average(int[] numArray) {
        double sum = sum(numArray);
        return  (sum / numArray.length);
    }
    
}