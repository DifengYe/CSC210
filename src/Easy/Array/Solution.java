package Easy.Array;

import java.util.Arrays;

/*
 Given a binary matrix A, we want to flip the image horizontally, then invert it, 
 and return the resulting image.

 To flip an image horizontally means that each row of the image is reversed. 
 For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].

 To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0. 
 For example, inverting [0, 1, 1] results in [1, 0, 0].
 
 */

public class Solution {

	// 832
	public static int[][] flipAndInvertImage(int[][] A) {
		flipAndInvert(A);
		return A;

	}

	private static int[][] flipAndInvert(int[][] a) {
		// TODO Auto-generated method stub
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length / 2 + 1; j++) {
				int temp = a[i][j] ^ 1;
				a[i][j] = a[i][a[i].length - j - 1] ^ 1;
				a[i][a[i].length - j - 1] = temp;

			}

		}

		return a;
	}

	// My version
	public int[] sortArrayByParity(int[] A) {
		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 == 1) {
				for (int j = i; j < A.length; j++) {
					if (A[j] % 2 == 0) {
						int temp = A[i];
						A[i] = A[j];
						A[j] = temp;

					}

				}

			}
		}

		return A;

	}
	// sortArrayByParity Solution1

	public int[] sortArrayByParity1(int[] A) {
		Integer[] B = new Integer[A.length];
		for (int t = 0; t < A.length; ++t)
			B[t] = A[t];// finish the cast

		Arrays.sort(B, (a, b) -> Integer.compare(a % 2, b % 2));// using Integer's compare

		for (int t = 0; t < A.length; ++t)
			A[t] = B[t];
		return A;

	}

	// sortArrayByParity Solution2

	public int[] sortArrayByParity2(int[] A) {
		int idx = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 == 0) {
				int temp = A[idx];
				A[idx++] = A[i];
				A[i] = temp;
			}
		}
		return A;
	}

	public int[] sortedSquares(int[] A) {

		int[] B = new int[A.length];

		for (int i = 0; i < B.length; i++) {
			B[i] = A[i] * A[i];
		}
		Arrays.sort(B);

		return B;

	}

	public int arrayPairSum(int[] nums) {
		Arrays.sort(nums);
		
		return helperPairSum(nums,0);
		

	}

	private int helperPairSum(int[] nums, int i) {
		// TODO Auto-generated method stub
		if(i>=nums.length) {
			return 0;
		}else {
			if(nums[i]>nums[i+1]) {
				return nums[i+1]+helperPairSum(nums,i+2);
			}else {
				
				return nums[i]+helperPairSum(nums,i+2);
			}
			
		}
	}
	
	 public int heightChecker(int[] heights) {
		 int[] sortHeights = Arrays.copyOf(heights, heights.length);
		 Arrays.sort(sortHeights);
		 int sum=0;
		 for(int i =0;i<heights.length;i++) {
			 if(heights[i]!=sortHeights[i]) {
				 sum++;
			 } 
		 }
		 
		 return sum;
	    }

	public static void main(String[] args) {

		Solution solution = new Solution();
		int[][] A = {

				{ 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 }

		};
		// System.out.print(Arrays.deepToString(flipAndInvertImage(A)));
		System.out.print(Arrays.toString(solution.sortArrayByParity(new int[] { 3, 1, 2, 4 })));
	}
}
