
import java.util.Scanner;

public class Vowel {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char ch = input.next().toLowerCase().trim().charAt(0);
        switch (ch) {
            case 'a' , 'e' , 'i' , 'o' , 'u' -> {
                System.out.println("Entered character is a vowel");
            }
            default -> {
                System.out.println("Not a vowel");
            }
        }
    }

}
