package ArraysAndStrings.TwoPointers;

/*
 * Two pointers là một kỹ thuật sử dụng hai con trỏ để duyệt qua mảng hoặc chuỗi.
 * Hai con trỏ này sẽ di chuyển ngược chiều nhau hoặc cùng chiều nhau để tìm ra kết quả. (i hoặc j) (left hoặc right)
 * 
 */

public class Main {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        equalPointer(arr);
    }

    private static void equalPointer(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            left++;
            right--;
            if (left == right) {
                break;
            }
        }
        System.out.println(arr[left]);
        System.out.println(arr[right]);
    }
}
