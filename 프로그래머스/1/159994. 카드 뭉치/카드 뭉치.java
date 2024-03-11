class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int i = 0;
        int j = 0;
        
        for(String temp : goal) {
        	if(temp.equals(cards1[i])) {	
        		if(i < cards1.length - 1) {
        			i++;
        		}
        	} else if (temp.equals(cards2[j])) {
        		if(j < cards2.length - 1) {
        			j++;
        		}
        	} else {
        		return "No";
        	}
        }
        
        return "Yes";
    }
}