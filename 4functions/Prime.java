
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = input.nextInt();
        boolean isPrime = checkPrime(n);
        System.out.println(isPrime);
    }

    static boolean checkPrime(int n) {
        int count = 0;
        if (n <= 2) {
            return false;
        }
        for (int i = 3; i <= n; i++) {
            if (n % i == 0 ) {
                count++;
                if(count > 2)
                    break;
            }
        }
        
        return count == 2;
      


    }
}
