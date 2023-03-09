package BT8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Khai báo một chuỗi và gán cho nó một giá trị
        String str = "Hello World";

        // Bước 2: Khai báo một biến ký tự và nhập từ bàn phím một giá trị.
        System.out.print("Nhập ký tự cần đếm: ");
        char c = scanner.next().charAt(0);

        // Bước 3: Khai báo biến count và gán giá trị 0, để lưu số ký tự đếm được trong chuỗi
        int count = 0;

        // Bước 4: Sử dụng vòng lặp duyệt từng ký tự trong chuỗi
        for (int i = 0; i < str.length(); i++) {
            // so sánh nếu ký tự trong chuỗi bằng ký tự nhập vào thì tăng biến đếm lên 1
            if (str.charAt(i) == c) {
                count++;
            }
        }

        // Bước 5: In ra giá trị biến đếm
        System.out.println("Số lần xuất hiện của ký tự " + c + " trong chuỗi là: " + count);

        scanner.close();
    }
}
