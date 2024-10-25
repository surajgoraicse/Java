
import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.next();
        switch (fruit){
            case "mango" -> {
                System.out.println("king of fruits");
            }
            case "apple" -> {
                System.out.println("an apple a day keeps doctor away");
            }
            case "banana" ->  {
                System.out.println("good for gaining");
            }
            default -> {
                System.out.println("Cases does not match");
                
            }
            
        }
    }
}