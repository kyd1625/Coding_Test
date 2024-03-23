class Solution {
    public int[] solution(String[] park, String[] routes) {
        // 명령 무시 조건
        // 주어진 방향으로 이동할 때 공원을 벗어나는지 확인합니다.
        // 주어진 방향으로 이동 중 장애물을 만나는지 확인합니다.
        
        // S : 시작 지점
        // O : 이동 가능한 통로
        // X : 장애물
        
        // N : 북쪽으로
        // S : 남쪽으로
        // W : 서쪽으로
        // E : 동쪽으로
        
       char[][] map = new char[park.length][park[0].length()];
       int currentX = 0;
       int currentY = 0;
       
        
       for (int i = 0; i < park.length; i++) {
    	   for (int j = 0; j < park[0].length(); j++) {
    		   
    		   map[i][j] = park[i].charAt(j);
    		   
    		   if(park[i].charAt(j) == 'S') { // 시작 지점
    			   currentX = j;
    			   currentY = i;
    		   }
    		   
    	   }
       }
       
       
       for (int i = 0; i < routes.length; i++) {
    	   String direction = routes[i].split(" ")[0];
    	   String number 	= routes[i].split(" ")[1];
    	   int tempX = currentX;
    	   int tempY = currentY;
    	   if(direction.equals("N")) {
    		   
    		   tempY = tempY - Integer.parseInt(number);

    	   } else if (direction.equals("S")) {
    		   
    		   tempY = tempY + Integer.parseInt(number);
    		   
    	   } else if (direction.equals("W")) {
    		   
    		   tempX = tempX - Integer.parseInt(number);
    		   
    	   } else if (direction.equals("E")) {
    		   
    		   tempX = tempX + Integer.parseInt(number);
    		   
    	   }

    	   
    	   // 지도 밖으로 나오면 명령 취소
    	   if(tempX < 0 || tempY < 0) { continue; }
    	   if(tempX >= park[0].length() || tempY >= park.length) { continue; }
    	   
    	   boolean check = true;
    	   
    	   if(direction.equals("N")) {
    		   
    		   for(int k = tempY; k <= currentY; k++) {
    			   if(map[k][currentX] == 'X') {
    				   check = false;
    				   break;
    			   }
    		   }

    	   } else if (direction.equals("S")) {
    		   for(int k = currentY; k <= tempY; k++) {
    			   if(map[k][currentX] == 'X') {
    				   check = false;
    				   break;
    			   }
    		   }
    		   
    	   } else if (direction.equals("W")) {
    		   
    		   for(int k = tempX; k <= currentX; k++) {
    			   if(map[currentY][k] == 'X') {
    				   check = false;
    				   break;
    			   }
    		   }
    		   
    	   } else if (direction.equals("E")) {
    		   
    		   for(int k = currentX; k <= tempX; k++) {
    			   if(map[currentY][k] == 'X') {
    				   check = false;
    				   break;
    			   }
    		   }
    		   
    	   }
    	   
    	   if(check) {
    		   
    		   currentX = tempX;
    		   currentY = tempY;
    		   
    	   }
       }
       
      
       int[] answer = {currentY, currentX};
       
        
        return answer;
    }
}