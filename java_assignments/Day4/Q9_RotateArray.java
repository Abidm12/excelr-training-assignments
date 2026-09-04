package java_assignments.Day4;


public class Q9_RotateArray {

    public static void rotateLeft(int[] arr, int positions) {
        int n = arr.length;
        positions = positions % n;

        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[i] = arr[(i + positions) % n];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int positions = 1;

        rotateLeft(arr, positions);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

