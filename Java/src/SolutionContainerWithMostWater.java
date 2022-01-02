package src;

public class SolutionContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0, right = height.length -1, maxArea = 0;

        while ( left < right ) {
            int lh = height[left];
            int rh = height[right];

            maxArea = Math.max((right - left) * Math.min(lh, rh), maxArea);

            if ( lh > rh ) {
                right--;
            } else {
                left++;
            }
        }

        return maxArea;
    }
}
