class Solution {
    public String removeDuplicates(String s) {
        StringBuilder ans = new StringBuilder();
        for (char c : s.toCharArray()) {
            int n = ans.length();
            if (n > 0 && ans.charAt(n - 1) == c)
                ans.deleteCharAt(n - 1);
            else
                ans.append(c);
        }
        return ans.toString();
    }
}
