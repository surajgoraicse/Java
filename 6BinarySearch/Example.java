
public class Example {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 77, 888};
        System.out.println(search(arr, 1));
    }

    public static int search(int[] nums, int target) {   // this is not working TODO:
        int left = 0, right = nums.length - 1;
        boolean asc;
        asc = nums[left] <= nums[right];
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (asc) {
                if (nums[mid] < target) {
                    left = mid + 1;
                }
                else if (nums[mid] > target) {
                    left = mid + 1;
                }
                else
                    return mid;
            } else {
                if (nums[mid] > target) {
                    left = mid + 1;
                }
                else if (nums[mid] < target) {
                    left = mid + 1;
                }
                else
                    return mid;
            }
                
            }
            return -1;

        }
    }
