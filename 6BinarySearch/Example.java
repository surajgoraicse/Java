
public class Example {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 77, 888 };
        System.out.println(search(arr, 888));
    }

    public static int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1, mid;
        int k = target;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[left] >= nums[right]) {   // Handling the descending order
                if (nums[mid] > k) {
                    left = mid + 1;
                } else if (nums[mid] < k) {
                    right = mid - 1;
                } else {
                    return mid;
                }
            } else {
                if (nums[mid] < k) {   // ascending order
                    left = mid + 1;
                } else if (nums[mid] > k) {
                    right = mid - 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }
}