class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i += 3) {
            java.util.HashSet<Integer> s = new java.util.HashSet<>();
            for (int j = i; j < nums.length; j++)
                if (!s.add(nums[j])) break;
                else if (j == nums.length - 1) return count;
            count++;
        }
        return count;
    }
}
