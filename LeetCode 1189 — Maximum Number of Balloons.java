class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] c = new int[26];
        for (char x : text.toCharArray()) c[x - 'a']++;
        return Math.min(Math.min(c['b'-'a'], c['a'-'a']),
               Math.min(c['l'-'a']/2, Math.min(c['o'-'a']/2, c['n'-'a'])));
    }
}
