package java.Day4;

public class Q2_MinMaxArrayElement {
    public static void minMax(int arr[]){
        int min = arr[0];
        int max = arr[0];

        for(int i : arr){
            if(i > max){ max = i; }
            if(i < min){ min = i; }
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }

    static void main() {
        int arr[] = {1,2,0,3,4,-1,5};
        minMax(arr);
    }
}
