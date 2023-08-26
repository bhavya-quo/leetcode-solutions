package java_.arrays;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int insertIndex = 1;
        for (int i = 1; i < n; i++) {
            if(nums[i] != nums[i-1]) {
                nums[insertIndex] = nums[i];
                insertIndex++;
            }
        }
        return insertIndex;
    }
}

// create test cases for removeDuplicates method
class RemoveDuplicatesFromSortedArrayTest {
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int result = removeDuplicatesFromSortedArray.removeDuplicates(nums);
        System.out.println(result);
    }
}