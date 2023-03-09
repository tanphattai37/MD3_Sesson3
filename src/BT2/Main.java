package BT2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Mảng ban đầu: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("Nhập giá trị cần chèn: ");
        int value = scanner.nextInt();
        System.out.print("Nhập vị trí cần chèn (từ 0 đến " + (arr.length - 1) + "): ");
        int index = scanner.nextInt();
        if (index < 0 || index >= arr.length) {
            System.out.println("Vị trí không hợp lệ ");
            return;
        }
        for(int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = value;
        System.out.print("Mảng mới: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

