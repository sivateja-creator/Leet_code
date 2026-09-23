class Solution {
    public int maxProduct(int[] nums) {
        java.util.Arrays.sort(nums);
        int n = nums.length;
        return (nums[n - 1] - 1) * (nums[n - 2] - 1);
    }
}
