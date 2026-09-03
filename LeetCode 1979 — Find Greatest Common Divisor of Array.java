class Solution {
    public int findGCD(int[] nums) {
        int a = nums[0], b = nums[0];
        for (int n : nums) {
            a = Math.min(a, n);
            b = Math.max(b, n);
        }
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}
