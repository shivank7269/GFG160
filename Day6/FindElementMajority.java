package Day6;
import java.util.*;
public class FindElementMajority {
    public  List<Integer> findMajority(int nums[]){
        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        int majorityVote = n/3;
        int candidate1=-1,candidate2=-1;
        int count1=0,count2=0;
        for (int i = 0; i < n; i++) {
            if(candidate1==nums[i]){
                count1++;
            } else if (candidate2==nums[i]) {
                count2++;
            }else if(count1==0){
                candidate1=nums[i];
                count1=1;
            }else if(count2==0){
                candidate2=nums[i];
                count2=1;
            }else{
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(int i:nums){
            if(i==candidate1) count1++;
            else if(i==candidate2) count2++;
        }
        if(count1>majorityVote){
            res.add(candidate1);
        }if(count2>majorityVote){
            res.add(candidate2);
        }
        if(res.size()==2&&res.get(0)>res.get(1)){
            int temp = res.get(0);
            res.set(0,res.get(1));
            res.set(1,temp);
        }
        return res;

    }
    public static void main(String[] args) {
        int[] nums = {-5,1,-5};
        FindElementMajority solution = new FindElementMajority();
        List<Integer> majorityElements = solution.findMajority(nums);

        if (majorityElements.isEmpty()) {
            System.out.println("No majority elements found.");
        } else {
            System.out.println("Majority elements:");
            for (int element : majorityElements) {
                System.out.print(element + " ");
            }
        }
    }

}
