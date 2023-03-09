package BT3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array1 = new int[5]; // khởi tạo mảng 1 với kích thước 5
        int[] array2 = new int[3]; // khởi tạo mảng 2 với kích thước 3

        // nhập giá trị cho mảng 1
        System.out.println("Enter values for array1:");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = sc.nextInt();
        }

        // nhập giá trị cho mảng 2
        System.out.println("Enter values for array2:");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = sc.nextInt();
        }

        // tạo mảng thứ 3 có kích thước bằng tổng kích thước của mảng 1 và mảng 2
        int[] array3 = new int[array1.length + array2.length];

        // gộp mảng 1 vào mảng 3
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }

        // gộp mảng 2 vào mảng 3
        for (int i = 0; i < array2.length; i++) {
            array3[array1.length + i] = array2[i];
        }

        // hiển thị mảng 3
        System.out.println("Merged array:");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
    }
}
