package BT7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập kích thước của ma trận vuông: ");
        int size = input.nextInt();
        double[][] matrix = new double[size][size];
        System.out.println("Nhập các phần tử của ma trận vuông:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += matrix[i][i];
        }
        System.out.println("Tổng các phần tử trên đường chéo chính là " + sum);
    }
}

