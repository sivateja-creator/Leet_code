class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] ans = new int[nums.length];
        int l = 0, r = nums.length - 1;
        for (int n : nums)
            if (n % 2 == 0) ans[l++] = n;
            else ans[r--] = n;
        return ans;
    }
}
