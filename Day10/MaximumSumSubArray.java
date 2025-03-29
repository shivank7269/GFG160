package Day10;

public class MaximumSumSubArray {
    int maxSubarraySum(int[] arr) {
        int n=arr.length;
        int sum=0;
        int res=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum>res) res = sum;
            if(sum<0) sum=0;
        }
        return res;
    }
}
