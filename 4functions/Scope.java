
public class Scope {

    public static void main(String[] args) {

        String name = "Suraj";
        {
            name = "Akash";
            System.out.println(name);
        }
        System.out.println(name);



    }

}
