class Solution {
    public int maxDifference(String s) {
        int[] f = new int[26];
        for (char c : s.toCharArray()) f[c-'a']++;
        int odd = 0, even = 100;
        for (int x : f) {
            if (x % 2 == 1) odd = Math.max(odd, x);
            if (x > 0 && x % 2 == 0) even = Math.min(even, x);
        }
        return odd - even;
    }
}
