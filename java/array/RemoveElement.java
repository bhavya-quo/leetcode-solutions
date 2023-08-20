package java.array;
public class RemoveElement {
    // Initial solution - too complicated - ignore
    public int removeElement1(int[] nums, int val) {
         int i = 0;
         int j = nums.length - 1;
         while (i <= j && i < nums.length && j >= 0) {
             if (nums[i] == val) {
                 if (nums[j] != val) {
                     nums[i] = nums[j];
                     i++;
                     j--;
                 } else {
                     j--;
                 }
             } else {
                 i++;
             }
         }
         return i;
    }
    // Optimal solution
    public int removeElement2(int[] nums, int val) {
        int index = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}