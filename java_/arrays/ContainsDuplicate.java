package java_.arrays;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && map.get(nums[i]) >= 1) {
                return true;
            }
            map.put(nums[i], 1);
            // map.put(nums[i], map.getOrDefault(nums[i], 0) + 1); // this approach is less efficient and slow
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate program = new ContainsDuplicate();
        System.out.println(program.containsDuplicate(new int[]{1, 1, 2, 3, 4, 5}));
        System.out.println(program.containsDuplicate(new int[]{1,2,3}));
    }
}