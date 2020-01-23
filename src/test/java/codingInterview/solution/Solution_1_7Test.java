package codingInterview.solution;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class Solution_1_7Test {

    @Test
    void givenMatrix_whenZeroValue_thenThatRowColValueSetZero() {
        Solution_1_7 solution = new Solution_1_7();

        int[][] matrix = {{0, 0, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] changeMatrix = {{0, 0, 0}, {0, 0, 0}, {0, 0, 1}};

        printMatrix(matrix);
        assertThat(solution.solution(matrix)).isEqualTo(changeMatrix);
        printMatrix(matrix);
    }

    public void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println();
    }
}