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

public class Solution_832 {

	public static int[][] flipAndInvertImage(int[][] A) {
		flipAndInvert(A);
		return A;

	}

	private static int[][] flipAndInvert(int[][] a) {
		// TODO Auto-generated method stub
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length / 2 + 1; j++) {
				int temp = a[i][j]^1;
				a[i][j] = a[i][a[i].length - j - 1]^1;
				a[i][a[i].length - j - 1] = temp;
			
			}

		}
		

		return a;
	}
	
	
	public static void main(String[] args) {
		int[][] A = {
				
				{1,1,0},
				{1,0,1},
				{0,0,0}
	
		};
		System.out.print(Arrays.deepToString(flipAndInvertImage(A)));
		
	
}
}
