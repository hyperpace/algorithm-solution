package codingInterview.solution;

import java.util.HashSet;
import java.util.Set;

/*
* 문제 1.1
* 문자열에 포함된 문자들이 전부 유일한지를 검사하는 알고리즘을 구현하라.
* 다른 자료구조를 사용할 수 없는 상황이라면 어떻게 하겠는가?
* */
public class Solution_1_1 {

    public boolean solution(String str) {
        Set<Character> characters = new HashSet<>();

        char[] toCharArray = str.toCharArray();
        for (char letter: toCharArray) {
            characters.add(letter);
        }

        return characters.size() == toCharArray.length;
    }
}
