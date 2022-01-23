package src;

@LeetCodeInformation(Number = 73, Url = "https://leetcode.com/problems/set-matrix-zeroes/")
public class SolutionSetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean colSet = false;

        for (int i = 0; i < m; i++) {
            if ( matrix[i][0] == 0)
                colSet = true;
            // we can skip j = 0, since j row 0 will change colSet
            for (int j = 1; j < n; j++) {
                if ( matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if ( matrix[i][0] == 0 || matrix[0][j] == 0)
                matrix[i][j] = 0;
            }
        }

        for (int j = 1; j < n; j++) {
            if ( matrix[0][0] == 0 )
                matrix[0][j] = 0;
        }

        // i start from 0, remember that we use colSet, so matrix[0][0] is undetermined
        for (int i = 0; i < m; i++) {
            if ( colSet )
                matrix[i][0] = 0;
        }
    }
}
