class Solution {
    public int[] separateDigits(int[] nums) {
        String s = "";
        for (int n : nums) s += n;
        return s.chars().map(c -> c - '0').toArray();
    }
}
