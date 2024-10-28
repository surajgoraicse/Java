
import java.util.Scanner;

public class SwitchExpression {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number between 1 - 5");
        int n = input.nextInt();
        switch (n) {
            case 1 -> {
                System.out.println("one");
                int a = 34 + 324;
                System.out.println(a);
            }
            case 2 -> {
                System.out.println("two");
            }
            case 3, 4, 5 -> {
                System.out.println("three four five");
            }
            default -> {
                System.out.println("this is a default value");
            }
        }
    }
}
