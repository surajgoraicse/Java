
import java.util.Scanner;

public class Pythogoras {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int m = input.nextInt();
        int n = input.nextInt();
        int o = input.nextInt();
        boolean ans = check(m, n, o);
        System.out.println(ans);
    }

    static boolean  check(int a , int b , int c){
        int largest = Math.max(c,Math.max(a, b));
        int smallest = Math.min(c,Math.min(a, b));
        int middle = a + b + c - largest - smallest;
        return (smallest * smallest + middle * middle == largest *  largest);
    }
}
