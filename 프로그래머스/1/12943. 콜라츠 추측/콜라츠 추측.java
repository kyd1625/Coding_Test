class Solution {
    public int solution(int num) {
        int answer = 0;
        
        if(num == 1) {
        	return answer;
        }
        
        
        int temp = num;
        for(int i = 0; i < 500; i++) {
        	
        	if(temp == 1) {
        		return i;
        	}
        	
        	if(temp % 2 == 0) {
        		temp = temp/2;
        	} else if(temp % 2 == 1) {
        		temp = temp * 3 + 1;
        	}
        	
        	if(i == 499 && temp != 1) {
        		return -1;
        	}
        }
        
        return answer;
    }
}