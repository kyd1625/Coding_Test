class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        
        String startColor = board[h][w];
        
        String[] deraction = {"N", "E", "W", "S"}; 
        
        int temp = 0;
        
        boolean check = true;
        
        for(int i = 0; i < deraction.length; i++) {
        	switch(deraction[i]) {
        	case "S" : temp = -1; // 북 h
        	break;
        	case "W" : temp = -1; // 서 w
        	break;
        	case "N" : temp = 1;  // 남 h
        	break;
        	case "E" : temp = 1; // 동 w
        	break;
        	}
        	
        	
        	
        	
        		if(deraction[i].equals("S") || deraction[i].equals("N")) {
        			
        			if(h + (1 * temp) < 0 || h + (1 * temp) >= board.length) {
        				continue;
        			}
        			
            		if(board[h + (1*temp)][w].equals(startColor)) {
            			answer++;
            		}
            	} else if (deraction[i].equals("W") || deraction[i].equals("E")) {
            		
            		if(w + (1 * temp) < 0 || w + (1 * temp) >= board[0].length) {
        				continue;
        			}
            		
            		if(board[h][w + (1*temp)].equals(startColor)) {
            			answer++;
            		}
            	}
        	}
        	
        
        return answer;
    }
}