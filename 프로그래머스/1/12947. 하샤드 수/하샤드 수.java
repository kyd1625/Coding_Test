class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        
        String str = String.valueOf(x);
        
        int a = 0;
        
        for(int i = 0; i < str.length(); i++) {
        	a += Character.getNumericValue(str.charAt(i));
        }
        
        if(x % a == 0) {
        	answer = true;
        }
        
        return answer;
    }
}