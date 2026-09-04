package java.Day4;

public class Q7_RemoveDuplicate {
    public static int[] removeDuplicates(int arr[]){
        int write = 1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1] != arr[i]){
                arr[write++] = arr[i];
            }
        }
        return arr;
    }

    static void main() {
        int arr[] = {1,2,2,3,4,4,5};
        int res[] = removeDuplicates(arr);
        for(int x : res){
            System.out.println(x);
        }
    }
}
