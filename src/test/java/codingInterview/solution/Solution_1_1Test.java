package codingInterview.solution;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution_1_1Test {

    @Test
    void givenString_whenPermutationString_thenSuccess() {
        Solution_1_1 solution = new Solution_1_1();

        assertThat(solution.solution("abcde")).isTrue();
    }

    @Test
    void givenString_whenNotPermutationString_thenFail() {
        Solution_1_1 solution = new Solution_1_1();

        assertThat(solution.solution("abcdee")).isFalse();
    }
}