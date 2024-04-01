

import java.util.HashSet;
import java.util.Set;


class Solution {
	public int solution(int[] nums) {
		Set<Integer> set = new HashSet<Integer>(); // SET은 중복 정리
		
		for(int val : nums) {
			set.add(val);
		}
		
		if(set.size() < nums.length / 2) {
			return set.size();
		} else {
			return nums.length / 2;
		}
		
	}
	
}
