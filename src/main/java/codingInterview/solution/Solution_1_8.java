package codingInterview.solution;

public class Solution_1_8 {

    public boolean solution(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        String combinedStr = s + s;
        return combinedStr.contains(t);
    }

    public int rotationIndexOf(String s, String t) {
        String combinedStr = s + s;

        return combinedStr.indexOf(t);
    }
}
