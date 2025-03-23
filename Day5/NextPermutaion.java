package Day5;

public class NextPermutaion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,5,4};
        int[] ans = nextPermutation(arr);
        System.out.println("ans is :-"+ans);
    }
    static int[] nextPermutation(int[] arr) {
        int n = arr.length;
        int idx1 = -1;
        int idx2 = -1;
        for(int i=n-1;i>0;i--){
            if(arr[i]>arr[i-1]){
                idx1=i-1;
                break;
            }
        }
        for(int i=n-1;i>0;i--){
            if(arr[idx1]<arr[i]){
                idx2=i;
                swap(arr,idx1,idx2);
                break;
            }
        }
        reverse(arr,idx1+1,n-1);
        return arr;
    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] =  temp;
    }
    static void reverse(int[] arr,int start,int end){
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}
