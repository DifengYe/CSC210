package Easy.Array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayTest {

	@Test
	void test() {
		Solution solution = new Solution();
		assertArrayEquals(new int[] {0,1,9,16,100}, solution.sortedSquares(new int[] {-4,-1,0,3,10}));
	}
	
	@Test
	void PairSumTest() {
		Solution solution = new Solution();
		assertEquals(4, solution.arrayPairSum(new int[] {1,4,3,2}));
		
	}
	@Test
	void heightChecker() {
		Solution solution = new Solution();
		assertEquals(3, solution.heightChecker(new int[] {1,1,4,2,1,3}));
	}
	
	

}
