public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11};
        int left = 0, right = arr.length - 1;
        int n = 11;
        System.out.println(search(n, arr, left, right));
    }

    public static boolean search(int n, int[] arr, int left, int right) {
        // target not found
        if (left > right) return false;

        int mid = left + (right - left) / 2;

        // target found
        if (arr[mid] == n) {
            return true;
        } else if (arr[mid] > n) {
            right = mid - 1;
            return search(n, arr, left, right);
        } else {
            left = mid + 1;
            return search(n, arr, left, right);
        }
    }
}

