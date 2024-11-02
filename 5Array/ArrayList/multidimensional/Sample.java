
import java.util.ArrayList;


public class Sample {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> item1 = new ArrayList<>();
        ArrayList<Integer> item2 = new ArrayList<>();
        ArrayList<Integer> item3 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            item1.add(i);
            item2.add(i * 2);
            item3.add(i * 3);
        }
        list.add(item1);
        list.add(item2);
        list.add(item3);
        System.out.println(list);

    }
}
