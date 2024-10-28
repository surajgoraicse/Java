import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.next().toLowerCase();
        String rev = "";
        for (int i = 1; i <= str.length(); i++) {
            rev = rev + str.charAt(str.length() - i);

        }
        System.out.println("rev : " + rev);
        if (rev.equals(str)) {
            System.out.println("It is palindrome"); 
        }
        else {
            System.out.println("it is not a palindrome");
        }

    }
}
