class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3) return false;
        boolean v = false, c = false;
        for (char x : word.toLowerCase().toCharArray()) {
            if (!Character.isLetterOrDigit(x)) return false;
            if ("aeiou".indexOf(x) >= 0) v = true;
            else if (Character.isLetter(x)) c = true;
        }
        return v && c;
    }
}
