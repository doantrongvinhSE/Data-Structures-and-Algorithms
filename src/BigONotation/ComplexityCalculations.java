package BigONotation;

import java.util.Scanner;

public class ComplexityCalculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        

        // O(1)
        /*
         * O(1) là độ phức tạp của thuật toán không phụ thuộc vào độ lớn của dữ liệu đầu
         * vào.
         * Đoạn mã sau đây là 𝑂(1), vì nó thực thi một số thao tác không đổi.
         */
        int a = 5;
        int b = 10;
        int c = 8;
        int d = a + b + c;
        int e = scanner.nextInt(); // O(1)
        System.out.println(e); // O(1)

        // O(n)
        /*
         * O(n) là độ phức tạp của thuật toán phụ thuộc vào độ lớn của dữ liệu đầu vào.
         * Đoạn mã sau đây là 𝑂(n), vì nó thực thi một số thao tác phụ thuộc vào độ lớn
         * của dữ liệu đầu vào.
         */
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }

        // O(nm)
        /*
         * O(nm) là một biểu diễn của độ phức tạp thời gian trong Big O Notation, thường
         * gặp khi một thuật toán có hai vòng lặp lồng nhau mà số lần lặp của mỗi vòng
         * không bằng nhau.
         * 
         * Ý nghĩa của O(nm):
         * n: Đại diện cho kích thước của một tập dữ liệu (ví dụ, số hàng của một ma
         * trận hoặc số phần tử trong một danh sách).
         * m: Đại diện cho kích thước của một tập dữ liệu khác (ví dụ, số cột của một ma
         * trận hoặc số phần tử trong một danh sách khác).
         * Khi nào gặp O(nm)?
         * Độ phức tạp O(nm) xuất hiện khi bạn có hai vòng lặp hoặc hai quá trình mà một
         * vòng hoặc quá trình phụ thuộc vào n và vòng còn lại phụ thuộc vào m.
         */
        int m = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                // constant time code here
            }
        }

        // O(n^2)
        /*
         * Khi một thuật toán có độ phức tạp O(n²), thời gian xử lý của nó tăng theo
         * bình phương của số lượng phần tử đầu vào. Điều này thường xảy ra trong các
         * thuật toán có hai vòng lặp lồng nhau, mỗi vòng lặp phụ thuộc vào n, và mỗi
         * lần lặp lại của vòng lặp bên ngoài sẽ chạy toàn bộ vòng lặp bên trong.
         */
        for (int i = 1; i <= n; i++) { // Vòng lặp bên ngoài chạy n lần.
            for (int j = 1; j <= n; j++) { // Vòng lặp bên trong chạy n lần.
                // constant time code here
            }
        }

        /*
         * Nếu một thuật toán chứa nhiều khối thì độ phức tạp về thời gian của nó là độ
         * phức tạp về thời gian tồi tệ nhất so với bất kỳ khối nào. Ví dụ: đoạn mã sau
         * đây là O(n^2)
         * 
         * Ở đây dùng đc trường hợp tệ nhất vì n^2 là lớn hơn n. So sánh khi cả 2 đều phụ thuộc vào n.
         */
        {
            // O(n^2) is the worst case
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    // constant time code here
                }
            }
            // O(n)
            for (int i = 1; i <= n + 58834; i++) {
                // more constant time code here
            }
        }

        // O(n^2 + m)
        /*
         * Độ phức tạp thời gian của đoạn mã này là O(n^2 + m), vì độ phức tạp thời gian
         * lớn nhất trong các khối là O(n^2) và O(m). 
         * Ở đây không dùng đc trường hợp tệ nhất vì m không phụ thuộc vào n.
         */
        {
            // O(n^2)
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    // constant time code here
                }
            }
            // O(m)
            for (int i = 1; i <= m; i++) {
                // more constant time code here
            }
        }

        /* 
         Độ phức tạp về thời gian không có nghĩa là sự thể hiện chính xác số lượng thao tác. Ví dụ: chúng tôi cần khởi tạo maxNum = 0 và cuối cùng chúng tôi cũng cần xuất maxNum. Vì vậy, bạn có thể lập luận rằng đối với một mảng có độ dài 10, chúng ta cần 12 phép tính. Đây không phải là điểm phức tạp về thời gian. Điểm phức tạp về thời gian là mô tả số lượng thao tác thay đổi như thế nào khi đầu vào thay đổi. Số lần lặp chúng ta thực hiện phụ thuộc vào số, nhưng việc khởi tạo maxNum = 0 thì không.
         */

         // logn, nlogn, log^2n updating...



        scanner.close();

    }
}
