package leetcode.dsa;

public class FibonnaciTry {

	// 1, 1, 2, 3, 5, 8, 13
	public static void main(String[] args) {
		int target = 2;

		System.out.println("Fibonnaci number: " + findFibonnaci(target));
	}

	/**
	 * Returns the fibonnaci number at nth location
	 */
	private static int findFibonnaci(int n) {
		if (n < 2)
			return 1;

		return findFibonnaci(n - 1) + findFibonnaci(n - 2);
	}

}
