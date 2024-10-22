
import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // if (a > b) {
        //     if (a > c) {
        //         System.out.println("A " + a + " is the largest");
        //     } else {
        //         System.out.println("C " + c + " is the largest");
        //     }
        // } else {
        //     if (b > c) {
        //         System.out.println("B " + b + " is the largest");
        //     } else {
        //         System.out.println("C " + c + " is the largest");
        //     }
        // }
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("Maximum = " + max);

    }
}
