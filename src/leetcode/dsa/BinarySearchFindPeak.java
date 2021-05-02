package leetcode.dsa;

public class BinarySearchFindPeak {

	public static void main(String[] args) {
		int[] array = { 1, 1, 1, 1, 5, 6, 4 };

		int loc = findPeak(array);
		System.out.println("peak location: " + loc + ", peak: " + array[loc]);
	}

	private static int findPeak(int[] array) {
		int left = 0;
		int right = array.length - 1;
		while (left < right) {

			int mid = left + (right - left) / 2;
			System.out.println(String.format("left: %s, right: %s, mid: %s", left, right, mid));
//			if (array[mid] == target) {
//				return mid;
//			}

			if (array[mid] < array[mid + 1]) {
				if (mid > 1 && array[mid] > array[mid - 1]) {
					return mid;
				}
				left = mid + 1;
			} else {
				if (mid + 1 < array.length && mid > 1 && array[mid] > array[mid + 1] && array[mid] > array[mid - 1]) {
					return mid;
				}
				right = mid;
			}
		}
		return left;
	}

}
