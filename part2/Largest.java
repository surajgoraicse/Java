
import java.util.Scanner;

public class Largest {

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

        int max1 = Math.max(c  , Math.max(a, b) );
        System.out.println("Maximum = "+ max1);


        int max2 = a;
        if (b > max2) {
            max2 = b;
        }
        if (c > max2) {
            max2 = c;
        }
        System.out.println("Maximum = " + max2);

    }
}


