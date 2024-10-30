// Reverse an array:
import java.util.Arrays;
public class Reverse {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7, 7};
        // int[] reverse = reverseArray(arr);
        // System.out.println(Arrays.toString(reverse));
        reverseArrayTwoPointer(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] reverseArray(int[] arr) {
        int length = arr.length;
        int[] rev = new int[length];
        for (int i = length - 1; i >= 0; i--) {
            rev[length - i - 1] = arr[i];
        }
        return rev;
    }

    public static void reverseArrayTwoPointer(int[] arr) {          // two pointer approach , the most optimal solution 
        int left = 0, right = arr.length-1, temp;                   //TC => O(n) , SC => (1) 
        while (left < right) {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        
    }
}
