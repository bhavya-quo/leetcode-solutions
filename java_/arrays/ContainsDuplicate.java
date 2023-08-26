package java_.arrays;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num) && map.get(num) >= 1) {
                return true;
            }
            map.put(num, 1);
            // map.put(nums[i], map.getOrDefault(nums[i], 0) + 1); // this approach is less efficient and slow
        }
        return false;
    }
}
// generate test cases for above code
class ContainsDuplicateTest {
    public static void main(String[] args) {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int[] nums1 = {1, 2, 3, 1};
        System.out.println(containsDuplicate.containsDuplicate(nums1));
        int[] nums2 = {1, 2, 3, 4};
        System.out.println(containsDuplicate.containsDuplicate(nums2));
        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(containsDuplicate.containsDuplicate(nums3));
    }
}