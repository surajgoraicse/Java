
import java.util.Scanner;

// find the reverse of a nubmer

public class Reverse{
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int digit , rev = 0;
        while(n != 0){
            digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        System.out.println("Reversed Number : " + rev);
    }
}