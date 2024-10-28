
import java.util.Scanner;

public class CheckOdd {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean condition = true;
        do {
            System.out.println("Enter a number");
            int n = input.nextInt();
            if (n % 2 == 0) {
                System.out.println("Entered number is even \nTerminating the program");
                break;
                // condition = false;
            } else {
                System.out.println("odd number");
            }
        } while (condition);
        
        
    }
}
