package ArraysAndStrings.TwoPointers;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "abccba";
        String str2 = "racecar";
        String str3 = "abdcba";
        boolean result = isPalindrome(str2);
        boolean result2 = isPalindrome(str);
        boolean result3 = isPalindrome(str3);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }


    // O(n)
    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }


}
