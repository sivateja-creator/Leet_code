class Solution {
    public int[] leftRightDifference(int[] nums) {
        int total = 0, left = 0;
        for (int n : nums) total += n;
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = Math.abs(left - (total - left - nums[i]));
            left += nums[i];
        }
        return ans;
    }
}
