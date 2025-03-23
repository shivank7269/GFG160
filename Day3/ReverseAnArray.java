package Day3;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        reverseArray(arr);
    }
    public static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        for (int i: arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
        for (int i: arr) {
            System.out.print(i+" ");
        }
    }
    private static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
