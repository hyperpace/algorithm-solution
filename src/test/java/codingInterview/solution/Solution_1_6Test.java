package codingInterview.solution;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class Solution_1_6Test {

    @Test
    void givenMatrix_thenRotateMatrix() {
        Solution_1_6 solution = new Solution_1_6();
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] rotatedMatrix = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};

        printMatrix(matrix);
        assertThat(solution.solution(matrix)).isEqualTo(rotatedMatrix);
        printMatrix(matrix);
    }

    public void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println();
    }
}