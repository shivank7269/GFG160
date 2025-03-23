package Day2;
import java.util.Arrays;
public class MoveAllZeroesToEnd {
    public static void pushZeroesToEnd(int[] arr){
        int n = arr.length;
        int[] res = new int [n];
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                res[count]=arr[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(res));
    }

    public static void main(String[] args) {
        int arr[] = {1,2,0,4,3,0,5,0};
        pushZeroesToEnd(arr);
    }
}
