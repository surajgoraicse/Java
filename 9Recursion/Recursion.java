public class Recursion {
    public static void main(String[] args) {
        message1();
        System.out.println("function completed");
    }
    public static void message1(){
        System.out.println("hello");
        message2();

    }
    public static void message2(){
        System.out.println("hello");
        message3();

    }
    public static void message3(){
        System.out.println("hello");
        message4();

    }public static void message4(){
        System.out.println("hello");
        message5();

    }public static void message5(){
        System.out.println("hello");
        message6();

    }
    public static void message6(){
        System.out.println("hello");

    }
}
