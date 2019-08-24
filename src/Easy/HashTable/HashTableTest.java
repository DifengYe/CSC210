package Easy.HashTable;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sun.org.apache.bcel.internal.generic.NEW;

class HashTableTest {

	@Test
	void test() {
		Solution solution = new Solution();
		assertEquals(3, solution.numJewelsInStones1("aA", "aAAbbbb"));
	}
	
	@Test
	void repeatedNTimesTest() {
		Solution solution = new Solution();
		assertEquals(3, solution.repeatedNTimes(new int[] {1,2,3,3}));
		
		
	}

}
