package MatrixProblems;

import java.util.*;

public class SpiralTraversalMatrix {

	public static void main(String args[]) {
		int mat[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		List<Integer> ans = printSpiral(mat);

		for (int i = 0; i < ans.size(); i++) {
			System.out.println(ans.get(i) + " ");
		}
		System.out.println();
	}

	public static List<Integer> printSpiral(int[][] mat) {
		List<Integer> ans = new ArrayList<>();

		int n = mat.length; // rows
		int m = mat[0].length; // columns

		int left = 0, top = 0, right = m - 1, bottom = n - 1;

		while (left <= right && top <= bottom) {

			// for left to right
			for (int i = left; i <= right; i++) {
				ans.add(mat[top][i]);
			}
			top++;

			// for top to bottom
			for (int i = top; i <= bottom; i++) {
				ans.add(mat[i][right]);
			}
			right--;

			if (top <= bottom) {
				// for right to left
				for (int i = right; i >= left; i--) {
					ans.add(mat[bottom][i]);
				}
				bottom--;
			}

			if (left <= right) {
				// for bottom to top
				for (int i = bottom; i >= top; i--) {
					ans.add(mat[i][left]);
				}
				left++;
			}
		}

		return ans;
	}
}