package codingInterview.solution;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Solution_1_3_1Test {

    @Test
    void givenTwoString_thenIsPermutation() {
        Solution_1_3_1 solution = new Solution_1_3_1();

        assertThat(solution.solution("god", "dog")).isTrue();
    }

    @Test
    void givenTwoString_thenIsNotPermutation() {
        Solution_1_3_1 solution = new Solution_1_3_1();

        assertThat(solution.solution("god", "doog")).isFalse();
    }
}