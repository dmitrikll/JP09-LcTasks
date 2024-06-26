package task02;

import java.util.Arrays;

public class Duplicate {

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i += 1) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }
}
