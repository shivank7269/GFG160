package Day13;
import java.util.Arrays;
import java.util.HashSet;
public class MissingPositiveNumber {
    public static int missingNumber(int[] arr) {
        int n = arr.length;
        HashSet<Integer> positiveArr = new HashSet<>();

        int[] temp=Arrays.stream(arr)
                .filter(items->items>0)
                .toArray();
        for(int i : temp)positiveArr.add(i);
        for(int i=1;i<=n+1;i++){
            if(!positiveArr.contains(i)) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-3,-2,0,1,2,5,7};
        int ans = missingNumber(arr);
        System.out.println("Answer :"+ans);
    }
}
