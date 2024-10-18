package Recursion;

/*
 * Đệ quy là một kỹ thuật lập trình mà trong đó một hàm gọi chính nó để giải quyết một vấn đề.
 * Đệ quy là một kỹ thuật mạnh mẽ và linh hoạt, có thể được sử dụng để giải quyết nhiều vấn đề phức tạp mà không cần sử dụng vòng lặp.
 * Tuy nhiên, đệ quy có thể dẫn đến stack overflow nếu không được sử dụng một cách hợp lý. Phải có điều kiện dừng để tránh điều này.
 */

public class Main {
    public static void main(String[] args) {
        printNumber(1);
        int result = fibonacci(5);
        System.out.println(result);
    }

    private static void printNumber(int n) {
        if (n == 10) {
            return;
        }
        System.out.println(n);
        printNumber(n + 1);
        return;
    }

    private static int fibonacci(int n) {
        if (n < 2) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
