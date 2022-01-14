package src;

public class SolutionRotateImage {
    public void rotate(int[][] matrix) {
        int n = matrix.length - 1; // 3 = 2, 4 = 3

        for (int i = 0; i <= n / 2; i++) { // 2/2 = 1, need 2 loop 3 / 2 = 1 need 2 loop
            for (int j = i; j < n - i; j++) {
                int v = matrix[i][j];
                // i, j  (n-j, i) (n-i n-j) (j, n-i)
                matrix[i][j] = matrix[n-j][i];
                matrix[n-j][i] = matrix[n-i][n-j];
                matrix[n-i][n-j] = matrix[j][n-i];
                matrix[j][n-i] = v;
            }
        }
    }
}
