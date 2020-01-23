package codingInterview.solution;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution_1_3_2Test {

    @Test
    void givenTwoString_thenIsPermutation() {
        Solution_1_3_2 solution = new Solution_1_3_2();

        assertThat(solution.solution("god", "dog")).isTrue();
    }

    @Test
    void givenTwoString_thenIsNotPermutation() {
        Solution_1_3_2 solution = new Solution_1_3_2();

        assertThat(solution.solution("god", "doog")).isFalse();
    }
}