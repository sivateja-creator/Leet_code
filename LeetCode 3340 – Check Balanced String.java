class Solution {
    public boolean isBalanced(String num) {
        int a = 0, b = 0;
        for (int i = 0; i < num.length(); i++)
            if (i % 2 == 0) a += num.charAt(i) - '0';
            else b += num.charAt(i) - '0';
        return a == b;
    }
}
