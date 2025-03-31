package Day12;

public class CircularSumSubarray {
    public static int circularSubarraySum(int arr[]) {
        int n=arr.length;
        int totalSum=0,minSum=Integer.MAX_VALUE,maxSum=Integer.MIN_VALUE;
        int currMin=0,currMax=0;
        for(int i=0;i<n;i++){
            totalSum+=arr[i];
            currMin = Math.min(arr[i],currMin+arr[i]);
            minSum = Math.min(currMin,minSum);

            currMax = Math.max(arr[i],currMax+arr[i]);
            maxSum = Math.max(currMax,maxSum);
        }
        if(totalSum == minSum){
            return maxSum;
        }
        int circularSum = totalSum - minSum;

        return Math.max(maxSum,circularSum);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int ans = circularSubarraySum(arr);
        System.out.println("Answer :"+ans);
    }
}
