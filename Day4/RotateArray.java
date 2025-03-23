package Day4;
import java.util.Arrays;
public class RotateArray {
    static int[] rotateArr(int arr[], int d) {
        int n = arr.length;
        d%=n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        return arr;
    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reverse(int[] arr,int start,int end){
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,5,4};
        int d = 5;
        int[] ans = rotateArr(arr,d);
        System.out.print("Arrays will be:-");
        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}
