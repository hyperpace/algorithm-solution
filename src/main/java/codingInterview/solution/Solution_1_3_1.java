package codingInterview.solution;

import java.util.Arrays;

/*
 * 문제 1.3
 * 문자열 두 개를 입력으로 받아 그 중 하나가 다른 하나의 순열인지 판별하는 메서드를 작성하라.
 * */
public class Solution_1_3_1 {

    public boolean solution(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        return sort(s).equals(sort(t));
    }

    public String sort(String str) {
        char[] content = str.toCharArray();
        Arrays.sort(content);

        return new String(content);
    }
}
