package java.Day4;

public class Q6_MergeArrays {
    public static int[] mergeArrays(int arr1[], int arr2[]){
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] res = new int[n1+n2];
        for (int i = 0; i < n1; i++) {
            res[i] = arr1[i];
        }
        for (int i = 0; i < n2; i++) {
            res[i+n1] = arr2[i];
        }
        return  res;
    }

    static void main() {
        int arr1[] = {1,2,3};
        int arr2[] = {4,5,6,7};
        int res[] = mergeArrays(arr1, arr2);
        for(int x : res){
            System.out.println(x);
        }
    }
}
