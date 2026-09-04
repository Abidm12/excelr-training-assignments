package java.Day4;

public class Q3_PalindromeArray {

    public static boolean palindromeArray(int arr[]){
        int n = arr.length;;
        int st = 0;
        int end = n-1;

        while(st<end){
            if(arr[st]!=arr[end]){return false;}
            st++;
            end--;
        }
        return true;
    }

    static void main() {
        int arr[] = {1,2,3,2,1};
        boolean res = palindromeArray(arr);
        System.out.println(res);
    }

}
