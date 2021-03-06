package codingInterview.solution;

public class Solution_1_6 {

    public int[][] solution(int[][] matrix) {
        for (int layer = 0; layer < matrix.length / 2; layer++) {
            int first = layer;
            int last = matrix.length - 1 - layer;
            rotate(matrix, first, last);
        }

        return matrix;
    }

    public void rotate(int[][] matrix, int first, int last) {
        for (int i = first; i < last; i++) {
            int offset = i - first;

            int top = matrix[first][i];
            matrix[first][i] = matrix[last - offset][first];
            matrix[last - offset][first] = matrix[last][last - offset];
            matrix[last][last - offset] = matrix[i][last];
            matrix[i][last] = top;
        }
    }
}
