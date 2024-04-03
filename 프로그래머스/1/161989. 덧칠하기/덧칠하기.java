class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        int[] wall = new int[n];
        
        for(int i = 0; i < wall.length; i++) {
        	wall[i] = 0;
        }
        
        for(int a : section) {
        	wall[a - 1] = 1;
        }
        
        for(int i = 0; i < wall.length; i++) {
        	if(wall[i] == 1) {
        		for(int j = i; j < i + m; j++) {
        			if(j < wall.length) {
        				
        				wall[j] = 0;
        			}
        		}
        		answer++;
        	}
        }
        
        return answer;
    }
}