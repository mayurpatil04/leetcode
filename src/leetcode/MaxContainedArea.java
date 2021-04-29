package leetcode;

public class MaxContainedArea {

	public static int maxArea(int[] height) {
		int leftIndex = 0;
		int rightIndex = height.length - 1;
		int maxArea = 0;

		while (leftIndex < rightIndex) {
			int minheight = Math.min(height[leftIndex], height[rightIndex]);
			maxArea = Math.max(maxArea, (rightIndex - leftIndex) * minheight);
			if (height[leftIndex] < height[rightIndex]) {
				leftIndex++;
			} else {
				rightIndex--;
			}
		}
		return maxArea;
	}

	public static void main(String[] args) {
		int[] heights = {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(heights));
	}
}
