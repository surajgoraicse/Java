

public class Greet {
    public static void main (String[] args) {
        String call  = greet("Suraj");
        System.out.println(call);
    }
    static String greet(String name){
        return "Hello " + name + " How you have been?";
    }
}