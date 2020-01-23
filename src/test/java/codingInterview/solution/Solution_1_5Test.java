package codingInterview.solution;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution_1_5Test {

    @Test
    void givenString_thenZippedString() {
        Solution_1_5 solution = new Solution_1_5();

        assertThat(solution.solution("aabccccccccaaa")).isEqualTo("a2bc8a3");
        assertThat(solution.solution("a")).isEqualTo("a");
    }
}