package codingInterview.solution;

import java.util.HashMap;
import java.util.Map;

/*
 * 문자열 두 개를 입력으로 받아 그중 하나가 다른 하나의 순열인지 판별하는 메서드를 작성하라.
 * */
public class Solution_1_3_2 {

    private Map<Character, Integer> letters = new HashMap<>();

    public boolean solution(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        for (char c : s.toCharArray()) {
            if (!letters.containsKey(c)) {
                letters.put(c, 0);
            }
            letters.put(c, letters.get(c) + 1);
        }

        for (char c : t.toCharArray()) {
            if (!letters.containsKey(c) || letters.get(c) - 1 < 0) {
                return false;
            }
            letters.put(c, letters.get(c) - 1);
        }

        return true;
    }
}
