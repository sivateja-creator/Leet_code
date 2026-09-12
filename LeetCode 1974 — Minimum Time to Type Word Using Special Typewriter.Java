class Solution {
    public int minTimeToType(String word) {
        int ans = 0, pos = 0;
        for (char c : word.toCharArray()) {
            int d = Math.abs(c - 'a' - pos);
            ans += Math.min(d, 26 - d) + 1;
            pos = c - 'a';
        }
        return ans;
    }
}
