package BT4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so hang cua ma tran: ");
        int rows = scanner.nextInt();

        System.out.print("Nhap so cot cua ma tran: ");
        int cols = scanner.nextInt();

        double[][] matrix = new double[rows][cols];

        // Nhap gia tri cho ma tran
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhap gia tri tai vi tri [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextDouble();
            }
        }

        double max = matrix[0][0];
        int rowMax = 0, colMax = 0;

        // Tim gia tri lon nhat va toa do
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    rowMax = i;
                    colMax = j;
                }
            }
        }

        System.out.println("Gia tri lon nhat cua ma tran la " + max + " tai vi tri [" + rowMax + "][" + colMax + "]");
    }
}
