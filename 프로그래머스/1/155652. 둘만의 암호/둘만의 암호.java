class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        
        for(int i = 0; i < s.length(); i++) {
        	char temp = s.charAt(i);
        	for(int j = 1; j <= index; j++) {
        		temp += 1;
        		if(temp > 122) {
        			temp = 97;
        		}
        		for(int k = 0; k < skip.length(); k++) {
        			if(skip.charAt(k) == temp) {
        				j--;
        				break;
        			}
        		}
        	}
        	answer += temp;
        }
        
        return answer;
    }
}