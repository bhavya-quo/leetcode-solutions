package java.array;

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
                return new int[]{i, numsMap.get(complement)};
            }
            numsMap.put(nums[i], i);
        }
        return new int[]{};
    }
}