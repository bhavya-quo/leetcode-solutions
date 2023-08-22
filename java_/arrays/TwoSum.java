package java_.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    // This is a brute force solution with O(n^2) time complexity. We can do better
    public int[] twoSum_bruteForce(int[] nums, int target) {
        for(int i=0; i< nums.length - 1; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public int[] twoSum_twoPassHashTable(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();

        // Populate the map with number and index
        for (int i = 0; i < nums.length; i++) {
            numsMap.put(nums[i], i); // key -> number, value -> index
        }

        // Check the map for complement
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numsMap.containsKey(complement) && numsMap.get(complement) != i) {
                return new int[]{i, numsMap.get(complement)};
            }
        }
        return new int[]{};
    }

    // more optimal solution using one pass hash table
    public int[] twoSum_onePassHashTable(int[] nums, int target) {
        HashMap<Integer, Integer> numsMap = new HashMap<>();
        int n = nums.length;

        for (int i=0; i < n; i++) {
            int complement = target - nums[i];
            if(numsMap.containsKey(complement)) {
                return new int[]{numsMap.get(complement),i};
            }
            numsMap.put(nums[i], i);
        }
        return new int[]{};
    }
    // write unit tests for above code
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result1 = twoSum.twoSum_bruteForce(nums, target);
        System.out.println(result1[0] + " " + result1[1]);

        int[] result2 = twoSum.twoSum_twoPassHashTable(nums, target);
        System.out.println(result2[0] + " " + result2[1]);

        int[] result3 = twoSum.twoSum_onePassHashTable(nums, target);
        System.out.println(result3[0] + " " + result3[1]);
    }
}