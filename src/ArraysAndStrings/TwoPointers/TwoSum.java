package ArraysAndStrings.TwoPointers;

/*
 * Cách giải bài toán này là: 
 * - Sử dụng 2 pointer, 1 pointer ở đầu mảng, 1 pointer ở cuối mảng
 * - Nếu tổng của 2 pointer lớn hơn target thì right--
 * - Nếu tổng của 2 pointer nhỏ hơn target thì left++
 * - Nếu tổng của 2 pointer bằng target thì return true
 * - Nếu left >= right thì return false
 * => Dựa theo index của 2 pointer để tính tổng xem có bằng target hay không => Done
 */

public class TwoSum {
    public static void main(String[] args) {

        int[] nums = {1, 2, 4, 6, 8, 9, 14, 15};
        boolean isTarget = checkForTarget(nums, 10);
        System.out.println("isTarget: " + isTarget);

    }


    private static boolean checkForTarget(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int curr = arr[left] + arr[right];
            if (curr == target) {
                return true;
            }
            if (curr > target) {
                right--;
            } else {
                left++;
            }
        }
        return false;
    }
}
