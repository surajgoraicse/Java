
import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(12);
        list.add(143542);
        list.add(234324);
        list.add(456456);
        list.add(453);
        list.add(3434);
        list.add(3434);
        list.add(3434);
        list.remove(1);
        list.set(0, 6969);
        list.add(3, 11111);
        // System.out.println(list.get(0));
        // System.out.println(list.contains(45));
        // System.out.println(list.size());
        System.out.println(list);




    }
}
