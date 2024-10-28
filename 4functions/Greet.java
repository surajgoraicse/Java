

public class Greet {
    public static void main (String[] args) {
        Greet obj = new Greet();
        String call  = obj.greet("Suraj");
        System.out.println(call);
    }
     String greet(String name){
        return "Hello " + name + " How you have been?";
    }
}