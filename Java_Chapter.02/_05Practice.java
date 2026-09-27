// using ForEachLoop to print some names
public class _05Practice {
    public static void main(String[] args) {
        String[] names = {"Naruto", "Hinta", "Sasuke", "Sakura", "Kakashi", "Jiraiya", "Tsunade", "Sitama", "Goku", "Vegeta", "Luffy", "Zoro", "Sanji", "Nami", "Robin", "Usopp", "Chopper", "Franky", "Brook", "Jinbei"};
        printArray(names);
        printArrayForEach(names);
        
        }

        public static void printArrayForEach(String[] arr) {
            for (String name : arr) {         // using for each loop to print names
                System.out.print(name + " ");
            }
            System.out.println();
        }

        public static void printArray(String[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
    }
}
