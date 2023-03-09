package BT5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int SIZE = 10; // kích thước mảng
        int[] arr = new int[SIZE]; // khai báo mảng

        // Nhập giá trị cho các phần tử trong mảng từ bàn phím
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập giá trị cho các phần tử trong mảng:");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = input.nextInt();
        }

        // Gọi phần tử đầu tiên trong mảng là phần tử có giá trị nhỏ nhất
        int min = arr[0];

        // Duyệt mảng từ phần tử thứ 2 đến hết mảng
        for (int i = 1; i < SIZE; i++) {
            // Nếu phần tử tiếp theo nhỏ hơn giá trị nhỏ nhất
            // thì gán giá trị nhỏ nhất là phần tử tiếp theo
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // In ra giá trị nhỏ nhất trong mảng
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);
    }
}

