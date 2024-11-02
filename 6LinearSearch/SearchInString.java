
import java.util.Arrays;



public class SearchInString {
    public static void main(String[] args) {
        String str = "Hello world";
        System.out.println(search(str));

    }

    public static boolean search(String str) {
        char[] charArr = str.toCharArray();
        System.out.println(Arrays.toString(charArr));
        return true;
    }
}
