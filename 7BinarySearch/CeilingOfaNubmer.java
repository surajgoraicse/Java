// smallest element which is greater than or equal to the target number

public class CeilingOfaNubmer {

    public static void main(String[] args) {
        int[] nums = {2, 34, 45, 565, 64343, 4546565, 938749387};
        int target = 3;
        System.out.println(element(nums, target));
    }

    public static int element(int[] nums, int target) {

        int left = 0, right = nums.length - 1, mid = -1;
        while (left <= right) {
            mid = left + (right - left) / 2;

            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                return nums[mid];
            }

        }
        if (nums[mid] > target) {
            return nums[mid];
        }
        return nums[mid + 1];
    }
}
