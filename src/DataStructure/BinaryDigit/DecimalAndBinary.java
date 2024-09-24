package DataStructure.BinaryDigit;

import java.util.Scanner;

/**
 * Bit
 * Tại sao cần biết về bit?
 * - Bit là đơn vị nhỏ nhất của dữ liệu số nguyên trong máy tính.
 * - Bit có thể nhận và hiểu được 1 trong 2 giá trị: 0 hoặc 1.
 * - Hệ thống đếm thập phân sử dụng 10 chữ số 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 để biểu diễn những số tự nhiên.
 * Hệ thống đếm thập phân biểu diễn số tự nhiên nhờ vào cơ số 10. Ví dụ: 2023 = 3×10^0 + 2×10^1 + 0x10^2 + 2×10^3.
 * Hệ thống đếm thập phân được sử dụng phổ biến cho con người đếm và tính toán. Tuy nhiên, máy tính lại cần một hệ thống đếm khác để có thể thuận tiện biểu diễn các tính toán phức tạp.
 * Hệ thống đếm nhị phân chỉ sử dụng 2 chữ số 0, 1 để biểu diễn những số tự nhiên. Hệ thống đếm nhị phân biểu diễn số tự nhiên nhờ vào cơ số 2. Ví dụ: 1011 = 1×2^0 + 1×2^1 + 0x2^2 + 1×2^3. 
 * 1011 cơ số 2 = 11 cơ số 10.
 * 1 byte bằng 8 bit. Đây là quy ước cơ bản trong hệ thống lưu trữ và xử lý dữ liệu máy tính. Mỗi byte có thể chứa một tổ hợp của 8 bit, cho phép biểu diễn 2^8 = 256 giá trị khác nhau.
 */ 
public class DecimalAndBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(decimalToBinary(number));
    }

    /*
    * Đổi từ số trong hệ thập phân sang hệ nhị phân:
    * Chúng ta sẽ chia số đó liên tục cho 2 và ghi lại số dư (0 hoặc 1).
    * Sau đó, chúng ta ghi lại các số dư từ phép chia cuối cùng lên đầu tiên.
    */

    public static int decimalToBinary(int decimal) {
        if (decimal == 0) {
            System.out.println("0");
            return -1;
        } 

        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            binary.append(decimal % 2);
            decimal /= 2;
        }
        return Integer.parseInt(binary.reverse().toString());
    }
    
    
}




