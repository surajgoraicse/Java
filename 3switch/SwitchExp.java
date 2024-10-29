
import java.util.Scanner;

public class SwitchExp {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter any number between 1 - 5");
       int n = input.nextInt();
       String num = switch(n){
           case 1 -> {
               yield "one";
            }
           case 2 -> {
               yield "two";
            }
           case 3 -> {
               yield "three";

            }
           case 4 -> {
               yield "four";
            }
           case 5 -> {
               yield "five";
           }
           default -> {
               yield "wrong input";
            }
       };
       System.out.println(num);
   } 
}
