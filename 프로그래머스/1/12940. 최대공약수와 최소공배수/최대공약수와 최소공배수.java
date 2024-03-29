class Solution {
    public int[] solution(int n, int m) {
       int[] answer = new int[2];
        
        int min = 0;
        int max = 0;
        
        for(int i = 1; i <= n; i++) {
        	if(n % i == 0 && m % i == 0) {
        		min = i;
        	}
        }
        max = n*m/min;
        
        answer[0] = min;
        answer[1] = max;
        
        return answer;
    }
}