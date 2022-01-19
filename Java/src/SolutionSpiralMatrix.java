package src;

import java.util.ArrayList;
import java.util.List;

public class SolutionSpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();

        if (matrix.length == 0 || matrix[0].length == 0)
            return ans;

        int b = matrix.length - 1;
        int r = matrix[0].length - 1;
        int t = 0, l = 0;
        int dir = 0;

        int i = 0, j = 0;

        while (true) {
            ans.add(matrix[j][i]);
            if (dir == 0) {
                if (i + 1 <= r)
                    i++;
                else {
                    if (j + 1 <= b) {// can we change direction?
                        j++;
                        dir = 1;
                        t++; // narrow boundary
                    } else
                        break;
                }
            } else if (dir == 1) {
                if (j + 1 <= b)
                    j++;
                else {
                    if (i - 1 >= l) {// can we change direction?
                        i--;
                        dir = 2;
                        r--; // narrow boundary
                    } else
                        break;
                }
            } else if (dir == 2) {
                if (i - 1 >= l)
                    i--;
                else {
                    if (j - 1 >= t) {// can we change direction?
                        j--;
                        dir = 3;
                        b--; // narrow boundary
                    } else
                        break;
                }
            } else if (dir == 3) {
                if (j - 1 >= t)
                    j--;
                else {
                    if (i + 1 <= r) {// can we change direction?
                        i++;
                        dir = 0;
                        l++; // narrow boundary
                    } else
                        break;
                }
            }

        }
        return ans;
    }
}
