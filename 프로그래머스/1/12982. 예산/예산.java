import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
       int answer = 0;

        Arrays.sort(d);
        for(int i = 0; i < d.length; i++) {
        	if(budget > 0) {
        		budget = budget - d[i];
        		if(budget < 0) {
        			return answer;
        		}
        		answer++;
        	} else if (budget < 0) {
        		return answer;
        	}
        }
        
        return answer;
    }
}