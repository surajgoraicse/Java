// find the nth fibonacci number

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter nth number : ");
        int n = input.nextInt();

        
        if(n < 0){
            System.out.println("Invalid inputs");
            return ;
        }

        long secondLast = 0L, last = 1L;

        // handling the base cases

        if(n == 1){
            System.out.println("0");
            return ;
        }else if(n==2){
            System.out.println("1");
            return ;
        }


        for(int i = 3 ;i<= n; i++){
            last = last + secondLast;
            secondLast = last - secondLast;

        }
        System.out.println(last);

    }
}
