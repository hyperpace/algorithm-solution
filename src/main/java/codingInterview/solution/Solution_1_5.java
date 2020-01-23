package codingInterview.solution;

/*
* 같은 문자가 연속으로 반복될 경우, 그 횟수를 사용해 문자열을 압축하는 메서드를 구현하라.
* aabccccccccaaa -> a2b1c8a3
* */
public class Solution_1_5 {

    public String solution(String str) {
        StringBuilder sb = new StringBuilder();
        char last = str.charAt(0);
        int repeatedCount = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == last) {
                repeatedCount++;
            } else {
                sb.append(compressCharacter(last, repeatedCount));
                last = str.charAt(i);
                repeatedCount = 1;
            }
        }
        sb.append(compressCharacter(last, repeatedCount));

        return sb.toString();
    }

    public String compressCharacter(char c, int count) {
        if (count == 1) {
            return String.valueOf(c);
        }

        return String.valueOf(c) + count;
    }
}
