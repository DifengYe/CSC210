package Easy.HashTable;

import java.util.Hashtable;


public class Solution {

	public int numJewelsInStones(String J, String S) {
		Hashtable<Character, Integer> hashtable = new Hashtable<Character, Integer>();

		for (int i = 0; i < S.length(); i++) {
			char stone = S.charAt(i);
			for (int j = 0; j < J.length(); j++) {
				char jewly = J.charAt(j);
				if (stone == jewly) {
					if (hashtable.containsKey(stone)) {
						hashtable.put(stone, hashtable.get(stone) + 1);

					} else {

						hashtable.put(stone, 1);
					}

				}

			}

		}
		
		int sum= 0;
		for(int f: hashtable.values()) {
			sum+=f;
		}

		return sum;

	}
	
	/*****numJewelsInStonesShort******/
	
	public int numJewelsInStones1(String J, String S) {
		int jewels = 0;
		char[] chArr = S.toCharArray();
		    for (int i = 0; i < chArr.length; i++) {
		        if(J.indexOf(chArr[i]) != -1) {
		            jewels++;
		        }
		    }
		    return jewels;
		}
		
    public int repeatedNTimes(int[] A) {
        Hashtable<Integer, Integer> map = new Hashtable<Integer, Integer>();
        for(int i: A) {
        	if(map.containsKey(i)) {
        		return i;
        	}else {
        		
        		map.put(i,1);
        	}
        }
        
        return -1;
    }
    
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
