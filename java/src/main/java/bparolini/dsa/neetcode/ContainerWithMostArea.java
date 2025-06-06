package bparolini.dsa.neetcode;

public class ContainerWithMostArea {
  public int maxArea(int[] height) {
    int left = 0;
    int right = height.length - 1;

    int maxArea = Math.min(height[left], height[left]) * (right - left);

    while (left < right) {
      if (height[left] < height[right]) {
        left++;
      } else {
        right--;
      }

      maxArea = Math.max(maxArea,
                         Math.min(height[left], height[left]) * (right - left));
    }

    return maxArea;
  }
}
