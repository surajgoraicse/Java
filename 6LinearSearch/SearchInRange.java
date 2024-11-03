public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = new int[30];
        for (int i = 0; i < 30; i++) {
            arr[i] = (int) (Math.random() * 50);
        }
        int start = 5, end = 25 , target = 20;
        System.out.println(search(start, end, target, arr));
    }

    public static boolean  search(int start , int end , int target, int[] arr){
        for (int i = start; i <= end; i++) {
            if (arr[i] == target)
                return true;
        }
        return false;
    }
}
