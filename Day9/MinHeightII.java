package Day9;
import java.util.Arrays;
public class MinHeightII {
    int getMinDiff(int[] arr, int k) {
        int n=arr.length;
        if(n==1) return 0;
        Arrays.sort(arr);
        int ans = arr[n-1]-arr[0];
        int smallest = arr[0]+k;
        int largest = arr[n-1]-k;
        for(int i=0;i<n-1;i++){
            if(arr[i+1]-k<0) continue;
            int minHeight = Math.min(smallest,arr[i+1]-k);
            int maxHeight = Math.max(largest,arr[i]+k);
            ans = Math.min(ans,maxHeight-minHeight);
        }
        return ans;
    }
}
