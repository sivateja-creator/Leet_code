import java.util.*;

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for (String s : operations)
            if (s.equals("+")) st.push(st.peek() + st.get(st.size() - 2));
            else if (s.equals("D")) st.push(2 * st.peek());
            else if (s.equals("C")) st.pop();
            else st.push(Integer.parseInt(s));
        return st.stream().mapToInt(i -> i).sum();
    }
}