// check a three digit number is armstrong or not.

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = inp.nextInt();
        boolean ans = isArmstrong(n);
        System.out.println(ans);
       

    }

    static boolean isArmstrong(int n) {
        int sum = 0;
        int temp = n;
        while (temp != 0) {
            int digit = temp % 10;
            sum = sum + digit * digit * digit;
            temp /= 10;
        }
        return sum == n;
    }
}
