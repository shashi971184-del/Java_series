// using Break or Continue statement in for loop
public class _06Practice {
    public static void main(String[] args) {
        System.out.println("Using break statement");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("Out of loop");
        System.out.println("\nUsing continue statement");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) { 
                continue;
            }
            System.out.print(i + " ");
        }
    }
    
}
