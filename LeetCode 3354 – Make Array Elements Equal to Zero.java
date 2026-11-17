class Solution {
    public int countValidSelections(int[] nums) {
        int sum = 0, left = 0, ans = 0;
        for (int x : nums) sum += x;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (left == sum - left) ans += 2;
                else if (Math.abs(left - (sum - left)) == 1) ans++;
            }
            left += nums[i];
        }
        return ans;
    }
}
