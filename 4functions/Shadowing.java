
public class Shadowing {
    static int num = 19;    // global value

    public static void main(String[] args) {
        System.out.println(num);
        int num = 10;  
        System.out.println(num);
        // prints the local value and shadowed the global variable
        System.out.println(Shadowing.num);
    }

}
