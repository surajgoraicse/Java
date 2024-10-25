
import java.util.Scanner;

public class CheckCharacterCase {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);
        System.out.println("character :  " + ch);
        if(ch >= 65 && ch <= 90 ){
            System.out.println("Uppercase");
        }
        else if (ch >= 97 && ch <= 122) {
            System.out.println("Lowercase");

        }
        else{
            System.out.println("Invalid input");
        }
        // if (ch >= 'a' && ch <= 'z') {
        //     System.out.println("Lowercase");
        // } else if (ch >= 'A' && ch <= 'Z') {
        //     System.out.println("Uppercase");

        // } else {
        //     System.out.println("Invalid input");

        // }

    }
}
