package codingInterview.solution;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution_1_2Test {

    @Test
    void givenString_whenUniqueString_thenSuccess() {
        Solution_1_1 solution_1_1 = new Solution_1_1();

        assertThat(solution_1_1.solution("abcd")).isTrue();
    }

    @Test
    void givenString_whenNotUniqueString_thenFail() {
        Solution_1_1 solution_1_1 = new Solution_1_1();

        assertThat(solution_1_1.solution("abcdd")).isFalse();
    }
}