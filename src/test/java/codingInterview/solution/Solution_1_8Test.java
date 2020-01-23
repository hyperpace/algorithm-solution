package codingInterview.solution;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution_1_8Test {

    @Test
    void givenString_thenIsRotationString() {
        Solution_1_8 solution = new Solution_1_8();

        String s = "waterbottle";
        String t = "erbottlewat";

        assertThat(solution.solution(s, t)).isTrue();
    }

    @Test
    void givenString_thenIsRotationIndex() {
        Solution_1_8 solution = new Solution_1_8();

        String s = "waterbottle";
        String t = "erbottlewat";

        System.out.println(solution.rotationIndexOf(s, t));
    }
}