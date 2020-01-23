package codingInterview.solution;

public class Solution_1_7 {

    public int[][] solution(int[][] matrix) {
        boolean[] row = new boolean[matrix.length];
        boolean[] column = new boolean[matrix.length];

        checkZeros(matrix, row, column);
        setZeros(matrix, row, column);

        return matrix;
    }

    private void checkZeros(int[][] matrix, boolean[] row, boolean[] col) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
    }

    private void setZeros(int[][] matrix, boolean[] row, boolean[] col) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (row[i] || col[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
