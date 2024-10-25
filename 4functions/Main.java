
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter second number : ");
        int num2 = input.nextInt();

        // Main obj = new Main();
        // int sum = obj.sum(num1 , num2);
        int sum = sum(num1 , num2);
        System.out.println("Sum of two numbers = " + sum);


    }

    static int sum(int a ,  int b){
            int sum = a  + b;
            return sum;
    }
}