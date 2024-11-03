public class PerfectSquareRoot {
    public static void main(String[] args) {
        System.out.println(findRoot(169));
    }

    public static int findRoot(int n) {
        int left = 0, right = n, mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (mid * mid == n)
                return mid;
            else if (mid * mid < n) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
