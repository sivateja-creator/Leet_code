class Solution {
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int n : nums) if (n == nums[i]) count++;
            if (count == 1) sum += nums[i];
        }
        return sum;
    }
}
