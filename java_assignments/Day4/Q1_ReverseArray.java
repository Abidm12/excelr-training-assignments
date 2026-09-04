package java.Day4;

public class Q1_ReverseArray {

    public static int[] reverseArray(int arr[]){
        int n = arr.length;
        int st = 0;
        int end = n-1;

        while(st<end){
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }

        return arr;
    }

    static void main() {
        int arr[] = {1,2,3,4};
        int res[] = reverseArray(arr);
        for(int x : res){
            System.out.println(x);
        }

    }
}
