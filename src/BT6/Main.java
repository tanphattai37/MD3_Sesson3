package BT6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Nhập vào số hàng và số cột của mảng
        System.out.print("Nhập số hàng của mảng: ");
        int rows = input.nextInt();
        System.out.print("Nhập số cột của mảng: ");
        int cols = input.nextInt();

        // Khai báo mảng hai chiều với kích thước đã cho
        double[][] array = new double[rows][cols];

        // Nhập vào các giá trị của mảng
        System.out.println("Nhập vào các giá trị của mảng:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("array[" + i + "][" + j + "] = ");
                array[i][j] = input.nextDouble();
            }
        }

        // Nhập vào cột cần tính tổng
        System.out.print("Nhập vào số thứ tự của cột cần tính tổng (bắt đầu từ 0): ");
        int column = input.nextInt();

        // Tính tổng các phần tử của cột
        double sum = 0;
        for (int i = 0; i < rows; i++) {
            sum += array[i][column];
        }

        // In ra tổng các phần tử của cột
        System.out.println("Tổng các phần tử của cột " + column + " là: " + sum);
    }
}

