public class Solution {
    public int jump(int[] nums) {
        int[] stepOut = new int[nums.length];
        stepOut[nums.length-1] = 0;
        for (int i = nums.length - 2; i >= 0; i--) {
            stepOut[i] = step(nums, i, stepOut);
        }
        return stepOut[0];
    }
    
    private int step(int[] nums, int curr, int[] stepOut) {
        if (curr+nums[curr] >= nums.length - 1) {
            return 1;
        }
        int result = nums.length;
        for (int i = curr + nums[curr]; i >= curr + 1; i--) {
            if (stepOut[i] < result) {
                result = stepOut[i];
            }
            if (result == 0) {
                return 1;
            }
        }
        return result + 1;
    }
}
