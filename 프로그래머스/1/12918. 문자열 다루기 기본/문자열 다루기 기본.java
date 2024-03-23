class Solution {
    public boolean solution(String s) {
        boolean answer = false;
		
		if(s.length() == 4 || s.length() == 6) {
			
			for(int i = 0; i < s.length(); i++) {
				int temp = s.charAt(i);
				if(temp > 58) {
					return answer;
				} 
			}
			return true;
		}
		
		
		
		return answer;
    }
}