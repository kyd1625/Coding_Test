import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
       int[] answer = new int[2];
        
        int count = 0;
        for(int i = 0; i < lottos.length; i++) {
        	for(int j = 0; j < win_nums.length; j++) {
        		if(lottos[i] != 0 && lottos[i] == win_nums[j]) {
        			count++;
        			break;
        		}
        	}
        }
        
        // 최소 값 도출 완료
        
        int maxCount = 0;
        for(int i = 0; i < lottos.length; i++) {
        	if(lottos[i] == 0) {
        		maxCount++;
        	}
        }
        
        // 최대 값 도출 완료
        
        Map<Integer, Integer> rank = new HashMap<>();
        rank.put(6, 1);
        rank.put(5, 2);
        rank.put(4, 3);
        rank.put(3, 4);
        rank.put(2, 5);
        rank.put(1, 6);
        rank.put(0, 6);
        
        answer[0] = rank.get(count + maxCount);
        answer[1] = rank.get(count);
        
        return answer;
    }
}