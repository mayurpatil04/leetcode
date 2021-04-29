package leetcode.dsa;

public class BinarySearch {

	public static void main(String[] args) {
		int[] sortedArray = { -13, -7, 0, 1, 7, 9, 11, 18, 24, 29, 31, 46, 54 };
		int target = 4;

		System.out.println("location: " + findTarget(sortedArray, target));
	}

	private static int findTarget(int[] sortedArray, int target) {
		int left = 0;
		int right = sortedArray.length - 1;
		while (left <= right) {

			int mid = (left + right) / 2;
			System.out.println(String.format("left: %s, right: %s, mid: %s", left, right, mid));
			if (sortedArray[mid] == target) {
				return mid;
			}

			if (sortedArray[mid] < target)
				left = mid + 1;
			else
				right = mid - 1;
		}
		return -1;
	}

}
