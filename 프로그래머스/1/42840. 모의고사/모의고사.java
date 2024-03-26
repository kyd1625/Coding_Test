import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
         List<Integer> list = new ArrayList<>(); // 정답 갯수 세는곳
		for (int i = 0; i < 3; i++) {
			
			list.add(0);
		}
        
        int pattern[][] = { { 1, 2, 3, 4, 5 }, { 2, 1, 2, 3, 2, 4, 2, 5 }, { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 } };
        
        for(int i = 0; i < answers.length; i++) {
        	
        	for(int j = 0; j <pattern.length; j++) {
        		if (answers[i] == pattern[j][i % pattern[j].length]) {
					list.set(j, list.get(j) + 1); 
				}
        	}
        }
        
        int max = Collections.max(list);
		int result[] = new int[list.size()];
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == max) {
				result[count++] = i + 1;
			}
		}

		
		
		return Arrays.copyOf(result, count);
    }
}