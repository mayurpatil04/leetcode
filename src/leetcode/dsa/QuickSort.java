package leetcode.dsa;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] array = { -12, 4, 5, -2, 3, 8, -9, -8, -10, 28, 54, 26, -7 };
		quickSort(array, 0, array.length - 1);
		System.out.println("sorted: " + Arrays.toString(array));
	}

	private static void quickSort(int[] array, int left, int right) {

		if (left >= right)
			return;
		int pivotIndex = partition(array, left, right);
		quickSort(array, left, pivotIndex - 1);
		quickSort(array, pivotIndex + 1, right);
	}

	private static int partition(int[] array, int left, int right) {
		int pivot = array[right];
		int i = left;
		for (int j = left; j < right; j++) {
			if (array[j] < pivot) {
				int temp = array[j];
				array[j] = array[i];
				array[i] = temp;
				i++;
			}
		}
		int temp = array[right];
		array[right] = array[i + 1];
		array[i + 1] = temp;

		System.out.println(String.format("pivot: %s, left: %s, right: %s, array - %s", pivot, left, right,
				Arrays.toString(array)));
		return i + 1;
	}

}
