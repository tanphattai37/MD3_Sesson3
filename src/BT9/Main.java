package BT9;

public class Main {
    public static void main(String[] args) {
        int[] arr = {15, 5, 8, 20, 15, 6};
        int max = arr[0];
        int max2 = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max2 = max;
                max = arr[i];
            } else if (arr[i] > max2 && arr[i] != max) {
                max2 = arr[i];
            }
        }

        if (max2 != Integer.MIN_VALUE) {
            System.out.println("Phần tử lớn thứ hai là " + max2);
        } else {
            System.out.println("Không có phần tử lớn thứ hai trong mảng");
        }
    }
}

