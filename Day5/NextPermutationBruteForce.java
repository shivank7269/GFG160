package Day5;
import java.util.*;

public class NextPermutationBruteForce {
    public static List<List<Integer>> generateAllPermutations(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), new boolean[nums.length], permutations);
        return permutations;
    }

    private static void backtrack(int[] nums, List<Integer> current, boolean[] used, List<List<Integer>> permutations) {
        if (current.size() == nums.length) {
            permutations.add(new ArrayList<>(current));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            used[i] = true;
            current.add(nums[i]);
            backtrack(nums, current, used, permutations);
            used[i] = false;
            current.remove(current.size() - 1);
        }
    }

    public static int[] nextPermutationBruteForce(int[] nums) {
        List<List<Integer>> permutations = generateAllPermutations(nums);
        Collections.sort(permutations, (a, b) -> {
            for (int i = 0; i < a.size(); i++) {
                if (!a.get(i).equals(b.get(i))) {
                    return Integer.compare(a.get(i), b.get(i));
                }
            }
            return 0;
        });

        for (int i = 0; i < permutations.size(); i++) {
            if (permutations.get(i).equals(toList(nums))) {
                if (i + 1 < permutations.size()) {
                    return toArray(permutations.get(i + 1));
                } else {
                    return toArray(permutations.get(0));
                }
            }
        }
        return nums;
    }

    private static List<Integer> toList(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        return list;
    }

    private static int[] toArray(List<Integer> list) {
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int[] result = nextPermutationBruteForce(nums);
        System.out.println(Arrays.toString(result)); // Output: [1, 3, 2]
    }
}
