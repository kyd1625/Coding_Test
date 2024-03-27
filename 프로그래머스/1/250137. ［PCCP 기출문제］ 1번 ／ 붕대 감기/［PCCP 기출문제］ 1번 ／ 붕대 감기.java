class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = health;
        
        int allTime = attacks[attacks.length-1][0]; // 전체 시간
        
        int tempTime = 0;
        
        
        for(int i = 1; i <= allTime; i++) {
        	
        	
        	for(int j = 0; j < attacks.length; j++) {
        		
        		if(i == attacks[j][0]) {
        			answer -= attacks[j][1];
        			tempTime = i;
        			if(answer <= 0) {
        				return -1;
        			}
        		} 
        		
        	}
        	
        	if(i != tempTime) {
        		answer += bandage[1]; // 회복
    			if(i == (bandage[0] + tempTime)) {
    				answer += bandage[2];
    				tempTime = i;
    			}
    			
    			if(answer > health) { // 최대 체력 유지
    				answer = health;
    			}
        	}
        	
        }
        
        
        return answer;
    }
}