class Solution {
    public int numberOfSpecialChars(String word) {
        int count = 0;
        for (char c = 'a'; c <= 'z'; c++)
            if (word.indexOf(c) >= 0 && word.indexOf(Character.toUpperCase(c)) >= 0) count++;
        return count;
    }
}
